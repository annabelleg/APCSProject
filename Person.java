import java.io.*;
import java.util.*;

public class Person{
    ArrayList<Object> values;

    public Person(String name, String unusual, String oldfashioned, Object country){
	values = new ArrayList<Object>();
	values.add(name);
	values.add(unusual);
	values.add(oldfashioned);
	values.add(country);
    }
 
    public String qualities() {
	String c = "";
	for (int i = 0; i<values.size(); i++) {
	    c += values.get(i) +", ";
	}
	return c.substring(0, c.length()-2) + "\n";
    }

}
