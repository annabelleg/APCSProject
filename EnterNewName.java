import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class EnterNewName extends JFrame implements ActionListener{
    private Container pane;
    private JTextArea text, text2, text3, text4, text5, text6;
    private JButton add;
    private JTextField name;
    private ButtonGroup gender, unusual, oldfashioned;

    public EnterNewName(){
	this.setTitle("Aaron and Annabelle's Name Generator!");
	this.setSize(500,500);
	this.setLocation(200,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	text = new JTextArea("Here you can a new name to our current list!\n This can help widen the variety of our name generator.");
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
	Button5.setSelected(true);
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
	Person p = new Person(name.getText(), buttonVal(unusual), buttonVal(oldfashioned));
	String csv = "";
	if (buttonVal(gender).equals("Boy")) csv = "boys.csv";
	if (buttonVal(gender).equals("Girl")) csv = "girls.csv";
	if (buttonVal(gender).equals("Both")) csv = "both";
	AddName(p, csv);
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
	String action = e.getActionCommand();
	if (action.equals("go")){
	    
	}
    }  

    public static void main(String[]args){
	EnterNewName g = new EnterNewName();
	g.setVisible(true);
    }
}
