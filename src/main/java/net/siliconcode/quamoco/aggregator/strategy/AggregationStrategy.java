/**
 *
 */
package net.siliconcode.quamoco.aggregator.strategy;

/**
 * AggregationStrategy -
 *
 * @author Isaac Griffith
 */
public abstract class AggregationStrategy implements Evaluator {

    protected NormalizationStrategy normstrategy;

    /**
     * @param ns
     */
    public AggregationStrategy(final NormalizationStrategy ns)
    {
        normstrategy = ns;
    }

}
