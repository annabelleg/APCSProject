import java.io.*;
import java.util.*;

public class Person{
    private ArrayList<Object> values;

    public Person(String name, String unusual){
	values.set(0, name);
	values.set(1, unusual);
    }
    //the goal of this method is to take the given values from GenerateName.java and run it through the database of names, comparing the values and returning the closest match
    public static ArrayList<Object> comparePeople(Person p){
	ArrayList<Object> a = new ArrayList<Object>(1);
	return a;
    }
//NOTE: THIS COMPARE METHOD SHOULD DEFINITELY GO ELSEWHERE I'M JUST PUTTING IT HERE FOR NOW
}
