import java.awt.event.*;
import javax.swing.*;
import java.awt.*; //needed for pane
public class GUI extends JFrame implements ActionListener{
    private Container pane;

    public GUI(){
	this.setTitle("Aaron and Annabelle's Name Generator!");
	this.setSize(500,500);
	this.setLocation(200,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new GridLayout(1,1));//set this based on what will be good
    }

    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
    }

    public static void main(String[]args){
	GUI g = new GUI();
	g.setVisible(true);
    }
}
