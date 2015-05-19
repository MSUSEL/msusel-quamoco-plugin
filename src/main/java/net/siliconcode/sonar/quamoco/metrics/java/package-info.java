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
/**
 * This package contains those classes which form the basic metrics in the Quamoco Java Quality Model. Metric included here are:
 * <br>
 * <ul>
 *  <li>#Classes - Number of classes in the project {@link net.siliconcode.sonar.quamoco.metrics.java.JavaNumTypesClasses}</li>
 *  <li>#Types - Number of types (Classes, Enums, and Interfaces) in the project {@link net.siliconcode.sonar.quamoco.metrics.java.JavaNumTypesClasses}</li>
 *  <li>LOC - A count of the total Lines of Code in a Java Project {@link net.siliconcode.sonar.quamoco.metrics.java.JavaLOC}</li>
 *  <li>#Fields - Number of fields in the project {@link net.siliconcode.sonar.quamoco.metrics.java.JavaNumFields}</li>
 *  <li>#Stmts - Number of statements in the project {@link net.siliconcode.sonar.quamoco.metrics.java.JavaNumStmts}</li>
 *  <li>#LocalVars - Number of Local Variables declared in the project {@link net.siliconcode.sonar.quamoco.metrics.java.JavaLocalVariables}</li>
 *  <li>#Methods - Number of methods declared in the project {@link net.siliconcode.sonar.quamoco.metrics.java.JavaNumTypesClasses}</li>
 * </ul>
 * 
 * @author isaac
 *
 */
package net.siliconcode.sonar.quamoco.metrics.java;