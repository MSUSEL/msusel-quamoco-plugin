package net.siliconcode.sonar.quamoco.detectors;

import org.junit.*;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.processor.MetricsContext;
import net.siliconcode.quamoco.codetree.CodeTree;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;

import static org.junit.Assert.*;

/**
 * The class <code>JavaQuamocoDetectorTest</code> contains tests for the class
 * <code>{@link JavaQuamocoDetector}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class JavaQuamocoDetectorTest {

	private JavaQuamocoDetector fixture;

	/**
	 * Run the JavaQuamocoDetector(DirectedSparseGraph
	 * <Node,Edge>,MetricsContext,CodeTree) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testJavaQuamocoDetector_1() throws Exception {
		DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		MetricsContext context = MetricsContext.getInstance();
		CodeTree tree = new CodeTree();

		JavaQuamocoDetector result = new JavaQuamocoDetector(graph, context, tree);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void cloneDetection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testCloneDetection_1() throws Exception {
		fixture.cloneDetection();

		// add additional test code here
		fail("unverified");
	}

	/**
	 * Run the void execute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testExecute_1() throws Exception {
		fixture.execute();

		// add additional test code here
		fail("unverified");
	}

	/**
	 * Run the void insufficientComment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testInsufficientComment_1() throws Exception {
		fixture.insufficientComment();

		// add additional test code here
		fail("unverified");
	}

	/**
	 * Run the void missingDocumentation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testMissingDocumentation_1() throws Exception {
		fixture.missingDocumentation();

		// add additional test code here
		fail("unverified");
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Before
	public void setUp() throws Exception {
		CodeTree tree = new CodeTree();
		DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		MetricsContext context = MetricsContext.getInstance();
		fixture = new JavaQuamocoDetector(graph, context, tree);
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JavaQuamocoDetectorTest.class);
	}
}