/**
 * 
 */
package net.siliconcode.quamoco.distill;

/**
 * Measure -
 *
 * @author Isaac Griffith
 */
public class Measure {

    private final String   name;
    private final String   description;
    private final String[] valueID;
    private final String[] parents;
    private double[]       values;
    private String[]       grades;
    private final String   id;

    /**
     * 
     */
    public Measure(String id, String name, String description, String[] valueID, String[] parents)
    {
        this.name = name;
        this.id = id;
        this.description = description;
        this.valueID = valueID;
        this.parents = parents;
    }

    /**
     * @return the value
     */
    public double getValue()
    {
        return value;
    }

    /**
     * @param value
     *            the value to set
     */
    public void setValue(double value)
    {
        this.value = value;
    }

    /**
     * @return the grade
     */
    public String getGrade()
    {
        return grade;
    }

    /**
     * @param grade
     *            the grade to set
     */
    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @return the valueID
     */
    public String getValueID()
    {
        return valueID;
    }

}
