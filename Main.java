import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Main extends JFrame implements ActionListener{
    private Container main,pane,pane2, pane3, introstuff;
    private JButton entername, generatename;
    private JTextArea text;

    public Main(){
	this.setTitle("Aaron and Annabelle's Name Generator!");
	this.setSize(500,250);
	this.setLocation(200,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new GridLayout(3,1));

	text = new JTextArea("Welcome to our name generator! You can either enter a name into our system \nor have a name generated for you based on some questions we ask you.\n Which would you like to do?");
	text.setEditable(false);

	
	pane.add(text);
	entername = new JButton("Enter a new name!");
	generatename = new JButton("Give me a name!");

	entername.setActionCommand("new");
	entername.addActionListener(this);
	generatename.setActionCommand("generate");
	generatename.addActionListener(this);

	pane.add(entername); 
	pane.add(generatename);
    }


    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	if (action.equals("new")){
	    EnterNewName n = new EnterNewName();
	    n.setVisible(true);
	    this.dispose();
	}
	if (action.equals("generate")){
	    GenerateName n = new GenerateName();
	    n.setVisible(true);
	    this.dispose();
	}
    }

    public static void main(String[]args){
	Main g = new Main();
	g.setVisible(true);
    }
}
