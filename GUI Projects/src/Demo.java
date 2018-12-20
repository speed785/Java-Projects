import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Demo {
  public static void main(String[] args)
     {
         Window win = new Window();
     }
}

class Window extends JFrame implements ItemListener {
  JTextArea ta = new JTextArea(5,25);
    JComboBox combo1 = new JComboBox();

  public Window()
  {
    super("Hello Professor!");
    setSize(400,200);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setVisible(true);
    Container ca = getContentPane();
    ca.setBackground(Color.GREEN); //enter color in caps!
    FlowLayout flm = new FlowLayout();
    ca.setLayout(flm);
   String[] styles = { "IIT Rules", "Love Java", "Happy Thanksgiving"};
    JComboBox<String> combo1 = new JComboBox<String>(styles) ;
    combo1.addItemListener(this);
    ca.add(combo1);
    ca.add(ta);
    setContentPane(ca);


  }

  public void itemStateChanged(ItemEvent event) {
    String pick = event.getSource().toString();
    ta.setText(pick);
  }
}
