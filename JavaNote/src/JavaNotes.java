//James Dumitru 
//Jan 19,2018

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class JavaNotes 
{
	//Here is that math problem written in the Java language.
	
	public static void main(String args[]) 
	{
	  DecimalFormat twoPlace = new DecimalFormat("0.00");
	 
	  //First, knowing that the area of a circle is 
	  double A = 62.80, r = 0, C = 0; 
	  
	  //Computes the radius = r
	  r = Math.sqrt(A / 3.1416); 
	  
	  //Computes the circumference = C 
	  C  =  2 * 3.1416 * r;
	  
	  //Computes the Surface Area
	  A  =  4 * 3.1416 * r * r;
	  
	  //Displays the circumference & surface area, which is C & A 
	  JOptionPane.showMessageDialog(null, "the circumference is: " + twoPlace.format(C) + " and the surface area is: " + twoPlace.format(A), "Result", JOptionPane.PLAIN_MESSAGE);
	}
}
