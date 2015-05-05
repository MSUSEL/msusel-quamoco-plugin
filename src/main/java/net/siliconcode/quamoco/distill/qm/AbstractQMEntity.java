/**
 *
 */
package net.siliconcode.quamoco.distill.qm;

import net.siliconcode.quamoco.distill.AbstractEntity;

/**
 * AbstractQMEntity -
 *
 * @author isaac
 */
public abstract class AbstractQMEntity extends AbstractEntity {

    protected String description;
    protected String name;
    /**
     *
     */
    public AbstractQMEntity()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    public abstract void resolve();

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

}
