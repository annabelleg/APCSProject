import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class GenerateName extends JFrame implements ActionListener{
    private Container pane;
    private JTextArea text, text2, text3, text4;
    // private JTextField name;
    //   private String 
    private JButton enter;
    private ButtonGroup unusual;

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

	text2 = new JTextArea("Do you want a boy's name, a girl's name, or one that works for either?");
	text2.setEditable(false);
	pane.add(text2);
	add(radioPanel, BorderLayout.LINE_START);
	text3 = new JTextArea("Choose how unusual the name you want is from 1 to 10");
	text3.setEditable(false);
	pane.add(text3);
	text4 = new JTextArea("Ex. Mary and John would be rated a 1, Ximena and Ryker would be rated a 10");
	text4.setEditable(false);
	pane.add(text4);
	add(radioPanel2, BorderLayout.LINE_START);
	

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
    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	if (action.equals("go")){
	    Person p = new Person("", buttonVal(unusual));
	    Person.comparePeople(p);
	}
    }  
    public static void main(String[]args){
	GenerateName g = new GenerateName();
	g.setVisible(true);
    }
}
