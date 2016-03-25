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

import java.io.FileNotFoundException;

import javax.xml.stream.XMLStreamException;

import net.siliconcode.quamoco.cli.qmodel.QModelReader;
import net.siliconcode.sonar.quamoco.profiles.QuamocoProfileExporter;
import net.siliconcode.sonar.quamoco.profiles.xml.QuamocoProfile;

/**
 * CSharpQMUpdater -
 *
 * @author Isaac Griffith
 *
 */
public class CSharpQMUpdater extends QMUpdater {

	/*
	 * (non-Javadoc)
	 *
	 * @see net.siliconcode.quamoco.cli.updater.QMUpdater#loadRules()
	 */
	@Override
	public void loadRules() {
		final String[] files = { "/home/fate/test/rules/rules-fxcop.xml", "/home/fate/test/rules/rules-stylecop.xml" };

		readRules(files);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see net.siliconcode.quamoco.cli.updater.QMUpdater#loadRepositories()
	 */
	@Override
	public void loadRepositories() {
		final QModelReader reader = new QModelReader();

		final String[] files = { "/home/fate/test/FxCop/fxcop.xml", "/home/fate/test/StyleCop/stylecop-model.xml" };

		for (final String file : files) {
			try {
				reader.read(file);
			} catch (FileNotFoundException | XMLStreamException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		aggregateRepositories(reader.getSqale());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see net.siliconcode.quamoco.cli.updater.QMUpdater#generateProfiles()
	 */
	@Override
	public void generateProfiles() {
		final QuamocoProfile profile = createProfile();

		final QuamocoProfileExporter exporter = new QuamocoProfileExporter();
		exporter.exportProfile(profile, "/home/fate/test/cs-profile.xml");
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see net.siliconcode.quamoco.cli.updater.QMUpdater#getLanguage()
	 */
	@Override
	public String getLanguage() {
		return "cs";
	}
}
