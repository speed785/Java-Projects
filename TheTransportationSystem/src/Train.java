import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
//coded by James Dumitru
public class Train extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Train frame = new Train();
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
	public Train() {
		setTitle("Train");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(102, 102, 153));
		panel.setBounds(0, 0, 792, 454);
		contentPane.add(panel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(6, 6, 157, 91);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(6, 121, 157, 91);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(275, 6, 157, 91);
		panel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(275, 121, 157, 91);
		panel.add(comboBox_3);
		
		JLabel label = new JLabel("Origin:");
		label.setBounds(17, 19, 61, 16);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Destination:");
		label_1.setBounds(275, 19, 116, 16);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Departure Time:");
		label_2.setBounds(17, 139, 105, 16);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Arrival Time:");
		label_3.setBounds(275, 139, 116, 16);
		panel.add(label_3);
		//go to payment frame
		JButton btnProceedToPayment = new JButton("Proceed to Payment");
		btnProceedToPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Train Trane = new Train();
				Trane.setVisible(false);
				dispose();
				Payment frame = new Payment();
				frame.setVisible(true);
			}
		});
		btnProceedToPayment.setBounds(629, 292, 157, 59);
		panel.add(btnProceedToPayment);
		
		JSpinner comboBox_4 = new JSpinner();
		comboBox_4.setBounds(6, 292, 157, 26);
		panel.add(comboBox_4);
		//select how many
		JLabel label_4 = new JLabel("Number of Passengers:");
		label_4.setBounds(17, 276, 151, 16);
		panel.add(label_4);
		
		JSpinner comboBox_5 = new JSpinner();
		comboBox_5.setBounds(275, 292, 157, 26);
		panel.add(comboBox_5);
		//select how many
		JLabel label_5 = new JLabel("Length of stay: (days)");
		label_5.setBounds(281, 276, 151, 16);
		panel.add(label_5);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("If you have more than 5 passengers");
		textPane.setBounds(17, 335, 278, 16);
		panel.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("You are eligible for a 10% volume discount!");
		textPane_1.setBounds(17, 349, 278, 16);
		panel.add(textPane_1);
		//Option to go back to the transport methods
		JButton button_1 = new JButton("Go Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Train Trane = new Train();
				Trane.setVisible(false);
				dispose();
				Transportation frame = new Transportation();
				frame.setVisible(true);
			}
		});
		button_1.setBounds(649, 6, 137, 59);
		panel.add(button_1);
		//options of companies
		JRadioButton rdbtnAmtrak = new JRadioButton("Amtrak");
		rdbtnAmtrak.setBounds(450, 136, 141, 23);
		panel.add(rdbtnAmtrak);
		
		JRadioButton rdbtnUnionPacific = new JRadioButton("Union Pacific");
		rdbtnUnionPacific.setBounds(450, 171, 157, 23);
		panel.add(rdbtnUnionPacific);
		
		JRadioButton rdbtnBnsf = new JRadioButton("BNSF");
		rdbtnBnsf.setBounds(450, 206, 141, 23);
		panel.add(rdbtnBnsf);
		
		JRadioButton rdbtnCsx = new JRadioButton("CSX");
		rdbtnCsx.setBounds(450, 241, 179, 23);
		panel.add(rdbtnCsx);
		
		JLabel lblChooseYourTrain = new JLabel("Choose Your Train Carrier:");
		lblChooseYourTrain.setBackground(Color.WHITE);
		lblChooseYourTrain.setBounds(450, 108, 179, 16);
		panel.add(lblChooseYourTrain);
	}

}
