/**
 * 
 */
package net.siliconcode.quamoco.distill;


/**
 * AbstractEntity - 
 *
 * @author isaac
 *
 */
public abstract class AbstractEntity {

    protected String id;

    /**
     * 
     */
    public AbstractEntity()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the id
     */
    public String getId()
    {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(String id)
    {
        this.id = id;
    }

}
