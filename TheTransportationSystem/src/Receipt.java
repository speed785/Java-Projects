import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Receipt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receipt frame = new Receipt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Receipt() {
		setTitle("Receipt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 477);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReceipt = new JLabel("Receipt:");
		lblReceipt.setBounds(5, 5, 783, 16);
		contentPane.add(lblReceipt);
		
		JLabel lblThankYouFor = new JLabel("Thank you for using this Transportation System, would you like to use it again?");
		lblThankYouFor.setBounds(5, 434, 783, 16);
		contentPane.add(lblThankYouFor);
		
		JButton btnRestart = new JButton("Restart");
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						Receipt Rpt = new Receipt();
						Rpt.setVisible(false);
						dispose();
						Login window = new Login();
						window.frmTransportationSystem.setVisible(true);
			}
		});
		btnRestart.setBounds(519, 421, 117, 29);
		contentPane.add(btnRestart);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(649, 421, 117, 29);
		contentPane.add(btnExit);
	}

}
