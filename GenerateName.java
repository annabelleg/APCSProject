import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class GenerateName extends JFrame implements ActionListener{
    private Container pane;

    public GenerateName(){
	this.setTitle("Aaron and Annabelle's Name Generator!");
	this.setSize(500,500);
	this.setLocation(200,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	pane.add(new Label("Let's find you a name!"));
	pane.add(new Label("Just answer all the questions below"));
	pane.add(new Label("and we will give you your top 3 matches."));
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
