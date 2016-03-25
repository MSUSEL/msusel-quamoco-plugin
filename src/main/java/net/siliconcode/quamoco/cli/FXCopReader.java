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
package net.siliconcode.quamoco.cli;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import net.siliconcode.quamoco.io.AbstractQuamocoReader;
import net.siliconcode.sonar.quamoco.rules.RuleSet;
import net.siliconcode.sonar.quamoco.rules.xml.Rule;
import net.siliconcode.sonar.quamoco.rules.xml.Rule.Cardinality;
import net.siliconcode.sonar.quamoco.rules.xml.Rule.Priority;

/**
 * FXCopReader -
 *
 * @author Isaac Griffith
 *
 */
public class FXCopReader extends AbstractQuamocoReader {

	private final RuleSet set;

	public FXCopReader() {
		set = new RuleSet();
	}

	@Override
	public void read(final String file) throws FileNotFoundException, XMLStreamException {
		if (file == null || file.isEmpty()) {
			return;
		}

		final XMLInputFactory factory = XMLInputFactory.newInstance();
		factory.setProperty(XMLInputFactory.IS_COALESCING, true);
		final InputStream stream = getInputStream(file);

		if (stream != null) {
			final XMLStreamReader reader = factory.createXMLStreamReader(stream);

			boolean name = false;
			boolean description = false;
			boolean tag = false;
			boolean severity = false;
			boolean cardinality = false;
			boolean key = false;
			Rule.Builder builder = new Rule.Builder();

			while (reader.hasNext()) {
				final int event = reader.next();

				switch (event) {
				case XMLStreamConstants.START_ELEMENT:
					final Map<String, String> attrs = getAttributes(reader);

					System.out.println(reader.getLocalName());

					switch (reader.getLocalName()) {
					case "rule":
						builder = new Rule.Builder();
						break;
					case "key":
						key = true;
						break;
					case "name":
						name = true;
						break;
					case "severity":
						severity = true;
						break;
					case "cardinality":
						cardinality = true;
						break;
					case "description":
						description = true;
						break;
					case "tag":
						tag = true;
						break;
					}
					break;
				case XMLStreamConstants.END_ELEMENT:
					switch (reader.getLocalName()) {
					case "rule":
						set.addRule(builder.build());
						break;
					case "key":
						key = false;
						break;
					case "name":
						name = false;
						break;
					case "severity":
						severity = false;
						break;
					case "cardinality":
						cardinality = false;
						break;
					case "description":
						description = false;
						break;
					case "tag":
						tag = false;
						break;
					}
					break;
				case XMLStreamConstants.CHARACTERS:
					if (key) {
						builder.key(reader.getText());
					} else if (name) {
						builder.name(reader.getText());
					} else if (severity) {
						builder.priority(Priority.valueOf(reader.getText()));
					} else if (cardinality) {
						builder.cardinality(Cardinality.valueOf(reader.getText()));
					} else if (description) {
						builder.description(reader.getText());
					} else if (tag) {
						builder.tag(reader.getText());
					}
					break;
				}
			}
		}
	}

	/**
	 * @param qm
	 * @return
	 */
	private InputStream getInputStream(final String loc) {
		final File file = new File(loc);
		if (file.exists()) {
			try {
				return new FileInputStream(file);
			} catch (final FileNotFoundException e) {
				System.out.println("Could not read file: " + loc);
			}
		} else {
			System.out.println("Could not find file: " + loc);
		}

		return null;
	}

	public RuleSet getRuleSet() {
		return set;
	}

	public static void main(final String args[]) throws FileNotFoundException, XMLStreamException {
		final FXCopReader reader = new FXCopReader();

		reader.read("/home/fate/test/FxCop/rules.xml");

		System.out.println("RuleSet: " + reader.getRuleSet());
		System.out.println("Set Size: " + reader.getRuleSet().getRules().size());
		for (final Rule r : reader.getRuleSet().getRules()) {
			System.out.println("Key: " + r.key());
			System.out.println("Name: " + r.name());
		}

		final RuleSet set = reader.getRuleSet();
		set.writeXML("/home/fate/test/rules/rules-fxcop.xml");
	}
}
