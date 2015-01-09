import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class GenerateName extends JFrame implements ActionListener{
    private Container pane;
    private JTextArea text;

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

	//	pane.add(new JTextField(12));
	//	pane.add(new JButton(""));
	
    }
    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
    }  
    public static void main(String[]args){
        GenerateName g = new GenerateName();
	g.setVisible(true);
    }
}
