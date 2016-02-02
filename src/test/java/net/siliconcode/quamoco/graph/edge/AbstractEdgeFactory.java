package net.siliconcode.quamoco.graph.edge;

import net.siliconcode.quamoco.model.qm.InfluenceEffect;

/**
 * The class <code>AbstractEdgeFactory</code> implements static methods that
 * return instances of the class <code>{@link AbstractEdge}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:23 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class AbstractEdgeFactory {

    /**
     * Prevent creation of instances of this class.
     *
     * @generatedBy CodePro at 5/30/15 3:23 PM
     */
    private AbstractEdgeFactory()
    {
    }

    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:23 PM
     */
    public static AbstractEdge createAbstractEdge()
    {
        return new FactorToFactorEdge("", null, null, InfluenceEffect.POSITIVE);
    }

    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:23 PM
     */
    public static AbstractEdge createAbstractEdge2()
    {
        return new FindingToMeasureEdge("", null, null);
    }

    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:23 PM
     */
    public static AbstractEdge createAbstractEdge3()
    {
        return new MeasureToFactorFindingsEdge("", null, null, InfluenceEffect.POSITIVE);
    }

    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:23 PM
     */
    public static AbstractEdge createAbstractEdge4()
    {
        return new ValueToMeasureEdge("", null, null);
    }

    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:24 PM
     */
    public static AbstractEdge createAbstractEdge5()
    {
        return new MeasureToFactorNumberEdge("", null, null, InfluenceEffect.POSITIVE);
    }

    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:24 PM
     */
    public static AbstractEdge createAbstractEdge6()
    {
        return new MeasureToMeasureFindingsEdge("", null, null);
    }

    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:24 PM
     */
    public static AbstractEdge createAbstractEdge7()
    {
        return new MeasureToMeasureNumberEdge("", null, null);
    }

    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:24 PM
     */
    public static AbstractEdge createAbstractEdge8()
    {
        return new MeasureToMeasureFindingsNumberEdge("", null, null);
    }

    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:23 PM
     */
    public static AbstractEdge createAbstractEdge9()
    {
        return new FactorToFactorEdge("", null, null, InfluenceEffect.POSITIVE);
    }

    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:23 PM
     */
    public static AbstractEdge createAbstractEdge10()
    {
        return new FindingToMeasureEdge("", null, null);
    }

    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:23 PM
     */
    public static AbstractEdge createAbstractEdge11()
    {
        return new MeasureToFactorFindingsEdge("", null, null, InfluenceEffect.POSITIVE);
    }

    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:23 PM
     */
    public static AbstractEdge createAbstractEdge12()
    {
        return new ValueToMeasureEdge("", null, null);
    }

    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:24 PM
     */
    public static AbstractEdge createAbstractEdge13()
    {
        return new MeasureToFactorNumberEdge("", null, null, InfluenceEffect.POSITIVE);
    }

    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:24 PM
     */
    public static AbstractEdge createAbstractEdge14()
    {
        return new MeasureToMeasureFindingsEdge("", null, null);
    }

    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:24 PM
     */
    public static AbstractEdge createAbstractEdge15()
    {
        return new MeasureToMeasureNumberEdge("", null, null);
    }

    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:24 PM
     */
    public static AbstractEdge createAbstractEdge16()
    {
        return new MeasureToMeasureFindingsNumberEdge("", null, null);
    }
}