import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import java.awt.Color;
//coded by James Dumitru
public class AirPlane extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AirPlane frame = new AirPlane();
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
	public AirPlane() {
		setTitle("Air Plane");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 477);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
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
		
		JLabel lblFrom = new JLabel("Origin:");
		lblFrom.setBounds(17, 19, 61, 16);
		contentPane.add(lblFrom);
		
		JLabel lblDestination = new JLabel("Destination:");
		lblDestination.setBounds(275, 19, 116, 16);
		contentPane.add(lblDestination);
		
		JLabel lblStartTime = new JLabel("Departure Time:");
		lblStartTime.setBounds(17, 139, 105, 16);
		contentPane.add(lblStartTime);
		
		JLabel lblArrivalTime = new JLabel("Arrival Time:");
		lblArrivalTime.setBounds(275, 139, 116, 16);
		contentPane.add(lblArrivalTime);
		//goes to payment
		JButton btnProcess = new JButton("Proceed to Payment");
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						AirPlane AP = new AirPlane();
						AP.setVisible(false);
						dispose();
						Payment frame = new Payment();
						frame.setVisible(true);
			}
		});
		btnProcess.setBounds(629, 292, 157, 59);
		contentPane.add(btnProcess);
		
		JSpinner comboBox_4 = new JSpinner();
		comboBox_4.setBounds(6, 292, 157, 26);
		contentPane.add(comboBox_4);
		//select  how many
		JLabel lblNumberOfPassengers = new JLabel("Number of Passengers:");
		lblNumberOfPassengers.setBounds(17, 276, 151, 16);
		contentPane.add(lblNumberOfPassengers);
		
		JSpinner comboBox_5 = new JSpinner();
		comboBox_5.setBounds(275, 292, 157, 26);
		contentPane.add(comboBox_5);
		//select how many 
		JLabel lblLengthOfStay = new JLabel("Length of stay: (days)");
		lblLengthOfStay.setBounds(281, 276, 151, 16);
		contentPane.add(lblLengthOfStay);
		//discount message
		JTextPane txtpnIfYouHave = new JTextPane();
		txtpnIfYouHave.setText("If you have more than 5 passengers");
		txtpnIfYouHave.setBounds(17, 335, 278, 16);
		contentPane.add(txtpnIfYouHave);
		
		JTextPane txtpnYouAre = new JTextPane();
		txtpnYouAre.setText("You are eligible for a 10% volume discount!");
		txtpnYouAre.setBounds(17, 349, 278, 16);
		contentPane.add(txtpnYouAre);
		//Backbutton to transport methods
		JButton btnNewButton = new JButton("Go Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						AirPlane AP = new AirPlane();
						AP.setVisible(false);
						dispose();
						Transportation frame = new Transportation();
						frame.setVisible(true);
						
			}
		});
		btnNewButton.setBounds(649, 6, 137, 59);
		contentPane.add(btnNewButton);
		//options of companies
		JRadioButton rdbtnSpiritAirlines = new JRadioButton("Spirit Airlines");
		rdbtnSpiritAirlines.setBounds(451, 149, 141, 23);
		contentPane.add(rdbtnSpiritAirlines);
		
		JRadioButton rdbtnLufthansa = new JRadioButton("Lufthansa");
		rdbtnLufthansa.setBounds(451, 184, 157, 23);
		contentPane.add(rdbtnLufthansa);
		
		JRadioButton rdbtnAmericanAirlines = new JRadioButton("American Airlines");
		rdbtnAmericanAirlines.setBounds(451, 219, 157, 23);
		contentPane.add(rdbtnAmericanAirlines);
		
		JRadioButton rdbtnDelta = new JRadioButton("Delta Air Lines");
		rdbtnDelta.setBounds(451, 254, 179, 23);
		contentPane.add(rdbtnDelta);
		
		JLabel lblChooseYourAir = new JLabel("Choose Your Air Plane Carrier:");
		lblChooseYourAir.setBackground(Color.WHITE);
		lblChooseYourAir.setBounds(444, 121, 204, 16);
		contentPane.add(lblChooseYourAir);
	}
}
