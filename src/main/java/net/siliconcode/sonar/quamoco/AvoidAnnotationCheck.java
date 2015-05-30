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
package net.siliconcode.sonar.quamoco;

import java.util.List;

import org.sonar.check.Rule;
import org.sonar.check.RuleProperty;
import org.sonar.plugins.java.api.JavaFileScanner;
import org.sonar.plugins.java.api.JavaFileScannerContext;
import org.sonar.plugins.java.api.tree.AnnotationTree;
import org.sonar.plugins.java.api.tree.BaseTreeVisitor;
import org.sonar.plugins.java.api.tree.IdentifierTree;
import org.sonar.plugins.java.api.tree.MethodTree;
import org.sonar.plugins.java.api.tree.Tree;

/**
 * AvoidAnnotationCheck -
 *
 * @author Isaac Griffith
 */
@Rule(key = "AvoidAnnotation", name = "Avoid usage of annotation", description = "This rule detects usage of configured annotation", tags = { "example" })
public class AvoidAnnotationCheck extends BaseTreeVisitor implements JavaFileScanner {

    private static final String    DEFAULT_VALUE = "Inject";

    private JavaFileScannerContext context;

    /**
     * 
     */
    public AvoidAnnotationCheck()
    {
        super();
    }

    /**
     * Name of the annotation to avoid. Value can be set by users in Quality
     * profiles. The key
     */
    @RuleProperty(defaultValue = DEFAULT_VALUE, description = "Name of the annotation to avoid, without the prefix @, for instance 'Override'")
    String name;

    @Override
    public void scanFile(final JavaFileScannerContext context)
    {
        this.context = context;

        scan(context.getTree());

        System.out.println(PrinterVisitor.print(context.getTree()));
    }

    @Override
    public void visitMethod(final MethodTree tree)
    {
        final List<AnnotationTree> annotations = tree.modifiers().annotations();
        for (final AnnotationTree annotationTree : annotations)
        {
            if (annotationTree.annotationType().is(Tree.Kind.IDENTIFIER))
            {
                final IdentifierTree idf = (IdentifierTree) annotationTree.annotationType();
                System.out.println(idf.name());

                if (idf.name().equals(name))
                {
                    context.addIssue(idf, this, String.format("Avoid using annotation @%s", name));
                }
            }
        }

        // The call to the super implementation allows to continue the visit of
        // the AST.
        // Be careful to always call this method to visit every node of the
        // tree.
        super.visitMethod(tree);
    }
}