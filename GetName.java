import java.util.*;
import java.io.*;

public class GetName{
    private int unusual;

    public GetName(String gender, int u){
	csv = chooseCSV(gender);
	unusual = u;
    }
    public String chooseCSV(String g){
	csv = "";
	if (gender = "male" || gender = "both"){
	    csv = "boys.csv";
	}else if (gender = "female"){
	    csv = "girls.csv";
	}
	return csv;
    }

    public static void main(String[]args) throws IOException{
	
    }
}
