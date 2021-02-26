package main.java.com.company;
import java.util.*;

public class Subdivision {
    private int ID;
    private String Title;
    public
    Subdivision(String t, int i )
    {
        Title = t;
        ID = i;
    }

    public String getTitle()
    {
        return this.Title;
    }
    public int getId()
    {
        return ID;
    }
}
