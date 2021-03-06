import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class EnterNewName extends JFrame implements ActionListener{
    private Container pane;
    private JTextArea text, text2, text3, text4, text5, text6, text7;
    private JButton add;
    private JTextField name;
    private JComboBox CountryList;
    private ButtonGroup gender, unusual, oldfashioned;
    private String country;

    public EnterNewName(){
	this.setTitle("Aaron and Annabelle's Name Generator!");
	this.setSize(550,700);
	this.setLocation(200,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new GridLayout(11,1));

	text = new JTextArea("Here you can a new name to our current list!\nThis can help widen the variety of our name generator.");
	text.setEditable(false);
	pane.add(text);

	name = new JTextField(12);
	pane.add(name);
	
	JRadioButton BoyButton = new JRadioButton("Boy");
	BoyButton.setSelected(true);
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
	JRadioButton Button5 = new JRadioButton("5");
	Button5.setSelected(true);
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

	text2 = new JTextArea("Is it a boy's name, a girl's name, or both.");
	text2.setEditable(false);
	pane.add(text2);
	add(radioPanel, BorderLayout.LINE_START);
	text3 = new JTextArea("Rate how unusual the name is from 1 to 10,\nwith 10 being the most unusual \nEx. Mary would be rated a 1, Ximena would be rated a 10");
	text3.setEditable(false);
	pane.add(text3);
	add(radioPanel2, BorderLayout.LINE_START);
	text5 = new JTextArea("Rate how old-fashioned the name is from 1 to 10,\nwith 10 being the most old-fashioned \nEx. Mary would be rated a 10, Ximena would be rated a 1");
	text5.setEditable(false);
	pane.add(text5);
	add(radioPanel3, BorderLayout.LINE_START);
	text7 = new JTextArea("What is the name's origin?");
	text7.setEditable(false);
	pane.add(text7);

	String[] CountryStrings = { "Germanic", "Latin", "Greek", "Hebrew", "Other" };
	CountryList = new JComboBox(CountryStrings);
	pane.add(CountryList);
	
	add = new JButton("Add Name!");
	pane.add(add);
	add.setActionCommand("go");
	add.addActionListener(this);
	
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

    public void collectData() throws IOException{
	String csv = "";
	if (buttonVal(gender).equals("Boy")) csv = "boys.csv";
	if (buttonVal(gender).equals("Girl")) csv = "girls.csv";
	if (buttonVal(gender).equals("Both")) csv = "both";
	if (checkName(name.getText(), csv)){
	    Person p = new Person(name.getText(), buttonVal(unusual), buttonVal(oldfashioned), country);
	    AddName(p, csv);
	    Finished f = new Finished();
	    f.setVisible(true);
	    this.dispose();
	}else{
	    Error e = new Error();
	    e.setVisible(true);
	    e.toFront();
	    //  this.toBack();
	}
    }
    
    public boolean checkName(String name, String file){
	if (file.equals("boys.csv") || file.equals("girls.csv")){
	    File f = new File(file);
	    try {
		Scanner scanner = new Scanner(f);
		while (scanner.hasNextLine()) {
		    String line = scanner.nextLine();
		if (line.contains(name)) { 
		    return false;
		}
		}
	    } catch(FileNotFoundException e) {}
	    return true;
	}else{
	    if (checkName(name, "boys.csv")){
		return checkName(name, "girls.csv");
	    }else{ return false; }
	}
    }
    
    public void AddName(Person p, String csv) throws IOException{
	String content = p.qualities();
	if (csv.equals("boys.csv") || csv.equals("girls.csv")){
	    FileWriter w = new FileWriter(csv, true);
	    w.write(content);
	    w.close();
	} else {
	    AddName(p,"boys.csv");
	    AddName(p,"girls.csv");
	}
    }

    public void actionPerformed(ActionEvent e){
	country = (String)CountryList.getSelectedItem();
	String action = e.getActionCommand();
	try {
	    if (action.equals("go")){
		collectData();
	    }
	} catch (IOException e1) {
	    throw new RuntimeException(e1);
	}
    }  

    public static void main(String[]args){
	EnterNewName g = new EnterNewName();
	g.setVisible(true);
    }
}
