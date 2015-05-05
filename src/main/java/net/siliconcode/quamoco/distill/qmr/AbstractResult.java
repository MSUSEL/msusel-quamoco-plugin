/**
 * 
 */
package net.siliconcode.quamoco.distill.qmr;

import net.siliconcode.quamoco.distill.AbstractEntity;

/**
 * AbstractResult -
 *
 * @author isaac
 */
public class AbstractResult extends AbstractEntity {

    protected Value  value;
    protected String type;

    /**
     * 
     */
    public AbstractResult()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the type
     */
    public String getType()
    {
        return type;
    }

    /**
     * @return the value
     */
    public Value getValue()
    {
        return value;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(String type)
    {
        this.type = type;
    }

    /**
     * @param value
     *            the value to set
     */
    public void setValue(Value value)
    {
        this.value = value;
    }

}
