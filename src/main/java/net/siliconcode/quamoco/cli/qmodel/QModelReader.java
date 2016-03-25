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
package net.siliconcode.quamoco.cli.qmodel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Stack;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.siliconcode.quamoco.cli.QMDistillCLI;
import net.siliconcode.quamoco.io.AbstractQuamocoReader;

/**
 * QModelReader -
 *
 * @author Isaac Griffith
 *
 */
public class QModelReader extends AbstractQuamocoReader {

    private static final Logger  LOG = LoggerFactory.getLogger(QModelReader.class);
    private final Sqale sqale;

	public QModelReader() {
		sqale = new Sqale();
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

			boolean key = false;
			boolean name = false;
			boolean ruleRepo = false;
			boolean ruleKey = false;
			boolean prop = false;
			boolean propKey = false;
			boolean propTxt = false;
			boolean propVal = false;
			final Stack<QualityCharacteristic> chars = new Stack<>();
			QualityCharacteristic current = null;
			Rule rule = null;
			Repository repo = null;
			Property property = null;

			while (reader.hasNext()) {
				final int event = reader.next();

				switch (event) {
				case XMLStreamConstants.START_ELEMENT:
					switch (reader.getLocalName()) {
					case "sqale":
						break;
					case "chc":
						if (current != null) {
							chars.push(current);
						}
						current = new QualityCharacteristic();
						if (chars.isEmpty()) {
							sqale.addCharacteristic(current);
						}
						break;
					case "key":
						if (prop) {
							propKey = true;
						} else {
							key = true;
						}
						break;
					case "name":
						name = true;
						break;
					case "rule-repo":
						ruleRepo = true;
						break;
					case "rule-key":
						ruleKey = true;
						break;
					case "prop":
						property = new Property();
						prop = true;
						break;
					case "txt":
						propTxt = true;
						break;
					case "val":
						propVal = true;
						break;
					}
					break;
				case XMLStreamConstants.END_ELEMENT:
					switch (reader.getLocalName()) {
					case "sqale":
						break;
					case "chc":
						if (!chars.isEmpty() && current.getKey() != null) {
							chars.peek().addSubCharacteristic(current);
						}
						current = chars.isEmpty() ? null : chars.pop();
						break;
					case "key":
						if (prop) {
							propKey = false;
						} else {
							key = false;
						}
						break;
					case "name":
						name = false;
						break;
					case "rule-repo":
						ruleRepo = false;
						break;
					case "rule-key":
						ruleKey = false;
						break;
					case "prop":
						prop = false;
						rule.addPropety(property);
						break;
					case "txt":
						propTxt = false;
						break;
					case "val":
						propVal = false;
						break;
					}
					break;
				case XMLStreamConstants.CHARACTERS:
					if (key) {
						current.setKey(reader.getText());
					} else if (name) {
						current.setName(reader.getText());
					} else if (ruleRepo) {
						if (current.getKey() == null) {
							repo = chars.peek().getRuleRepo(reader.getText());
						} else {
							repo = current.getRuleRepo(reader.getText());
						}
					} else if (ruleKey) {
						rule = new Rule(reader.getText());
						repo.addRule(rule);
					} else if (propKey) {
						property.setKey(reader.getText());
					} else if (propTxt) {
						property.setDesc(reader.getText());
					} else if (propVal) {
						property.setValue(reader.getText());
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
				LOG.warn("Could not read file: " + loc);
			}
		} else {
			LOG.warn("Could not find file: " + loc);
		}

		return null;
	}

	public Sqale getSqale() {
		return sqale;
	}

	public static void main(final String args[]) throws FileNotFoundException, XMLStreamException {
		final QModelReader reader = new QModelReader();

		final String[] files = { "/home/fate/test/FindBugs/findbugs-model.xml", "/home/fate/test/FxCop/fxcop.xml",
				"/home/fate/test/PMD/pmd-model.xml", "/home/fate/test/StyleCop/stylecop-model.xml" };

		for (final String file : files) {
			reader.read(file);
		}

		for (final QualityCharacteristic qc : reader.getSqale().getCharacteristics()) {
			QModelReader.print(qc, 0);
		}
	}

	public static void print(final QualityCharacteristic qc, final int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("\t");
		}
		System.out.println(qc.getName());

		for (final Repository r : qc.getRuleRepos()) {
			for (int i = 0; i < depth + 1; i++) {
				System.out.print("\t");
			}
			System.out.println(r.getName());

			for (final Rule rule : r.getRules()) {
				for (int i = 0; i < depth + 2; i++) {
					System.out.print("\t");
				}

				System.out.println(rule.getKey());
			}
		}

		System.out.println();

		for (final QualityCharacteristic sub : qc.getSubCharacteristics()) {
			QModelReader.print(sub, depth + 1);
		}
	}
}
