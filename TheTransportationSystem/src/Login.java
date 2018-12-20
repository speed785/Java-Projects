import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
//coded by James Dumitru 
public class Login {

	JFrame frmTransportationSystem;
	private JTextField txtWelcome;
	private JButton btnNewButton;
	private JPasswordField pwdPassword;
	private JLabel txtUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Main frame/application window
					Login window = new Login();
					window.frmTransportationSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTransportationSystem = new JFrame();
		frmTransportationSystem.setTitle("Transportation System");
		//I like pink
		frmTransportationSystem.getContentPane().setBackground(Color.PINK);
		frmTransportationSystem.getContentPane().setLayout(null);
		
		//Goes to transport methods
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTransportationSystem.setVisible(false);
				Transportation frame = new Transportation();
				frame.setVisible(true);
			}

//			
		});
		btnLogin.setBounds(56, 226, 152, 51);
		frmTransportationSystem.getContentPane().add(btnLogin);
		//welcome message
		txtWelcome = new JTextField();
		txtWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcome.setText("Welcome to the Transportation System");
		txtWelcome.setBounds(56, 40, 345, 83);
		frmTransportationSystem.getContentPane().add(txtWelcome);
		txtWelcome.setColumns(10);
		//closes app
		btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(249, 226, 152, 51);
		frmTransportationSystem.getContentPane().add(btnNewButton);
		//password is Magic...poof as the dots
		pwdPassword = new JPasswordField();
		pwdPassword.setHorizontalAlignment(SwingConstants.CENTER);
		pwdPassword.setText("Magic...poof");
		pwdPassword.setBounds(249, 150, 152, 43);
		frmTransportationSystem.getContentPane().add(pwdPassword);
		String name;
		//General name til find a way to implement companies
		name = "Traveler!";
		
		//for login text
		txtUsername = new JLabel();
		txtUsername.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		txtUsername.setText("Enter Name & Press Login");
		txtUsername.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsername.setBounds(56, 150, 160, 43);
		frmTransportationSystem.getContentPane().add(txtUsername);
		frmTransportationSystem.setBounds(100, 100, 475, 335);
		frmTransportationSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
