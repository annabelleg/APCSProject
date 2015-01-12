import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class EnterNewName extends JFrame implements ActionListener{
    private Container pane;
    private JTextArea text, text2, text3, text4;

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
	pane.add(new JTextField(12));


	
	
	JRadioButton BoyButton = new JRadioButton("Boy");
	JRadioButton GirlButton = new JRadioButton("Girl");
	JRadioButton BothButton = new JRadioButton("Both");
	ButtonGroup group = new ButtonGroup();
	group.add(BoyButton);
	group.add(GirlButton);
	group.add(BothButton);
	JPanel radioPanel = new JPanel(new GridLayout(1, 0));
        radioPanel.add(BoyButton);
        radioPanel.add(GirlButton);
	radioPanel.add(BothButton);

	JRadioButton Button1 = new JRadioButton("1");
	JRadioButton Button2 = new JRadioButton("2");
	JRadioButton Button3 = new JRadioButton("3");
	JRadioButton Button4 = new JRadioButton("4");
	JRadioButton Button5 = new JRadioButton("5");
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

	text2 = new JTextArea("Is it a boy's name, a girl's name, or both.");
	text2.setEditable(false);
	pane.add(text2);
	add(radioPanel, BorderLayout.LINE_START);
	text3 = new JTextArea("Rate how unusual the name is from 1 to 10");
	text3.setEditable(false);
	pane.add(text3);
	text4 = new JTextArea("E.X. Mary would be rated a 1, Ximena would be rated a 10");
	text4.setEditable(false);
	pane.add(text4);
	add(radioPanel2, BorderLayout.LINE_START);
	
	pane.add(new JButton("Add Name!"));
	
    }
    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
    }  
    public static void main(String[]args){
	EnterNewName g = new EnterNewName();
	g.setVisible(true);
    }
}
