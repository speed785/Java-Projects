import javax.swing.*;

class Labels extends JFrame 
{
	JPanel pnl = new JPanel();

	ClassLoader ldr = this.getClass().getClassLoader();
	ImageIcon duke2 = new ImageIcon( ldr.getResource("duke2.png") );

	//ImageIcon duke = new ImageIcon( "duke.png" );
	
	JLabel lbl1 = new JLabel( duke2 ) ;
	JLabel lbl2 = new JLabel( "Duke is the friendly mascot of Java technology." ) ;
	JLabel lbl3 = new JLabel( "Duke", duke2, JLabel.CENTER ) ;

	public Labels()
	{
		//the Frame/Window
		super("Swing Window");
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);

		lbl3.setHorizontalTextPosition(JLabel.CENTER);
		lbl3.setVerticalTextPosition(JLabel.BOTTOM);
		
		lbl1.setToolTipText( "Duke - the Java Mascot" ) ;
		
		pnl.add( lbl1 ) ;
		pnl.add( lbl2 ) ;
		pnl.add( lbl3 ) ;

		setVisible( true );
	}

	public static void main ( String[] args )
	{
		Labels gui = new Labels();
	} 
}

