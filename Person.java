import java.io.*;
import java.util.*;

public class Person{
    ArrayList<String> values;

    public Person(String name, String unusual, String oldfashioned){
	values = new ArrayList<String>(3);
	values.add(name);
	values.add(unusual);
	values.add(oldfashioned);

    }
 
    public String qualities() {
	String c = "";
	for (int i = 0; i<values.size(); i++) {
	    c += values.get(i) +", ";
	}
	return c.substring(0, c.length()-2) + "\n";
    }

}
