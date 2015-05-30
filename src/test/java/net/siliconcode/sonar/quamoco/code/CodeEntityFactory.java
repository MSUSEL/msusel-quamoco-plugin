package net.siliconcode.sonar.quamoco.code;



/**
 * The class <code>CodeEntityFactory</code> implements static methods that return instances of the class <code>{@link CodeEntity}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:40 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class CodeEntityFactory
 {
    /**
     * Prevent creation of instances of this class.
     *
     * @generatedBy CodePro at 5/30/15 3:40 PM
     */
    private CodeEntityFactory()
    {
    }


    /**
     * Create an instance of the class <code>{@link CodeEntity}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:40 PM
     */
    public static CodeEntity createCodeEntity()
    {
        return new CodeEntity("", CodeEntityType.CLASS, 0, 0);
    }


    /**
     * Create an instance of the class <code>{@link CodeEntity}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:40 PM
     */
    public static CodeEntity createCodeEntity2()
    {
        return new CodeEntity("0123456789", CodeEntityType.CONSTRUCTOR, 1, 1);
    }


    /**
     * Create an instance of the class <code>{@link CodeEntity}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:40 PM
     */
    public static CodeEntity createCodeEntity3()
    {
        return new CodeEntity("An��t-1.0.txt", CodeEntityType.DELEGATE, 7, 7);
    }


    /**
     * Create an instance of the class <code>{@link CodeEntity}</code>.
     *
     * @generatedBy CodePro at 5/30/15 3:40 PM
     */
    public static CodeEntity createCodeEntity4()
    {
        return new CodeEntity((String) null, CodeEntityType.ENUM, -1, -1);
    }
}