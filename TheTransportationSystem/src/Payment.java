import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Payment extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
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
	public Payment() {
		//payment options
		setTitle("Payment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 477);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Apple Pay");
		chckbxNewCheckBox.setBounds(6, 6, 128, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxCreditCard = new JCheckBox("Credit Card");
		chckbxCreditCard.setBounds(146, 6, 128, 23);
		contentPane.add(chckbxCreditCard);
		
		textField = new JTextField();
		textField.setBounds(145, 79, 296, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Card Number:");
		lblNewLabel.setBounds(17, 89, 116, 16);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(145, 147, 69, 38);
		contentPane.add(textField_1);
		
		JLabel lblExperrtionDate = new JLabel("Exp. Date:");
		lblExperrtionDate.setBounds(15, 135, 116, 16);
		contentPane.add(lblExperrtionDate);
		
		JLabel lblMo = new JLabel("Month:");
		lblMo.setBounds(85, 156, 61, 16);
		contentPane.add(lblMo);
		
		JLabel lblYear = new JLabel("Year:");
		lblYear.setBounds(216, 155, 61, 16);
		contentPane.add(lblYear);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(259, 146, 73, 39);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(146, 191, 296, 52);
		contentPane.add(textField_3);
		
		JLabel lblNameOnCard = new JLabel("Name on Card:");
		lblNameOnCard.setBounds(15, 198, 103, 31);
		contentPane.add(lblNameOnCard);
		
		textField_4 = new JTextField();
		textField_4.setBounds(145, 253, 194, 46);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Security Code:");
		lblNewLabel_1.setBounds(13, 254, 102, 26);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxDebitCard = new JCheckBox("Debit Card");
		chckbxDebitCard.setBounds(286, 6, 128, 23);
		contentPane.add(chckbxDebitCard);
		
		textField_5 = new JTextField();
		textField_5.setBounds(145, 306, 163, 45);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Zip Code:");
		lblNewLabel_2.setBounds(19, 308, 91, 26);
		contentPane.add(lblNewLabel_2);
		//Option to go back to the transport methods
		JButton btnNewButton = new JButton("Go Back:");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						Payment pmt = new Payment();
						pmt.setVisible(false);
						dispose();
						Transportation frame = new Transportation();
						frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(510, 55, 197, 67);
		contentPane.add(btnNewButton);
		//goes to receipt
		JButton btnNewButton_1 = new JButton("Complete Purchase");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						Payment pay = new Payment();
						pay.setVisible(false);
						dispose();
						Receipt frame = new Receipt();
						frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(510, 284, 197, 67);
		contentPane.add(btnNewButton_1);
		
		JCheckBox chckbxAndroidPay = new JCheckBox("Android Pay");
		chckbxAndroidPay.setBounds(6, 28, 128, 38);
		contentPane.add(chckbxAndroidPay);
		
		JCheckBox chckbxCash = new JCheckBox("Cash");
		chckbxCash.setBounds(146, 31, 128, 36);
		contentPane.add(chckbxCash);
	}
}
