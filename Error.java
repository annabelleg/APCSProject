import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Error extends JFrame{
    private Container pane;
    private JTextArea text;

    public Error(){
	this.setTitle("Sorry!");
	this.setSize(300,200);
	this.setLocation(300,150);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());
	
	text = new JTextArea("Sorry, that name is already in our system! \nPlease close this window \nand try again with a new name.");
	pane.add(text);
    }
    public static void main(String[]args){
	Error e = new Error();
	e.setVisible(true);
    }
}
