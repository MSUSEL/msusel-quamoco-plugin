/**
 * The MIT License (MIT)
 * 
 * MSUSEL Sonar Quamoco Plugin
 * Copyright (c) 2015-2017 Montana State University, Gianforte School of Computing,
 * Software Engineering Laboratory
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
package edu.montana.gsoc.msusel.codetree.sonar.quamoco;

import java.util.List;

import edu.montana.gsoc.msusel.codetree.sonar.quamoco.computestates.CSharpComputeState;
import edu.montana.gsoc.msusel.codetree.sonar.quamoco.computestates.JavaComputeState;
import org.sonar.api.ce.measure.Component;
import org.sonar.api.ce.measure.Component.Type;

import com.google.common.collect.Lists;
import com.sparqline.sonar.base.BaseComputeState;
import com.sparqline.sonar.base.BaseMeasureComputer;

/**
 * Class used by SonarQube to evaluate identified quality aspects and store
 * their results via the SonarQube Compute Engine.
 * 
 * @author Isaac Griffith
 * @version 1.1.1
 */
public class QuamocoMeasureComputer extends BaseMeasureComputer {

    /**
     * Constructs a new QuamocoMeasureComputer
     */
    public QuamocoMeasureComputer()
    {
        super();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> getOutputMetrics()
    {
        List<String> ret = Lists.newLinkedList();
        for (final String key : getQualityAspects())
        {
            ret.add(getMeasureRepo() + "." + key.toUpperCase().replaceAll(" ", "_"));
        }

        return ret;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BaseComputeState selectState(Component comp)
    {
        if (comp.getType().equals(Type.FILE))
        {
            String langKey = comp.getFileAttributes().getLanguageKey();
            if (langKey.equals(CSharpComputeState.LANG))
            {
                return new CSharpComputeState();
            }
            else if (langKey.equals(JavaComputeState.LANG))
            {
                return new JavaComputeState();
            }
        }

        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> getInputMetrics()
    {
        return Lists.newArrayList(getMeasureRepo() + "." + QuamocoConstants.CODE_TREE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getMeasureRepo()
    {
        return QuamocoConstants.PLUGIN_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPluginName()
    {
        return "Quamoco";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> getQualityAspects()
    {
        return QuamocoMetrics.QUALITY_ASPECTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRootQualityAspectName()
    {
        return "Quality @Product";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCodeTreeMeasure()
    {
        return QuamocoConstants.PLUGIN_KEY + "." + QuamocoConstants.CODE_TREE;
    }
}
