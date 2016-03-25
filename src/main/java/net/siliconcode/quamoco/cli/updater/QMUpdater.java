/**
 * The MIT License (MIT)
 *
 * Sonar Quamoco Plugin
 * Copyright (c) 2015 Isaac Griffith, SiliconCode, LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.siliconcode.quamoco.cli.updater;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Stack;

import com.google.common.collect.Maps;

import net.siliconcode.quamoco.cli.qmodel.QualityCharacteristic;
import net.siliconcode.quamoco.cli.qmodel.Repository;
import net.siliconcode.quamoco.cli.qmodel.Sqale;
import net.siliconcode.quamoco.distiller.ModelDistiller;
import net.siliconcode.quamoco.distiller.QualityModelUtils;
import net.siliconcode.quamoco.model.qm.QualityModel;
import net.siliconcode.sonar.quamoco.profiles.xml.QuamocoProfile;
import net.siliconcode.sonar.quamoco.profiles.xml.RuleRepo;
import net.siliconcode.sonar.quamoco.rules.RuleSet;
import net.siliconcode.sonar.quamoco.rules.xml.Rule;

/**
 * QMUpdater -
 *
 * @author Isaac Griffith
 *
 */
public abstract class QMUpdater {

    protected Map<String, Repository>   repoMap;    // Repositories indexed by their names
    protected Map<String, Rule>         ruleMap;    // Rules index by their keys
    protected Map<String, QualityModel> modelMap; // Quality models indexed by name
    protected Sqale                     sqale;

    /**
     * 
     */
    public QMUpdater() {
        repoMap = Maps.newHashMap();
        ruleMap = Maps.newHashMap();
        sqale = new Sqale();
    }

    /**
     * 
     */
    public void execute() {
        final ModelDistiller dqm = new ModelDistiller();
        dqm.setLanguage(getLanguage());
        dqm.buildGraph(null);

        loadRules();
        loadRepositories();

        setModels(QualityModelUtils.createModelMap(dqm.getModelList()));

        updateModels();

        generateProfiles();
    }

    /**
     * @param files
     */
    public void readRules(final String[] files) {
        for (final String file : files) {
            try {
                final RuleSet set = RuleSet.readXML(new FileInputStream(file));

                for (final Rule r : set.getRules()) {
                    ruleMap.put(r.key(), r);
                }
            }
            catch (final FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    /**
     * @param sqale
     */
    public void aggregateRepositories(final Sqale sqale) {
        this.sqale = sqale;

        final Stack<QualityCharacteristic> qcs = new Stack<>();
        qcs.addAll(sqale.getCharacteristics());

        while (!qcs.isEmpty()) {
            final QualityCharacteristic qc = qcs.pop();

            qcs.addAll(qc.getSubCharacteristics());

            for (final Repository repo : qc.getRuleRepos()) {
                Repository r = repoMap.get(repo.getName());
                if (r == null) {
                    r = new Repository(repo.getName());
                    repoMap.put(repo.getName(), r);
                }

                r.addRules(repo.getRules());
            }
        }
    }

    /**
     * 
     */
    public abstract void loadRules();

    /**
     * 
     */
    public abstract void loadRepositories();

    /**
     * @return
     */
    public abstract String getLanguage();

    /**
     * @param modelMap
     */
    public void setModels(final Map<String, QualityModel> modelMap) {
        if (modelMap == null) {
            return;
        }

        this.modelMap = modelMap;
    }

    /**
     * @return
     */
    public QuamocoProfile createProfile() {
        final QuamocoProfile profile = new QuamocoProfile(getLanguage());

        for (final String key : repoMap.keySet()) {
            final RuleRepo repo = profile.addRepo(key);
            for (final net.siliconcode.quamoco.cli.qmodel.Rule r : repoMap.get(key).getRules()) {
                repo.addRule(r.getKey());
            }
        }

        return profile;
    }

    /**
     * 
     */
    public void updateModels() {
        // First create new tools

        // Next create new measurement methods

        // Connect measurement methods to tools

        // Next create new Measures

        // Next connect measurement methods to measures

        // Next create new Factors

        // Connect measures to factors

        // Connect new Factors to existing factors

        // Export the models
    }

    /**
     * 
     */
    public abstract void generateProfiles();

    /**
     * @param args
     */
    public static void main(final String args[]) {
        final QMUpdater updater = new CSharpQMUpdater();

        updater.execute();
    }
}
