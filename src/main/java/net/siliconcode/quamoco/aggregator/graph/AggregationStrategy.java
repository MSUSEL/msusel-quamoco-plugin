/**
 * 
 */
package net.siliconcode.quamoco.aggregator.graph;

/**
 * AggregationStrategy -
 * 
 * @author isaac
 */
public abstract class AggregationStrategy {

    /**
     * @return
     */
    public abstract double aggregate(double... values);
}
