import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;


public class Shapes extends JFrame {

   public GeometricShapes(){
       setSize(600,600);
       setLayout(null);
       setVisible(true);
      
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       repaint();
   }
  
   public void paint(Graphics g){
      
       int x[]={100,250,175};
       int y[]={100,100,200};
      
       g.setColor(Color.red);
       g.fillPolygon(x, y, 3);
      
       g.setColor(Color.yellow);
       g.fillRect(250, 250, 150, 150);
      
       g.setColor(Color.blue);
       g.fillRect(50, 210, 150, 100);
      
       g.setColor(Color.GREEN);
       g.fillOval(300, 100, 100, 100);
   }
  
   public static void main(String a[]){
       new GeometricShapes();
   }
}