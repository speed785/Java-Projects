//import GUI packages
//import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

//swing components [look for the “Js”]
import javax.swing.JFrame;
import javax.swing.JLabel;

//create the class
public class JFrameEx {

	//invoke main
	public static void main(String[] args)
	  {
	    //set frame dimensions For JFrame, font characteristics
	    final int FRAME_WIDTH = 250;
	    final int FRAME_HEIGHT = 100;
	    
   //font characteristics/attributes
	    Font headlineFont = new Font("Arial", Font.BOLD, 36);

	    //frame attributes
	    JFrame aFrame = new JFrame("Frame with font");
	    aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	    aFrame.setVisible(true);

	    //JLabel object and attributes
	    JLabel greeting = new JLabel("Good Day");
	    greeting.setFont(headlineFont);

	    aFrame.add(greeting);
	  }
}

