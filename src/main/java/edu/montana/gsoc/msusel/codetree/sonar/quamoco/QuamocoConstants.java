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

/**
 * Defines the constants used throughout the Quamoco Plugin classes.
 *
 * @author Isaac Griffith
 * @version 1.1.1
 */
public interface QuamocoConstants {

    // Basic constants
    String REPOSITORY_NAME = "Quamoco";
    String PLUGIN_KEY      = "quamoco";
    String PLUGIN_NAME     = "Quamoco";
    String REPOSITORY_KEY  = QuamocoConstants.PLUGIN_KEY;
    String REPO_NAME       = "quamoco";
    String CODE_TREE       = "CODE_TREE";
    String DOMAIN_NAME     = "Quamoco";

    // Language Constants
    String JAVA_KEY   = "java";
    String CSHARP_KEY = "cs";

    // Location constants
    String QUAMOCO_QM_FILE_DIR     = "sonar.quamoco.qm.home";
    String QUAMOCO_METRIC_PROP_DIR = "sonar.quamoco.name.props.dir";

}
