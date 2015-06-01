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
 * QualityModelUtils - A utility class for dealing with quality model objects.
 *
 * @author Isaac Griffith
 */
public final class QualityModelUtils {

    /**
     * Private constructor
     */
    private QualityModelUtils()
    {
    }

    /**
     * Creates a map relating model names to quality models
     * 
     * @param models
     *            a list of existing quality models
     * @return The map that was created
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
     * Finds an entity by its identifier within the provided model map, if such
     * an entity exists.
     * 
     * @param modelMap
     *            A map of models indexed by their names.
     * @param id
     *            The unique identifying string associated with the entity.
     * @return The entity with the provided id or null if no such entity exists.
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

    /**
     * Retrieves all MeasurementMethod entities from a list of known quality
     * models.
     * 
     * @param models
     *            The list of quality models
     * @return List of all known measurement method objects.
     */
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
     * Retrieves an Evaluation entity from a map of quality models indexed by
     * name when given a node representing an entity evaluated by the returned
     * evaluation.
     * 
     * @param dest
     *            Node that whose quality model representation is evaluated by
     *            the desired evaluation.
     * @param modelMap
     *            Map of quality models indexed by their names.
     * @return The evaluation object that evaluates the provided node, and
     *         exists within one of the quality models found in the map. If no
     *         such evaluation exists, null is returned.
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
     * Retrieves a factor object from a quality model provided in the model map,
     * that is represented by the provided node.
     * 
     * @param source
     *            Node which represents the factor.
     * @param modelMap
     *            Map of quality models indexed by name.
     * @return The factor if it exists within one of the quality models,
     *         otherwise null.
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
     * Retrieves a measure object from a quality model provided in the model
     * map, that is represented by the provided node.
     * 
     * @param source
     *            Node which represents the measure.
     * @param modelMap
     *            Map of quality models indexed by name.
     * @return The measure if it exists within one of the quality models,
     *         otherwise null.
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
