/* This file creates a GUI after EnterNewName and GenerateName has finished that asks you what you want your next step to be,
1) generate another name,
2) enter a new name, or 
3) quit the program. */

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Finished extends JFrame implements ActionListener{
    private Container pane, introstuff;
    private JButton entername, generatename, end;
    private JTextArea text;

    public Finished(){
	this.setTitle("Aaron and Annabelle's Name Generator!");
	this.setSize(400,200);
	this.setLocation(100,200);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new GridLayout(4,1));

	text = new JTextArea("Thank you!! What would you like to do now?");
	text.setEditable(false);

pane.add(text);
	entername = new JButton("Enter a new name!");
	generatename = new JButton("Give me a name!");
	end = new JButton("Quit the program :( ");

	entername.setActionCommand("new");
	entername.addActionListener(this);
	generatename.setActionCommand("generate");
	generatename.addActionListener(this);
	end.setActionCommand("end");
	end.addActionListener(this);

	pane.add(entername);
	pane.add(generatename);
	pane.add(end);
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
	if (action.equals("end")){
	    this.dispose();
	}
    }

    public static void main(String[]args){
	Finished g = new Finished();
	g.setVisible(true);
    }

}
