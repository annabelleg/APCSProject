import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class GenerateName extends JFrame implements ActionListener{
    private Container pane;
    private JTextArea text, text2, text3, text4, text5, text6;
    private JButton enter;
    private JTextField name;
    private ButtonGroup gender, unusual, oldfashioned;

    public GenerateName(){
	this.setTitle("Aaron and Annabelle's Name Generator!");
	this.setSize(500,500);
	this.setLocation(200,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	text = new JTextArea("Let's find you a name!\nJust answer all the questions below\nand we will give you your top 3 matches.");
	text.setEditable(false);
	pane.add(text);

        
		
	JRadioButton BoyButton = new JRadioButton("Boy");
	BoyButton.setSelected(true);
	JRadioButton GirlButton = new JRadioButton("Girl");
	JRadioButton BothButton = new JRadioButton("Both");
        unusual = new ButtonGroup();
	unusual.add(BoyButton);
	unusual.add(GirlButton);
	unusual.add(BothButton);
	JPanel radioPanel = new JPanel(new GridLayout(1, 0));
        radioPanel.add(BoyButton);
        radioPanel.add(GirlButton);
	radioPanel.add(BothButton);

	JRadioButton Button1 = new JRadioButton("1");
	JRadioButton Button2 = new JRadioButton("2");
	JRadioButton Button3 = new JRadioButton("3");
	JRadioButton Button4 = new JRadioButton("4");
	JRadioButton Button5 = new JRadioButton("5");	
	Button5.setSelected(true);
	JRadioButton Button6 = new JRadioButton("6");
	JRadioButton Button7 = new JRadioButton("7");
	JRadioButton Button8 = new JRadioButton("8");
	JRadioButton Button9 = new JRadioButton("9");
	JRadioButton Button10 = new JRadioButton("10");
	ButtonGroup group2 = new ButtonGroup();
	group2.add(Button1);
	group2.add(Button2);
	group2.add(Button3);
	group2.add(Button4);
	group2.add(Button5);
	group2.add(Button6);
	group2.add(Button7);
	group2.add(Button8);
	group2.add(Button9);
	group2.add(Button10);
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
	JRadioButton B5 = new JRadioButton("5");
	B5.setSelected(true);
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
	add(radioPanel, BorderLayout.LINE_START);
	text3 = new JTextArea("Rate how unusual the name is from 1 to 10,\nwith 10 being the most unusual");
	text3.setEditable(false);
	pane.add(text3);
	text4 = new JTextArea("Ex. Mary would be rated a 1, Ximena would be rated a 10");
	text4.setEditable(false);
	pane.add(text4);
	add(radioPanel2, BorderLayout.LINE_START);
	text5 = new JTextArea("Rate how old-fashioned the name is from 1 to 10,\nwith 10 being the most old-fashioned");
	text5.setEditable(false);
	pane.add(text5);
	text6 = new JTextArea("Ex. Mary would be rated a 10, Ximena would be rated a 1");
	text6.setEditable(false);
	pane.add(text6);
	add(radioPanel3, BorderLayout.LINE_START);
	

	enter = new JButton("Give me a name!");
	pane.add(enter);
	enter.setActionCommand("go");
	enter.addActionListener(this);
    }

    public String buttonVal(ButtonGroup b){
	for (Enumeration<AbstractButton> buttons = b.getElements(); buttons.hasMoreElements();){
	    AbstractButton button = buttons.nextElement();
	    if (button.isSelected()){
		return button.getText();
	    }
	}
	return null;
    }

    public void collectData(){
	ArrayList<Integer> values = new ArrayList<Integer>();
	values.add(Integer.parseInt(buttonVal(unusual)));
	values.add(Integer.parseInt(buttonVal(oldfashioned)));
	String csv = "";
	if (buttonVal(gender).equals("Boy")) csv = "boys.csv";
	if (buttonVal(gender).equals("Girl")) csv = "girls.csv";
	if (buttonVal(gender).equals("Both")) csv = "both";
    }

    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	if (action.equals("go")){
	    Person p = new Person("", buttonVal(unusual), buttonVal(oldfashioned), "");
	}
    }  

    public static void main(String[]args){
	GenerateName g = new GenerateName();
	g.setVisible(true);
    }


    
    public static int calculate(ArrayList<Object> me, ArrayList<Object> you){
	int dif = 0;
	for (int i = 0; i < me.size(); i++){
	    if (me.get(i) instanceof Integer){
		dif += Math.abs(Integer.parseInt(me.get(i).toString()) - Integer.parseInt(you.get(i).toString()));
	    }
	    if (me.get(i) instanceof String){
		if (me.get(i).equals(you.get(i))){
		    dif -= 3;
		}else{
		    dif += 3;
		}
	    }
	}
	return 100 - dif;
    }

    public static ArrayList<String[]> loadAllNames(String file){
	String s = "Hi Mr. K!";
	ArrayList<String[]> dictionary = new ArrayList<String[]>();
     
	try {
	    FileReader f = new FileReader(file);
	    BufferedReader b = new BufferedReader(f);
 
	    while( s != null ) {
		s = b.readLine();
		if ( s != null )
		    dictionary.add(s.split(", "));
            }
	    
        }
	catch (IOException e) {}
   

	return dictionary;
    }
    
    public static ArrayList<String> allNames(String file){
	ArrayList<String[]> dic = loadAllNames(file);
	ArrayList<String> names = new ArrayList<String>();
	for (int i = 0; i<dic.size(); i++) {
	    names.add(dic.get(i)[0]);
	}
	return names;
    }
    
    public static ArrayList<ArrayList<Object>> attributeAll(String file) {
	ArrayList<String[]> dic = loadAllNames(file);
    	ArrayList<ArrayList<Object>> att = new ArrayList<ArrayList<Object>>();
    	for (int i = 0; i< dic.size(); i++) { //go thru arraylist of string arrays
	    ArrayList<Object>  blah = new ArrayList<Object>(); //temp array
	    for (int j = 1; j<dic.get(i).length; j++) { //go thru each string array 
		if (tryParse(dic.get(i)[j]) != null){
		    blah.add(Integer.parseInt(dic.get(i)[j]));
		}else{
		    blah.add(dic.get(i)[j]);
		}
		
		att.add(blah);
	    }
	}
	return att;
    }

    public static Integer tryParse(String text) {
	try {
	    return new Integer(text);
	} catch (NumberFormatException e) {
	    return null;
	}
    }

    public static String findMatch(ArrayList<Object> criteria, String file)  throws IOException{
	ArrayList<String> names = allNames(file);
	ArrayList<ArrayList<Object>> possibilities = attributeAll(file);
	int champPercent = calculate(criteria, possibilities.get(0));
	int champIndex = 0;
	for (int i = 1; i< possibilities.size(); i++) {
	    if (calculate(criteria, possibilities.get(i)) > champPercent) {
		champPercent = calculate(criteria, possibilities.get(i));
		champIndex = i;
	    }
	}
    
	return "The name that most closely matches what you want is " +names.get(champIndex)+" with a "+calculate(criteria, possibilities.get(champIndex))+"% match to what you what in a name!";
    }
}
