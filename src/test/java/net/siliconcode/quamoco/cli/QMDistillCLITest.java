package net.siliconcode.quamoco.cli;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import net.siliconcode.quamoco.distiller.ModelDistiller;

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
	private PrintStream old;
	private PrintStream newPs;
	private PrintStream oldErr;
	private PrintStream newErr;

	/**
	 * Run the void execute(ModelDistiller,CommandLine,Options) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:21 PM
	 */
	@Test
	public void testExecute_1() throws Exception {
		final ModelDistiller dqm = new ModelDistiller();
		final CommandLine line = org.easymock.EasyMock.createNiceMock(CommandLine.class);
		org.easymock.EasyMock.expect(line.getOptions()).andReturn(new Option[0]);
		org.easymock.EasyMock.replay(line);

		final String msg = "usage: java -jar QMModelDistiller [-g] [-h] [-l <LANGUAGE>]\n"
				+ " -g,--graph             view the quality model processing graph\n"
				+ " -h,--help              prints this message\n"
				+ " -l,--lang <LANGUAGE>   the name of the language: java or cs\n";

		QMDistillCLI.execute(dqm, line);
		final String result = baos.toString();
		Assert.assertEquals(msg, result);
	}

	/**
	 * Run the void execute(ModelDistiller,CommandLine,Options) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:21 PM
	 */
	@Test
	public void testExecute_2() throws Exception {
		final ModelDistiller dqm = new ModelDistiller();
		final CommandLine line = org.easymock.EasyMock.createNiceMock(CommandLine.class);
		org.easymock.EasyMock.expect(line.getOptions()).andReturn(new Option[1]);
		org.easymock.EasyMock.expect(line.hasOption('h')).andReturn(true);
		org.easymock.EasyMock.replay(line);

		final String msg = "usage: java -jar QMModelDistiller [-g] [-h] [-l <LANGUAGE>]\n"
				+ " -g,--graph             view the quality model processing graph\n"
				+ " -h,--help              prints this message\n"
				+ " -l,--lang <LANGUAGE>   the name of the language: java or cs\n";

		QMDistillCLI.execute(dqm, line);
		final String result = baos.toString();
		Assert.assertEquals(msg, result);
	}

	/**
	 * Run the void execute(ModelDistiller,CommandLine,Options) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:21 PM
	 */
	@Test
	public void testExecute_3() throws Exception {
		final ModelDistiller dqm = new ModelDistiller();
		final CommandLine line = org.easymock.EasyMock.createNiceMock(CommandLine.class);
		org.easymock.EasyMock.expect(line.getOptions()).andReturn(new Option[1]);
		org.easymock.EasyMock.expect(line.hasOption('l')).andReturn(true);
		org.easymock.EasyMock.expect(line.getOptionValue('l')).andReturn("ruby");
		org.easymock.EasyMock.replay(line);

		QMDistillCLI.execute(dqm, line);
		Assert.assertNull(dqm.getLanguage());
		Assert.assertNotNull(dqm.getGraph());
		Assert.assertEquals(0, dqm.getGraph().getVertexCount());
	}

	/**
	 * Run the void execute(ModelDistiller,CommandLine,Options) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:21 PM
	 */
	@Test
	public void testExecute_4() throws Exception {
		final ModelDistiller dqm = new ModelDistiller();
		final CommandLine line = org.easymock.EasyMock.createNiceMock(CommandLine.class);
		org.easymock.EasyMock.expect(line.getOptions()).andReturn(new Option[1]);
		org.easymock.EasyMock.expect(line.hasOption('l')).andReturn(true);
		org.easymock.EasyMock.expect(line.getOptionValue('l')).andReturn("java");
		org.easymock.EasyMock.replay(line);

		QMDistillCLI.execute(dqm, line);
		Assert.assertEquals("java", dqm.getLanguage());
		Assert.assertNotNull(dqm.getGraph());
		Assert.assertNotEquals(0, dqm.getGraph().getVertexCount());
	}

	/**
	 * Run the void execute(ModelDistiller,CommandLine,Options) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:21 PM
	 */
	@Test
	public void testExecute_5() throws Exception {
		final ModelDistiller dqm = new ModelDistiller();
		final CommandLine line = org.easymock.EasyMock.createNiceMock(CommandLine.class);
		org.easymock.EasyMock.expect(line.getOptions()).andReturn(new Option[1]);
		org.easymock.EasyMock.expect(line.hasOption('l')).andReturn(true);
		org.easymock.EasyMock.expect(line.getOptionValue('l')).andReturn("cs");
		org.easymock.EasyMock.replay(line);

		QMDistillCLI.execute(dqm, line);
		Assert.assertEquals("cs", dqm.getLanguage());
		Assert.assertNotNull(dqm.getGraph());
		Assert.assertNotEquals(0, dqm.getGraph().getVertexCount());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 * @generatedBy CodePro at 5/30/15 3:21 PM
	 */
	@Before
	public void setUp() throws Exception {
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
	public void tearDown() throws Exception {
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
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(QMDistillCLITest.class);
	}
}