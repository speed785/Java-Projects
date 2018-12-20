import javax.swing.*;
import java.awt.event.*;

public class JavaMenus extends JFrame {

	public JavaMenus()
	{
		super("Java Menu Example");
		
		JMenu file = new JMenu("File");
		file.setMnemonic('F');
		JMenuItem ItemNew = new JMenuItem("New");
		ItemNew.setMnemonic('N');
		file.add(ItemNew);
		JMenuItem ItemOpen = new JMenuItem("Open");
		ItemOpen.setMnemonic('O');
		file.add(ItemOpen);	
		JMenuItem ItemExit = new JMenuItem("Exit");
		ItemExit.setMnemonic('x');
		file.add(ItemExit);
		
		JMenu file2 = new JMenu("Edit"); //2nd col add
		file2.setMnemonic('i');
		
		JMenuItem ItemEdit = new JMenuItem("Edit");
		file2.add(ItemEdit);	
		//comment
		
		JMenu file3 = new JMenu("Draw"); //3rd col add
		file3.setMnemonic('D');
		JMenuItem ItemDraw = new JMenuItem("Draw");
		file3.add(ItemDraw);	
				 //comment
		final JLabel label1 = new JLabel(" Welcome");
		
	     	add(label1);
	      	this.setSize(100, 100);
		setVisible(true);
				
		//add the listeners
		ItemNew.addActionListener(
				
		 new ActionListener() {
		  public void actionPerformed(ActionEvent e)
		  {
			label1.setText(" New");
			JOptionPane.showMessageDialog(null, "New was Clicked", 
			   "Result", JOptionPane.PLAIN_MESSAGE);
			 }
			}
		);
		ItemOpen.addActionListener(
		  new ActionListener(){
		    public void actionPerformed(ActionEvent e)
		    {
			label1.setText(" Open");
			JOptionPane.showMessageDialog(null, "Open was Clicked", 
			   "Result", JOptionPane.PLAIN_MESSAGE);
		    }
		   }
		);

		ItemExit.addActionListener(
		  new ActionListener(){
		    public void actionPerformed(ActionEvent e)
		    {
			label1.setText(" Exit");
			JOptionPane.showMessageDialog(null, "Exit was Clicked", 
			   "Result", JOptionPane.PLAIN_MESSAGE);
		    }
		  }
		);						

		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		//add cols to bar
		bar.add(file);
		bar.add(file2);
		bar.add(file3);		
		
		getContentPane();
		setSize(250, 250);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		JavaMenus appMenu = new JavaMenus();
		appMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

