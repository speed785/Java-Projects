import javax.swing.*;

class Buttons extends JFrame 
{
	JPanel pnl = new JPanel();

	ClassLoader ldr = this.getClass().getClassLoader();

	java.net.URL tickURL = ldr.getResource("Tick.png");
	java.net.URL crossURL = ldr.getResource("Cross.png");

	ImageIcon tick = new ImageIcon( tickURL );
	ImageIcon cross = new ImageIcon( crossURL );

	//ImageIcon tick = new ImageIcon( "tick.png" );
	//ImageIcon cross = new ImageIcon( "cross.png" );

	JButton btn = new JButton( "Click Me" );
	JButton tickBtn = new JButton( tick );//notice no double quotes
	JButton crossBtn = new JButton( "STOP", cross );
}

