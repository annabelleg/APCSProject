import java.io.*;
import java.util.*;

public class Person{
    private String[] values;

    public Person(String name, String unusual, String oldfashioned){
	values = new String[3];
	values[0] = name;
	values[1] = unusual;
	values[2] = oldfashioned;

    }
 
    public String qualities() {
	String c = "";
	for (int i = 0; i<values.length; i++) {
	    c += values[i] +", ";
	}
	return c.substring(0, c.length()-2);
    }

}
