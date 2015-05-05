/**
 *
 */
package net.siliconcode.quamoco.distill.qm;

/**
 * Influence -
 *
 * @author isaac
 */
public class Influence {

    private String effect;
    private String justification;
    private String target;
    private String id;

    /**
     *
     */
    public Influence(String effect, String justification, String target, String id)
    {
        this.effect = effect;
        this.justification = justification;
        this.target = target;
        this.id = id;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Influence other = (Influence) obj;
        if (effect == null)
        {
            if (other.effect != null)
            {
                return false;
            }
        }
        else if (!effect.equals(other.effect))
        {
            return false;
        }
        if (justification == null)
        {
            if (other.justification != null)
            {
                return false;
            }
        }
        else if (!justification.equals(other.justification))
        {
            return false;
        }
        if (target == null)
        {
            if (other.target != null)
            {
                return false;
            }
        }
        else if (!target.equals(other.target))
        {
            return false;
        }
        return true;
    }

    /**
     * @return the effect
     */
    public String getEffect()
    {
        return effect;
    }

    /**
     * @return the id
     */
    public String getId()
    {
        return id;
    }

    /**
     * @return the justification
     */
    public String getJustification()
    {
        return justification;
    }

    /**
     * @return the target
     */
    public String getTarget()
    {
        return target;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + (effect == null ? 0 : effect.hashCode());
        result = prime * result + (justification == null ? 0 : justification.hashCode());
        result = prime * result + (target == null ? 0 : target.hashCode());
        return result;
    }

    /**
     * @param effect
     *            the effect to set
     */
    public void setEffect(String effect)
    {
        this.effect = effect;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * @param justification
     *            the justification to set
     */
    public void setJustification(String justification)
    {
        this.justification = justification;
    }

    /**
     * @param target
     *            the target to set
     */
    public void setTarget(String target)
    {
        this.target = target;
    }

}
