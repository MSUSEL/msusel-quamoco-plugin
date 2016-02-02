/**
 * The MIT License (MIT)
 *
 * Sonar Quamoco Plugin
 * Copyright (c) 2015 Isaac Griffith, SiliconCode, LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.siliconcode.quamoco.model.qm;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Influence -
 *
 * @author Isaac Griffith
 */
@XStreamAlias("influences")
public class Influence {

    @XStreamAlias("effect")
    @XStreamAsAttribute
    private InfluenceEffect effect;
    @XStreamAlias("justification")
    @XStreamAsAttribute
    private String          justification;
    private Target          target;
    @XStreamAlias("xmi:id")
    @XStreamAsAttribute
    private String          id;

    /**
     *
     */
    public Influence(final InfluenceEffect effect, final String justification, final Target target, final String id)
    {
        if (id == null || id.isEmpty())
            throw new IllegalArgumentException();

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
    public boolean equals(final Object obj)
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
    public InfluenceEffect getEffect()
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
    public Target getTarget()
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
    public void setEffect(final InfluenceEffect effect)
    {
        this.effect = effect;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(final String id)
    {
        this.id = id;
    }

    /**
     * @param justification
     *            the justification to set
     */
    public void setJustification(final String justification)
    {
        this.justification = justification;
    }

    /**
     * @param target
     *            the target to set
     */
    public void setTarget(final Target target)
    {
        this.target = target;
    }

}
