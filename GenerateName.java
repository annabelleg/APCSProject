import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;
 
public class GenerateName extends JFrame implements ActionListener{
    private Container pane;
    private JTextArea text, text2, text3, text4, text5, text6, text7, NAME;
    private JButton enter;
    private JTextField name;
    private ButtonGroup gender, unusual, oldfashioned;
    private JComboBox CountryList;
    private String country;

 public GenerateName(){
	this.setTitle("Aaron and Annabelle's Name Generator!");
	this.setSize(550,700);
	this.setLocation(200,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
       pane.setLayout(new GridLayout(11,1));

	text = new JTextArea("Let's find you a name!\nJust answer all the questions below\nand we will give you your top 3 matches.");
	text.setEditable(false);
	pane.add(text);

        
	JRadioButton BoyButton = new JRadioButton("Boy",true);
	JRadioButton GirlButton = new JRadioButton("Girl");
	JRadioButton BothButton = new JRadioButton("Both");
        gender = new ButtonGroup();
	gender.add(BoyButton);
	gender.add(GirlButton);
	gender.add(BothButton);
	JPanel radioPanel = new JPanel(new GridLayout(1, 0));
        radioPanel.add(BoyButton);
        radioPanel.add(GirlButton);
	radioPanel.add(BothButton);


	JRadioButton Button1 = new JRadioButton("1");
	JRadioButton Button2 = new JRadioButton("2");
	JRadioButton Button3 = new JRadioButton("3");
	JRadioButton Button4 = new JRadioButton("4");
	JRadioButton Button5 = new JRadioButton("5",true);	
	JRadioButton Button6 = new JRadioButton("6");
	JRadioButton Button7 = new JRadioButton("7");
	JRadioButton Button8 = new JRadioButton("8");
	JRadioButton Button9 = new JRadioButton("9");
	JRadioButton Button10 = new JRadioButton("10");
        unusual = new ButtonGroup();
	unusual.add(Button1);
	unusual.add(Button2);
	unusual.add(Button3);
	unusual.add(Button4);
	unusual.add(Button5);
	unusual.add(Button6);
	unusual.add(Button7);
	unusual.add(Button8);
	unusual.add(Button9);
	unusual.add(Button10);
	JPanel radioPanel2 = new JPanel(new GridLayout(1, 0));
        radioPanel2.add(Button1);
        radioPanel2.add(Button2);
        radioPanel2.add(Button3);
        radioPanel2.add(Button4);
        radioPanel2.add(Button5);
        radioPanel2.add(Button6);
        radioPanel2.add(Button7);
        radioPanel2.add(Button8);
        radioPanel2.add(Button9);
        radioPanel2.add(Button10);


	JRadioButton B1 = new JRadioButton("1");
	JRadioButton B2 = new JRadioButton("2");
	JRadioButton B3 = new JRadioButton("3");
	JRadioButton B4 = new JRadioButton("4");
	JRadioButton B5 = new JRadioButton("5",true);
	JRadioButton B6 = new JRadioButton("6");
	JRadioButton B7 = new JRadioButton("7");
	JRadioButton B8 = new JRadioButton("8");
	JRadioButton B9 = new JRadioButton("9");
	JRadioButton B10 = new JRadioButton("10");
	oldfashioned = new ButtonGroup();
	oldfashioned.add(B1);
	oldfashioned.add(B2);
	oldfashioned.add(B3);
	oldfashioned.add(B4);
	oldfashioned.add(B5);
	oldfashioned.add(B6);
	oldfashioned.add(B7);
	oldfashioned.add(B8);
	oldfashioned.add(B9);
	oldfashioned.add(B10);
	JPanel radioPanel3 = new JPanel(new GridLayout(1, 0));
        radioPanel3.add(B1);
        radioPanel3.add(B2);
        radioPanel3.add(B3);
        radioPanel3.add(B4);
        radioPanel3.add(B5);
        radioPanel3.add(B6);
        radioPanel3.add(B7);
        radioPanel3.add(B8);
        radioPanel3.add(B9);
        radioPanel3.add(B10);

	text2 = new JTextArea("Is it a boy's name, a girl's name, or can it be both?");
	text2.setEditable(false);
	pane.add(text2);
	pane.add(radioPanel, BorderLayout.LINE_START);
	text3 = new JTextArea("Rate how unusual the name is from 1 to 10,\nwith 10 being the most unusual \nEx. Mary would be rated a 1, Ximena would be rated a 10");
	text3.setEditable(false);
	pane.add(text3);
	pane.add(radioPanel2, BorderLayout.LINE_START);
	text5 = new JTextArea("Rate how old-fashioned the name is from 1 to 10,\nwith 10 being the most old-fashioned \nEx. Mary would be rated a 10, Ximena would be rated a 1");
	text5.setEditable(false);
	pane.add(text5);
	pane.add(radioPanel3, BorderLayout.LINE_START);



	text7 = new JTextArea("Choose the origin of the name you want.");
	text7.setEditable(false);
	String[] CountryStrings = { "Germanic", "Latin", "Hebrew", "Greek", "Other" };
	CountryList = new JComboBox(CountryStrings);
	pane.add(text7);
	pane.add(CountryList);
	
	enter = new JButton("Give me a name!");
	pane.add(enter);
	enter.setActionCommand("go");
	enter.addActionListener(this);

	NAME = new JTextArea();
	pane.add(NAME);
	NAME.setVisible(false);

    }


    public String buttonVal(ButtonGroup b){
	Enumeration<AbstractButton> buttons = b.getElements();
        while (buttons.hasMoreElements()){
	    AbstractButton button = buttons.nextElement();
	    if (button.isSelected()){
		return button.getText();
	    }
	}
	return null;
    }

    public String getCSV(){
	String csv = "";
	if (buttonVal(gender).equals("Boy")) csv = "boys.csv";
	if (buttonVal(gender).equals("Girl")) csv = "girls.csv";
	if (buttonVal(gender).equals("Both")) csv = "both";
	return csv;
    }

    public static Integer tryParse(String text) {
	try {
	    return Integer.parseInt(text);
	} catch (NumberFormatException e) {
	    return null;
	}
    }
    
    public static int calculate(ArrayList<String> me, ArrayList<String> you){
	int dif = 0;
	for (int i = 0; i < me.size(); i++){
	    if (tryParse((String)me.get(i)) != null){
		dif += 3*Math.abs(Integer.parseInt(me.get(i).toString()) - Integer.parseInt(you.get(i).toString()));
	    }
	    else{
		if (!(me.get(i).equals(you.get(i)))){
		    dif += 25;
		}
	    }
	}
	return 100 - dif;
    }
    
    
    public static ArrayList<String[]> loadAllNames(String file){
	String s = "Hi Mr. K!";
	ArrayList<String[]> dictionary = new ArrayList<String[]>();
	if (file.equals("girls.csv")||file.equals("boys.csv")){
	    try {
		FileReader f = new FileReader(file);
		Scanner b = new Scanner(f);
		
		while( b.hasNextLine() ) {
		    s = b.nextLine();
		    if ( s != null )
			dictionary.add(s.split(", "));
		}
		return dictionary;
	    }
	    catch (IOException e) {}
	}else{
	    ArrayList<String[]> boys = loadAllNames("boys.csv");
	    ArrayList<String[]> girls = loadAllNames("girls.csv");
	    for (int i = 1; i < boys.size(); i++){
		for (int j = 1; j < girls.size(); j++){
		    if (girls.get(j)[0].equals(boys.get(i)[0])){
			dictionary.add(boys.get(i));
		    }
		}
	    }
	}
	return dictionary;
    }
    
    public static ArrayList<String> allNames(String file){
	ArrayList<String> names = new ArrayList<String>();
	ArrayList<String[]> dic = loadAllNames(file);
	for (int i = 0; i<dic.size(); i++) {
	    names.add(dic.get(i)[0]);
	}
	return names;
    }
    public static ArrayList<String> bothNames(){
	ArrayList<String> girls = allNames("girls.csv");
	ArrayList<String> boys = allNames("boys.csv");
	ArrayList<String> names = new ArrayList<String>();
        for (int i = 1; i < girls.size(); i++){
	    if (boys.contains(girls.get(i))){
		names.add(girls.get(i));
	    }
	}
	return names;
    }
    
    public static ArrayList<ArrayList<String>> attributeAll(String file) {
	ArrayList<String[]> dic = loadAllNames(file);
    	ArrayList<ArrayList<String>> att = new ArrayList<ArrayList<String>>();
    	for (int i = 1; i< dic.size(); i++) { 
	    ArrayList<String>  blah = new ArrayList<String>(); 
	    for (int j = 1; j < dic.get(i).length; j++) {  
		blah.add(dic.get(i)[j]);
	    }	
	    att.add(blah);
	}
	
	return att;
    }


    public static String findMatch(Person p, String file)  throws IOException{
	ArrayList<String> criteria = p.values;
	criteria.remove(0);
	ArrayList<String> names = allNames(file);
	ArrayList<ArrayList<String>> possibilities = attributeAll(file);
	int champPercent = 0;
	int champIndex = 0;
	for (int i = 0; i< possibilities.size(); i++) {
	    if (calculate(criteria, possibilities.get(i)) > champPercent) {
		champPercent = calculate(criteria, possibilities.get(i));
		champIndex = i;
	    }
	}
	return "The name that most closely matches what you wanted is " +names.get(champIndex + 1)+" \nwith a "+calculate(criteria, possibilities.get(champIndex))+"% match to what you what in a name!";
    }

    public void actionPerformed(ActionEvent e){
	country = (String)CountryList.getSelectedItem();
	String action = e.getActionCommand();
	if (action.equals("go")){
	    Person p = new Person("", buttonVal(unusual), buttonVal(oldfashioned), country);
	      try {
		  NAME.setText(findMatch(p, getCSV()));
		  NAME.setVisible(true);
	      }
	      catch (IOException x) {
		  System.out.println("you suck");}
	}
    }  

    public static void main(String[]args){
	GenerateName g = new GenerateName();
	g.setVisible(true);
    }

}
