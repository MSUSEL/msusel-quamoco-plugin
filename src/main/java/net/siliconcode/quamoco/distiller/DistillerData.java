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
package net.siliconcode.quamoco.distiller;

import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;

import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.model.qm.QualityModel;

/**
 * DistillerData - A Parameter Object containing maps of Identifiers and Nodes,
 * a Map of QUality Models indexed by Name, and a List of known Quality Models.
 * This object is used in the construction of the Quamoco Processing Graph.
 *
 * @author Isaac Griffith
 */
public class DistillerData {

    /**
     * Map of known quality models indexed by name.
     */
    private Map<String, QualityModel> modelMap   = Maps.newHashMap();
    /**
     * Map of factor nodes indexed by the item they represents, in a quality
     * model, identifier
     */
    private final Map<String, Node>   factorMap  = Maps.newHashMap();
    /**
     * Map of measure nodes indexed by the item they represents, in a quality
     * model, identifier
     */
    final Map<String, Node>           measureMap = Maps.newHashMap();
    /**
     * Map of value and finding nodes indexed by the item they represents, in a
     * quality model, identifier
     */
    final Map<String, Node>           valuesMap  = Maps.newHashMap();
    /**
     * Map of findings union nodes indexed by the item they represents, in a
     * quality model, identifier
     */
    final Map<String, Node>           unionsMap  = Maps.newHashMap();
    /**
     * List of known quality models.
     */
    private final List<QualityModel>  models;

    public DistillerData(final List<QualityModel> models)
    {
        this.models = models;
        modelMap = QualityModelUtils.createModelMap(models);
    }

    /**
     * @return Map of Factor Nodes indexed by Factor or Evaluation Unique
     *         Identifier.
     */
    public Map<String, Node> getFactorMap()
    {
        return factorMap;
    }

    /**
     * @return Map of Measure Nodes indexed by Measure unique identifier.
     */
    public Map<String, Node> getMeasureMap()
    {
        return measureMap;
    }

    /**
     * @return map of Quality Models indexed by name.
     */
    public Map<String, QualityModel> getModelMap()
    {
        return modelMap;
    }

    /**
     * @return list of known Quality Models.
     */
    public List<QualityModel> getModels()
    {
        return models;
    }

    /**
     * @return Map of Value Nodes indexed by MeasurementMethod unique identifier
     */
    public Map<String, Node> getValuesMap()
    {
        return valuesMap;
    }

    /**
     * @return
     */
    public Map<String, Node> getUnionsMap()
    {
        return unionsMap;
    }
}
