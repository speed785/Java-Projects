/*James Dumitru
 * March 31,2018
 * ITM 311
 * */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.applet.Applet;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
public class GardenShop extends Applet implements ItemListener, ActionListener{
   // buttons,checkbox,combobox and radiobutton
   JButton jb1,jb2,jb3,jb4,jb5;
   Checkbox cb1,cb2,cb3;
   JComboBox cob1,cob2,cob3,cob4,cob5;
   JRadioButton rb1,rb2,rb3;
   //button info
public void init(){
   jb1=new JButton("Contract Info");
   jb2= new JButton("Garden Supply Products");
   jb3=new JButton("Feature Gardening tips");
   jb4=new JButton("Plants sold at the facility");
   jb5=new JButton("Center(Combo Box)");
//Layout of buttons   
setLayout(new BorderLayout());
add("North", jb1 );
add("South",jb2 );
add("East", jb3);
add("West", jb4);
add("Center", jb5);

//Images placed with the layout
ImageIcon img = new ImageIcon("//Users/James/Desktop/fctg-citrus.jpg");
   jb1.setIcon((img));
     
   ImageIcon img1 = new ImageIcon("//Users/James/Desktop/supplies.jpg");
   jb2.setIcon((img1));
     
   ImageIcon img2 = new ImageIcon("//Users/James/Desktop/cheap-and-easy-garden-tips-featured-2.jpg");
   jb3.setIcon((img2));
     
   ImageIcon img3 = new ImageIcon("//Users/James/Desktop/73130-049-642D6938.jpg");
   jb4.setIcon((img3));
     
   ImageIcon img4 = new ImageIcon("//Users/James/Desktop/cherrytree.jpg");
   jb5.setIcon((img4));
}

public void itemStateChanged(ItemEvent ie){
}
//Can implement as we want to implement as mentioned in a problem
public void actionPerformed(ActionEvent ae)
{
   if(ae.getSource()==jb1){
       System.out.println("Show Contract Info");
   }
   if(ae.getSource()==jb2){
       cb1=new Checkbox("Garden tools");
       cb2=new Checkbox("Fertilizer");
       cb3=new Checkbox("Pest control");
       add(cb1);
       add(cb2);
       add(cb3);
   }
   if(ae.getSource()==jb3){ 
   }
   if(ae.getSource()==jb4){
   }
   if(ae.getSource()==jb5)
   {
   }
}
}