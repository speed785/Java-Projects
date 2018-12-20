
import java.awt.*; 
 import javax.swing.*; 
 
 // Create a simple GUI window
 public class JFrame1 {
 
    private static void createWindow() {
 
       //Create and set up the window. 
       JFrame frame = new JFrame("Simple GUI");
       frame.setSize(400,400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       frame.setVisible(true); 
 
	//create and set up the label
       JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER); 
       textLabel.setPreferredSize(new Dimension(300, 100)); 

       frame.getContentPane().add(textLabel, BorderLayout.CENTER); 
 
       //Display the window. 
       frame.setLocationRelativeTo(null); 
       frame.pack();
      
    }
 
    public static void main(String[] args) {
 
       createWindow();
 
    }
 }
