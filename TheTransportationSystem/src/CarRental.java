import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
//coded by James Dumitru
public class CarRental extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarRental frame = new CarRental();
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
	public CarRental() {
		setTitle("Car Rental");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 477);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(6, 6, 157, 91);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(6, 121, 157, 91);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(275, 6, 157, 91);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(275, 121, 157, 91);
		contentPane.add(comboBox_3);
		
		JLabel label = new JLabel("Origin:");
		label.setBounds(17, 19, 61, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Destination:");
		label_1.setBounds(275, 19, 116, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Departure Time:");
		label_2.setBounds(17, 139, 105, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Arrival Time:");
		label_3.setBounds(275, 139, 116, 16);
		contentPane.add(label_3);
		
		JButton btnProceedToPayment = new JButton("Proceed to Payment");
		btnProceedToPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarRental crent = new CarRental();
				crent.setVisible(false);
				dispose();
				Payment frame = new Payment();
				frame.setVisible(true);
			}
		});
		btnProceedToPayment.setBounds(629, 292, 157, 59);
		contentPane.add(btnProceedToPayment);
		
		JSpinner comboBox_4 = new JSpinner();
		comboBox_4.setBounds(6, 291, 157, 26);
		contentPane.add(comboBox_4);
		//select how many
		JLabel label_4 = new JLabel("Number of Passengers:");
		label_4.setBounds(17, 276, 151, 16);
		contentPane.add(label_4);
		
		JSpinner comboBox_5 = new JSpinner();
		comboBox_5.setBounds(275, 292, 157, 26);
		contentPane.add(comboBox_5);
		//select how many
		JLabel label_5 = new JLabel("Length of stay: (days)");
		label_5.setBounds(281, 276, 151, 16);
		contentPane.add(label_5);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("If you have more than 5 passengers");
		textPane.setBounds(17, 335, 278, 16);
		contentPane.add(textPane);
		
		JTextPane txtpnYouAreEligible = new JTextPane();
		txtpnYouAreEligible.setText("You are eligible for a 10% volume discount!");
		txtpnYouAreEligible.setBounds(17, 349, 278, 16);
		contentPane.add(txtpnYouAreEligible);
		//Option to go back to the transport methods
		JButton button_1 = new JButton("Go Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						CarRental crent = new CarRental();
						crent.setVisible(false);
						dispose();
						Transportation frame = new Transportation();
						frame.setVisible(true);
			}
		});
		button_1.setBounds(649, 6, 137, 59);
		contentPane.add(button_1);
		
		JRadioButton rdbtnEnterprise = new JRadioButton("Enterprise");
		rdbtnEnterprise.setBounds(459, 119, 141, 23);
		contentPane.add(rdbtnEnterprise);
		
		JRadioButton rdbtnHertz = new JRadioButton("Hertz");
		rdbtnHertz.setBounds(459, 154, 157, 23);
		contentPane.add(rdbtnHertz);
		
		JRadioButton rdbtnBudget = new JRadioButton("Budget");
		rdbtnBudget.setBounds(459, 189, 141, 23);
		contentPane.add(rdbtnBudget);
		
		JRadioButton rdbtnEuropcar = new JRadioButton("Europcar");
		rdbtnEuropcar.setBounds(459, 224, 179, 23);
		contentPane.add(rdbtnEuropcar);
		
		JLabel lblChooseYourCar = new JLabel("Choose Your Car Rental Carrier:");
		lblChooseYourCar.setBackground(Color.WHITE);
		lblChooseYourCar.setBounds(459, 91, 207, 16);
		contentPane.add(lblChooseYourCar);
	}

}
