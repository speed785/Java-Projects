import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//James Dumitru 
public class Ball2 extends Applet implements Runnable {
  Image offscreenImage;
  Graphics offscreenGraphics;

  int x,y,dx,dy,diam,sizex,sizey,c,dc; 
  
  public void init() {
    setBackground(Color.black);
   //diam = size of ball
    x=y=0; dx=dy=1; diam=80; c=0; dc=1;

    // Getting Parameters form the HTML
    sizex=getSize().width;
    sizey=getSize().height;

    offscreenImage = createImage(sizex,sizey);
    offscreenGraphics = offscreenImage.getGraphics();

    // By running several threads the ball would go faster
    (new Thread(Ball2.this)).start();
    (new Thread(Ball2.this)).start();
    (new Thread(Ball2.this)).start();
    (new Thread(Ball2.this)).start();
    (new Thread(Ball2.this)).start();
  }

  public void run() {
    while (true) {
      try {
    	  //for slowing down and speeding up
        Thread.currentThread().sleep(80);
      }
      catch (InterruptedException e) {};

      synchronized(this) {
        x+=dx; y+=dy;
        if ((x<=0)||(x+dx+diam>=sizex)) dx=-dx;
        if ((y<=0)||(y+dy+diam>=sizey)) dy=-dy;

        c+=dc;
        if ((c==0)||(c==255)) dc=-dc;
      }

      repaint();
    }
  }

  public void paint(Graphics g) {
    
    offscreenGraphics.setColor(new Color(c,c,c));
    offscreenGraphics.fillRect(0,0,sizex,sizey);

    offscreenGraphics.setColor(new Color(255-c,255-c,255-c));
    offscreenGraphics.fillArc(x,y,diam,diam,0,360);

    // Converting double to string
    offscreenGraphics.drawString(String.valueOf(x),1,1);
    offscreenGraphics.drawString(String.valueOf(y),1,1);
    offscreenGraphics.drawString(""+dx,1,1);
    offscreenGraphics.drawString(""+dy,1,1);

    g.drawImage(offscreenImage, 0, 0, this);
  }

  public void update(Graphics g) {
    paint(g);
  }

  public void destroy() {
    offscreenGraphics.dispose();
  }
}
