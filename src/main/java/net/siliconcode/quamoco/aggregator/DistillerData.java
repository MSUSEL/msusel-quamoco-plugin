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
import net.siliconcode.quamoco.aggregator.qm.QualityModel;

import com.google.common.collect.Maps;

/**
 * DistillerData -
 *
 * @author Isaac Griffith
 */
public class DistillerData {

    private Map<String, QualityModel> modelMap   = Maps.newHashMap();
    private final Map<String, Node>   factorMap  = Maps.newHashMap();
    final Map<String, Node>           measureMap = Maps.newHashMap();
    final Map<String, Node>           valuesMap  = Maps.newHashMap();
    private final List<QualityModel>  models;

    public DistillerData(final List<QualityModel> models)
    {
        this.models = models;
        modelMap = QualityModelUtils.createModelMap(models);
    }

    /**
     * @return
     */
    public Map<String, Node> getFactorMap()
    {
        return factorMap;
    }

    public Map<String, Node> getMeasureMap()
    {
        return measureMap;
    }

    /**
     * @return
     */
    public Map<String, QualityModel> getModelMap()
    {
        return modelMap;
    }

    public List<QualityModel> getModels()
    {
        return models;
    }

    public Map<String, Node> getValuesMap()
    {
        return valuesMap;
    }
}
