package lab12;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL; 
/*Tried to put cute cat drinking coffee gif but need more time to figure it out,
I will get it eventually!!
*/

import javax.swing.*;
//James Dumitru

public class CoffeeMachine extends JFrame implements ActionListener {
  private static final long serialVersionUID = 1L;
  
  JLabel l1, l2, l3, l4, l5, l6, l7;
  JFrame f;
  JButton b1, b2;
  JTextField t1, t2, t3;
  JCheckBox cream, raw, espresso; 
  private JRadioButton small;
  private JRadioButton medium;
  private JRadioButton large;
  private ButtonGroup group;

//create the menu bar
		JMenuBar menuBar = new JMenuBar();
		// add the File menu
		JMenu mnFile = new JMenu("File");

		// add a File menu item
		JMenuItem mntmExit = new JMenuItem("Exit");

		// add the Help menu
		JMenu mnHelp = new JMenu("Help");

		// add a Help menu item
		JMenuItem mntmAbout = new JMenuItem("About");   

  CoffeeMachine() 
  {
	// display the menu bar on the frame
	  menuBar = new JMenuBar();
    l1 = new JLabel(" Customer Name");
    l2 = new JLabel(" amount to pay");
    l3 = new JLabel("  ");
    l4 = new JLabel("  ");
    l5 = new JLabel("  ");
    l6 = new JLabel("  ");
    l7 = new JLabel("  ");
    
    f  = new JFrame ("Animation");
    
    b1 = new JButton("COMPUTE");
    b2 = new JButton("EXIT");
  
    t1 = new JTextField(10);
    t2 = new JTextField(10);

    small = new JRadioButton("small", true);
    medium = new JRadioButton("medium", true);
    large = new JRadioButton("large", false);
    group = new ButtonGroup();
    group.add(small);
    group.add(medium);
    group.add(large);

    cream = new JCheckBox("cream", false);
    raw = new JCheckBox("raw sugar", false);
    espresso = new JCheckBox("espresso shot", false);
    
    add(l1);
    add(t1);
    add(l7);
    add(small);
    add(medium);
    add(large);
    add(cream);
    add(raw);
    add(espresso);
    add(l3);
    add(l2);
    add(t2);
    add(l5);
    add(l6);
    add(b1);
    add(b2);
    
    add(menuBar);
    menuBar.add(mnFile);
    mnFile.add(mntmExit);
    menuBar.add(mnHelp);
    mnHelp.add(mntmAbout);
    setJMenuBar(menuBar);
    
    b1.addActionListener(this);
    b2.addActionListener(e -> System.exit(0));
    mntmExit.addActionListener(e -> System.exit(0));
    
 // the Help menu item listener
 		mntmAbout.addActionListener(new ActionListener() {
 		 public void actionPerformed(ActionEvent arg0)
 		 {
 		   JOptionPane.showMessageDialog(null, "James's coffee program version .01 (BETA)", 
 		   "About", JOptionPane.PLAIN_MESSAGE);
 		 }
 	});

    
    setSize(500,300);
    setLayout(new GridLayout(3,2));
    setTitle("Coffee Machine");
  }
  //Tried working out the gif but still no luck >:C
  public static void main1(String args[]) throws MalformedURLException
  {
	  URL url = new URL("<Cat Coffee GIF by hoppip-source.gif>");
      Icon icon = new ImageIcon(url);
      JLabel label = new JLabel(icon);

      JFrame f = new JFrame("Animation");
      f.getContentPane().add(label);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.pack();
      f.setLocationRelativeTo(null);
      f.setVisible(true);
     
}//gif end
  public void actionPerformed(ActionEvent ae)
  {
    float price = 0;
    String a = "", message = ""; 
    if (cream.isSelected() == true) 
    {
      // pIf picked cream, amount is $0.00 added because why pay a dollar for cream in your coffee??
    	price = price + 0;
    } 
    if (raw.isSelected() == true) 
    {
      // If picked raw sugar, amount is $0.00 added because why pay a dollar for sugar in your coffee??
    	price = price + 0;
    } 
    if (espresso.isSelected() == true) 
    {
      // If picked expresso type coffee, amount is $3.00 added
    	price = price + 3;
    } 
    if (small.isSelected() == true) 
    {
	System.out.println("small");
      // If picked small, amount is $1.00 added
	price = price + 1;
    }
    if (medium.isSelected() == true) {
    	// If picked medium, amount is $3.00 added
    	price = price + 3;
    }
    if (large.isSelected() == true) 
    {
	System.out.println("large");
      // If picked Large, amount is $5.00 added
	price = price + 5;
    }
    		 
    if(ae.getSource() == b1)
    {
      a = t1.getText();
      
      message = "your order: " + a + " $" + price;
      t2.setText("thank you: " + a );
    if (a.charAt(0) >= '0' && a.charAt(0) <= '9') {
    JOptionPane.showMessageDialog(null, "Please enter valid name ",
    	  " ", JOptionPane.PLAIN_MESSAGE);
   	  revalidate();
    } 
    else {
    t2.setText(String.valueOf(price));
    JOptionPane.showMessageDialog(null, "Summary: \n" + message, 
		  "Order Summary", JOptionPane.PLAIN_MESSAGE);
  }
  }
  }

  public static void main(String args[]) {
	  CoffeeMachine a = new CoffeeMachine();
    a.setVisible(true);
    a.setLocation(200,200);
  }
}//end