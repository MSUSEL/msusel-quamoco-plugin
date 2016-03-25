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

import java.io.File;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.batch.Decorator;
import org.sonar.api.batch.DecoratorBarriers;
import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.batch.DependsUpon;
import org.sonar.api.batch.fs.FilePredicates;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile.Type;
import org.sonar.api.component.ResourcePerspectives;
import org.sonar.api.issue.Issue;
import org.sonar.api.issue.ProjectIssues;
import org.sonar.api.measures.MetricFinder;
import org.sonar.api.resources.Project;
import org.sonar.api.resources.Resource;
import org.sonar.api.resources.ResourceUtils;
import org.sonar.api.rules.RuleFinder;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import net.siliconcode.sonar.quamoco.decorator.DecoratorTemplateFactory;
import net.siliconcode.sonar.quamoco.decorator.IDecoratorTemplate;

/**
 * QuamocoDecorator -
 *
 * @author Isaac Griffith
 */
@DependsUpon(value = DecoratorBarriers.ISSUES_TRACKED)
public class QuamocoDecorator implements Decorator {

    private static final Logger        LOG = LoggerFactory.getLogger(QuamocoDecorator.class);

    private final FileSystem           files;
    private final ProjectIssues        projectIssues;
    private final RuleFinder           finder;
    private String                     language;
    private final ResourcePerspectives perspectives;
    private MetricFinder               metricFinder;

    public QuamocoDecorator(final FileSystem files, final ProjectIssues projectIssues, final RuleFinder finder,
            final ResourcePerspectives perspectives, MetricFinder metricFinder) {
        this.files = files;
        this.projectIssues = projectIssues;
        this.finder = finder;
        this.perspectives = perspectives;
        this.metricFinder = metricFinder;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.sonar.api.batch.Decorator#decorate(org.sonar.api.resources.Resource,
     * org.sonar.api.batch.DecoratorContext)
     */
    @Override
    public void decorate(final Resource resource, final DecoratorContext context) {
        if (!ResourceUtils.isProject(resource) && !ResourceUtils.isEntity(resource)) {
            return;
        }

        final Iterable<Issue> issues = projectIssues.issues();
        
        List<Issue> list = Lists.newArrayList();
        for (Issue i : issues)
            list.add(i);
        
        final IDecoratorTemplate template = DecoratorTemplateFactory.getInstance().createDecoratorTemplate(language);
        
        template.decorate(files, resource, context, finder, list, perspectives, metricFinder);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.sonar.api.batch.CheckProject#shouldExecuteOnProject(org.sonar.api
     * .resources.Project)
     */
    @Override
    public boolean shouldExecuteOnProject(final Project project) {
        final FilePredicates predicates = files.predicates();
        final Iterable<File> mainFiles = files.files(
                predicates.and(predicates.hasLanguage(QuamocoConstants.CSHARP_KEY), predicates.hasType(Type.MAIN)));
        final Iterable<File> csFiles = files.files(predicates.hasLanguage(QuamocoConstants.CSHARP_KEY));
        if (!Iterables.isEmpty(csFiles)) {
            language = QuamocoConstants.CSHARP_KEY;
        }
        return !Iterables.isEmpty(mainFiles);
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Quamoco Decorator";
    }
}
