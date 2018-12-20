import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class Test extends JFrame {
   Container contentPane = getContentPane();
   JPanel pnl = new JPanel();
   JPanel pnl1 = new JPanel();
   JPanel pnl2 = new JPanel();
   JPanel pnl3 = new JPanel();
   JPanel grid = new JPanel(new GridLayout(2, 2));

   public Test() {
       super("Swing Window");
       setSize(500, 200);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       pnl.add(new JButton("Yes"));
       pnl.add(new JButton("No"));
       pnl.add(new JButton("Cancel"));

       pnl1.add(new JCheckBox("Check box1"));
       pnl1.add(new JCheckBox("Check box2"));
       pnl1.add(new JCheckBox("Check box3"));
       pnl1.add(new JCheckBox("Check box4"));
       pnl1.add(new JCheckBox("Check box5"));

       pnl2.add(new JRadioButton("Radio1"));
       pnl2.add(new JRadioButton("Radio2"));
       pnl2.add(new JRadioButton("Radio3"));
       pnl2.add(new JRadioButton("Radio4"));

       pnl3.add(new JButton("West"));
       JTextField textField = new JTextField("Text");

       textField.setFont(new java.awt.Font("Arial", Font.ITALIC, 15));
       textField.setBackground(Color.BLUE);

       pnl3.add(textField);

       grid.add(new JButton("1"));
       grid.add(new JButton("2"));
       grid.add(new JButton("3"));
       grid.add(new JButton("4"));
       contentPane.add("North", pnl);
       contentPane.add("Center", grid);
       contentPane.add("West", pnl3);

       contentPane.add("East", pnl2);
       contentPane.add("South", pnl1);

       setVisible(true);
   }

   public static void main(String[] args) {
       Test gui = new Test();
   }
}