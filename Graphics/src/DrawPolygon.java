import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {

  public void paint(Graphics g) {
    int[] x = new int[]{100,200,300,400,500,350};
    int[] y = new int[]{400,300,300,100,500,600};
    g.drawPolygon (x, y, x.length);    
  }
}

public class DrawPolygon {
  public static void main(String[] a) {
    JFrame window = new JFrame();
    window.setBounds(30, 30, 300, 300);
    window.getContentPane().add(new MyCanvas());
    window.setVisible(true);
  }
}
