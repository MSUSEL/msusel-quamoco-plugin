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
package net.siliconcode.quamoco.aggregator;

import java.util.List;
import java.util.Map;

import net.siliconcode.quamoco.aggregator.graph.Node;
import net.siliconcode.quamoco.aggregator.qm.AbstractQMEntity;
import net.siliconcode.quamoco.aggregator.qm.Evaluation;
import net.siliconcode.quamoco.aggregator.qm.Factor;
import net.siliconcode.quamoco.aggregator.qm.Measure;
import net.siliconcode.quamoco.aggregator.qm.MeasurementMethod;
import net.siliconcode.quamoco.aggregator.qm.QualityModel;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * QualityModelUtils -
 *
 * @author Isaac Griffith
 */
public final class QualityModelUtils {

    private QualityModelUtils()
    {
    }

    /**
     * @param models
     * @return
     */
    public static Map<String, QualityModel> createModelMap(final List<QualityModel> models)
    {
        final Map<String, QualityModel> map = Maps.newHashMap();
        for (final QualityModel model : models)
        {
            map.put(model.getName(), model);
        }

        return map;
    }

    /**
     * @param modelMap
     * @param id
     * @return
     */
    public static AbstractEntity findEntity(final Map<String, QualityModel> modelMap, final String id)
    {
        if (modelMap.isEmpty() || id == null)
        {
            return null;
        }

        AbstractEntity entity = null;

        if (id.contains(".qm#"))
        {
            final String[] keys = id.split(".qm#");
            final String model = keys[0];
            entity = modelMap.get(model).find(id);
        }
        else
        {
            for (final QualityModel model : modelMap.values())
            {
                if (model.hasKey(id))
                {
                    entity = model.find(id);
                    break;
                }
            }
        }

        return entity;
    }

    public static List<MeasurementMethod> getAllMeasurementMethods(final List<QualityModel> models)
    {
        final List<MeasurementMethod> mmlist = Lists.newArrayList();

        for (final QualityModel model : models)
        {
            for (final AbstractQMEntity entity : model.getContained())
            {
                if (entity instanceof MeasurementMethod)
                {
                    mmlist.add((MeasurementMethod) entity);
                }
            }
        }

        return mmlist;
    }

    /**
     * @param dest
     * @param modelMap
     * @return
     */
    public static Evaluation getEvaluates(final Node dest, final Map<String, QualityModel> modelMap)
    {
        final AbstractEntity ent = QualityModelUtils.findEntity(modelMap, dest.getOwnedBy());
        if (ent != null && ent instanceof Evaluation)
        {
            return (Evaluation) ent;
        }
        return null;
    }

    /**
     * @param source
     * @param modelMap
     * @return
     */
    public static Factor getFactor(final Node source, final Map<String, QualityModel> modelMap)
    {
        final AbstractEntity ent = QualityModelUtils.findEntity(modelMap, source.getOwnedBy());
        if (ent != null && ent instanceof Factor)
        {
            return (Factor) ent;
        }
        return null;
    }

    /**
     * @param source
     * @param modelMap
     * @return
     */
    public static Measure getMeasure(final Node source, final Map<String, QualityModel> modelMap)
    {
        final AbstractEntity ent = QualityModelUtils.findEntity(modelMap, source.getOwnedBy());
        if (ent != null && ent instanceof Measure)
        {
            return (Measure) ent;
        }
        return null;
    }
}
