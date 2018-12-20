import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//James Dumitru
public class SimpleGUI extends JFrame implements ActionListener
{
  private static final long serialVersionUID = 1L;
  JLabel l1, l2, l3, l4, l5;
  JButton b1, b2; 
  JTextField t1, t2, t3, t4;
  JCheckBox check1;
  
  SimpleGUI() 
  {
    l1 = new JLabel(" Current Salary");
    l2 = new JLabel(" Percent Rate");
    l3 = new JLabel("Input Difference & Get New Salary");
    check1 = new JCheckBox("Bonus Pay");
    l5 = new JLabel("  ");
    l4 = new JLabel("  ");
    b1 = new JButton("Compute");
    b2 = new JButton("EXIT");
    t1 = new JTextField(10); 
    t2 = new JTextField(10); 
    t3 = new JTextField(10); 
    t4 = new JTextField(10);
	check1.setSelected(true);
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);
    add(t3);
    add(check1);
    add(l4);
    add(l5);
    add(t4);
    
    
    
    //new buttons 
    add(b1);
    add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b2.addActionListener(e -> System.exit(0));
	
    setSize(500,300);
    setLayout(new GridLayout(7,2));
    setTitle("Salary Calculator");
  }
  public void actionPerformed(ActionEvent ae){
    float a, b, c, d, e;
    if (check1.isSelected()) {
    if(ae.getSource() == b1)
    {
      a = Float.parseFloat(t1.getText());
      b = Float.parseFloat(t2.getText());
      c = Float.parseFloat(t3.getText());
      d = a + b * a / 100 + c;
      t3.setText(String.valueOf(d)); //current salary
    }
    else {
    	System.out.println("Please check the checkbox");
    }
    if(ae.getSource() == b2)
    {
    System.exit(0);
    }
    }
    }
  public static void main(String args[])
  {
    SimpleGUI a = new SimpleGUI();
    a.setVisible(true);
    a.setLocation(200, 200);
  }
}	
