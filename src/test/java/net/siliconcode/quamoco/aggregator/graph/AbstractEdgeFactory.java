package net.siliconcode.quamoco.aggregator.graph;

import net.siliconcode.quamoco.graph.edge.AbstractEdge;
import net.siliconcode.quamoco.graph.edge.FactorToFactorEdge;
import net.siliconcode.quamoco.graph.edge.NormalizationEdge;
import net.siliconcode.quamoco.graph.edge.ParentEdge;
import net.siliconcode.quamoco.graph.edge.ValueToMeasureEdge;

/**
 * The class <code>AbstractEdgeFactory</code> implements static methods that return instances of the class <code>{@link AbstractEdge}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:23 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class AbstractEdgeFactory
 {
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
        return new FactorToFactorEdge("");
    }


    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:23 PM
     */
    public static AbstractEdge createAbstractEdge2()
    {
        return new NormalizationEdge("");
    }


    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:23 PM
     */
    public static AbstractEdge createAbstractEdge3()
    {
        return new ParentEdge("");
    }


    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:23 PM
     */
    public static AbstractEdge createAbstractEdge4()
    {
        return new ValueToMeasureEdge("");
    }


    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:24 PM
     */
    public static AbstractEdge createAbstractEdge5()
    {
        return new FactorToFactorEdge("");
    }


    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:24 PM
     */
    public static AbstractEdge createAbstractEdge6()
    {
        return new NormalizationEdge("");
    }


    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:24 PM
     */
    public static AbstractEdge createAbstractEdge7()
    {
        return new ParentEdge("");
    }


    /**
     * Create an instance of the class <code>{@link AbstractEdge}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:24 PM
     */
    public static AbstractEdge createAbstractEdge8()
    {
        return new ValueToMeasureEdge("");
    }
}