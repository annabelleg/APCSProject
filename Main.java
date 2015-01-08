import java.awt.event.*;
import javax.swing.*;
import java.awt.*; //needed for pane
public class GUI extends JFrame implements ActionListener{
    private Container pane, introstuff;
    private JTextArea intro;

    public GUI(){
	this.setTitle("Aaron and Annabelle's Name Generator!");
	this.setSize(500,500);
	this.setLocation(200,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new GridLayout(1,1));//set this based on what will be good
	
	intro = new JTextArea("Welcome to our name generator. \nYou can either enter a name into our system,\n or have a name generated for you based on some questions we ask you. \nWhich would you like to do?", null, JLabel.CENTER);

	introstuff = new Container();
	introstuff.setLayout(new FlowLayout());
	introstuff.add(intro);

	pane.add(introstuff);
    }

    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
    }

    public static void main(String[]args){
	GUI g = new GUI();
	g.setVisible(true);
    }
}
