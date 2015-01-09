import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Main extends JFrame implements ActionListener{
    private Container pane;

  public EnterNewName(){
	this.setTitle("Aaron and Annabelle's Name Generator!");
	this.setSize(500,500);
	this.setLocation(200,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	pane.add(new Label("Here you can a new name to our curremt list"));
	pane.add(new Label("This name can then be accesed by other users"));
	pane.add(new Label("And can widen the variety of our name generator"));
  pane.add(new JTextField(12));
  pane.add(new JButton("Add Name!"));


	entername = new JButton("Enter a new name");
	
    }
    public static void main(String[]args){
	Main g = new Main();
	g.setVisible(true);
    }
}
