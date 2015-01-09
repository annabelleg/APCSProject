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
