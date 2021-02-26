package main.java.com.company;
import java.util.*;

public class Person {
    private String ID;
    private String Name;
    private String Sex;
    private String Salary;
    private String BirthDate;
    private Subdivision SUBD;
    public

    /**
     * Gives to all the object's fields their parameteres
     */
    Person(String i, String n, String s, String sal, String bd, String t, int idd)
    {
        ID = i;
        Name = n;
        Sex = s;
        Salary = sal;
        BirthDate = bd;
        SUBD = new Subdivision(t, idd);
    }

    /**
     * Standard with no variables constructor
     */
    public Person()
    {

    }

    /**
     *
     * @return id
     */
    public String getId()
    {
        return ID;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @return sex
     */
    public String getSex() {
        return Sex;
    }

    /**
     *
     * @return salary
     */
    public String getSalary() {
        return Salary;
    }

    /**
     *
     * @return Date of birth
     */
    public String getBirthDate() {
        return BirthDate;
    }

    /**
     *
     * @return The title of Subdivision
     */
    public String getSUBDTitle() {
        return SUBD.getTitle();
    }

    /**
     *
     * @return The ID of Subdivision
     */
    public int getSUBDId()
    {
        return SUBD.getId();
    }
}
