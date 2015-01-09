import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class EnterNewName extends JFrame implements ActionListener{
    private Container pane;
    private JTextArea text;

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
	JPanel radioPanel = new JPanel(new GridLayout(0, 1));
        radioPanel.add(BoyButton);
        radioPanel.add(GirlButton);
	radioPanel.add(BothButton);

	/*JRadioButton 1Button = new JRadioButton("1");
	JRadioButton 2Button = new JRadioButton("2");
	JRadioButton 3Button = new JRadioButton("3");
	JRadioButton 4Button = new JRadioButton("4");
	JRadioButton 5Button = new JRadioButton("5");
	JRadioButton 6Button = new JRadioButton("6");
	JRadioButton 7Button = new JRadioButton("7");
	JRadioButton 8Button = new JRadioButton("8");
	JRadioButton 9Button = new JRadioButton("9");
	JRadioButton 10Button = new JRadioButton("10");
	ButtonGroup group2 = new ButtonGroup();
	group2.add(1Button);
	group2.add(2Button);
	group2.add(3Button);
	group2.add(4Button);
	group2.add(5Button);
	group2.add(6Button);
	group2.add(7Button);
	group2.add(8Button);
	group2.add(9Button);
	group2.add(10Button);
	JPanel radioPanel2 = new JPanel(new GridLayout(0, 1));
        radioPanel2.add(1Button);
        radioPanel2.add(2Button);
        radioPanel2.add(3Button);
        radioPanel2.add(4Button);
        radioPanel2.add(5Button);
        radioPanel2.add(6Button);
        radioPanel2.add(7Button);
        radioPanel2.add(8Button);
        radioPanel2.add(9Button);
        radioPanel2.add(10Button);*/
	add(radioPanel, BorderLayout.LINE_START);
	//add(radioPanel2, BorderLayout.LINE_START);
	
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
