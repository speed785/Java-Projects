import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class JStroke extends JPanel
{
  public void paintComponent(Graphics gr)
  {
    super.paintComponent(gr);
    Graphics2D gr2D = (Graphics2D)gr;
    BasicStroke aStroke = new BasicStroke(10.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND);
    gr2D.setStroke(aStroke);
    gr2D.draw(new Rectangle2D.Double(20,20,200,200));
  }
  public static void main(String[] args)
  {
    JFrame frame = new JFrame();
    frame.add(new JStroke());
    frame.setSize(160, 180);
    frame.setVisible(true);
  }
}

