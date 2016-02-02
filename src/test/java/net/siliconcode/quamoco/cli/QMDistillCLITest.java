package net.siliconcode.quamoco.aggregator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.easymock.classextension.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.node.Node;

/**
 * The class <code>QMDistillCLITest</code> contains tests for the class
 * <code>{@link QMDistillCLI}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:21 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class QMDistillCLITest {

    private ByteArrayOutputStream baos;
    private ByteArrayOutputStream berror;
    private PrintStream           old;
    private PrintStream           newPs;
    private PrintStream           oldErr;
    private PrintStream           newErr;

    /**
     * Run the void execute(ModelDistiller,CommandLine,Options) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:21 PM
     */
    @Test
    public void testExecute_1() throws Exception
    {
        ModelDistiller dqm = new ModelDistiller();
        CommandLine line = EasyMock.createNiceMock(CommandLine.class);
        EasyMock.expect(line.getOptions()).andReturn(new Option[0]);
        EasyMock.replay(line);

        String msg = "usage: java -jar QMModelDistiller [-g] [-h] [-l <LANGUAGE>]\n"
                + " -g,--graph             view the quality model processing graph\n"
                + " -h,--help              prints this message\n"
                + " -l,--lang <LANGUAGE>   the name of the language: java or cs\n";

        QMDistillCLI.execute(dqm, line);
        String result = baos.toString();
        assertEquals(msg, result);
    }

    /**
     * Run the void execute(ModelDistiller,CommandLine,Options) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:21 PM
     */
    @Test
    public void testExecute_2() throws Exception
    {
        ModelDistiller dqm = new ModelDistiller();
        CommandLine line = EasyMock.createNiceMock(CommandLine.class);
        EasyMock.expect(line.getOptions()).andReturn(new Option[1]);
        EasyMock.expect(line.hasOption('h')).andReturn(true);
        EasyMock.replay(line);

        String msg = "usage: java -jar QMModelDistiller [-g] [-h] [-l <LANGUAGE>]\n"
                + " -g,--graph             view the quality model processing graph\n"
                + " -h,--help              prints this message\n"
                + " -l,--lang <LANGUAGE>   the name of the language: java or cs\n";

        QMDistillCLI.execute(dqm, line);
        String result = baos.toString();
        assertEquals(msg, result);
    }

    /**
     * Run the void execute(ModelDistiller,CommandLine,Options) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:21 PM
     */
    @Test
    public void testExecute_3() throws Exception
    {
        ModelDistiller dqm = new ModelDistiller();
        CommandLine line = EasyMock.createNiceMock(CommandLine.class);
        EasyMock.expect(line.getOptions()).andReturn(new Option[1]);
        EasyMock.expect(line.hasOption('l')).andReturn(true);
        EasyMock.expect(line.getOptionValue('l')).andReturn("ruby");
        EasyMock.replay(line);

        QMDistillCLI.execute(dqm, line);
        assertNull(dqm.getLanguage());
        assertNotNull(dqm.getGraph());
        assertEquals(0, dqm.getGraph().getVertexCount());
    }

    /**
     * Run the void execute(ModelDistiller,CommandLine,Options) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:21 PM
     */
    @Test
    public void testExecute_4() throws Exception
    {
        ModelDistiller dqm = new ModelDistiller();
        CommandLine line = EasyMock.createNiceMock(CommandLine.class);
        EasyMock.expect(line.getOptions()).andReturn(new Option[1]);
        EasyMock.expect(line.hasOption('l')).andReturn(true);
        EasyMock.expect(line.getOptionValue('l')).andReturn("java");
        EasyMock.replay(line);

        QMDistillCLI.execute(dqm, line);
        assertEquals("java", dqm.getLanguage());
        assertNotNull(dqm.getGraph());
        assertNotEquals(0, dqm.getGraph().getVertexCount());
    }

    /**
     * Run the void execute(ModelDistiller,CommandLine,Options) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:21 PM
     */
    @Test
    public void testExecute_5() throws Exception
    {
        ModelDistiller dqm = new ModelDistiller();
        CommandLine line = EasyMock.createNiceMock(CommandLine.class);
        EasyMock.expect(line.getOptions()).andReturn(new Option[1]);
        EasyMock.expect(line.hasOption('l')).andReturn(true);
        EasyMock.expect(line.getOptionValue('l')).andReturn("cs");
        EasyMock.replay(line);

        QMDistillCLI.execute(dqm, line);
        assertEquals("cs", dqm.getLanguage());
        assertNotNull(dqm.getGraph());
        assertNotEquals(0, dqm.getGraph().getVertexCount());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:21 PM
     */
    @Before
    public void setUp() throws Exception
    {
        System.out.flush();
        System.err.flush();
        baos = new ByteArrayOutputStream();
        berror = new ByteArrayOutputStream();
        newPs = new PrintStream(baos);
        newErr = new PrintStream(berror);

        old = System.out;
        oldErr = System.err;

        System.setOut(newPs);
        System.setErr(newErr);
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *             if the clean-up fails for some reason
     * @generatedBy CodePro at 5/30/15 3:21 PM
     */
    @After
    public void tearDown() throws Exception
    {
        System.setOut(old);
        System.setErr(oldErr);
        newErr.close();
        newPs.close();
    }

    /**
     * Launch the test.
     *
     * @param args
     *            the command line arguments
     * @generatedBy CodePro at 5/30/15 3:21 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(QMDistillCLITest.class);
    }
}