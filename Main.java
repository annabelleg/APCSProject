import java.awt.event.*;
import javax.swing.*;
import java.awt.*; //needed for pane
public class Main extends JFrame implements ActionListener{
    private Container pane, introstuff;
    private JButton entername, generatename;

    public Main(){
	this.setTitle("Aaron and Annabelle's Name Generator!");
	this.setSize(500,500);
	this.setLocation(200,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());//set this based on what will be good

	pane.add(new Label("Welcome to our name generator."));
	pane.add(new Label("You can either enter a name into our system,"));
	pane.add(new Label(" or have a name generated for you based on some questions we ask you."));
	pane.add(new Label("Which of these two options would you like to do?"));

	entername = new JButton("Enter a new name");
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
	    EnterNewName e = new EnterNewName();
	    e.setVisible(true);
	}
//	if (action.equals("generate");
    }

    public static void main(String[]args){
	Main g = new Main();
	g.setVisible(true);
    }
}
