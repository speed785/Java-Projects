import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//coded by James Dumitru
public class Transportation extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transportation frame = new Transportation();
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Transportation() {
		setBackground(Color.WHITE);
		setTitle("Transportation ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//general name
		String nameid;
		nameid = " Traveler!";
		JLabel lblWelcome = new JLabel("Welcome" + nameid);
		lblWelcome.setLabelFor(lblWelcome);
		lblWelcome.setBounds(16, 6, 228, 41);
		contentPane.add(lblWelcome);
		//airplain button
		JButton btnNewButton = new JButton("Air Plane");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transportation Trans = new Transportation();
						Trans.setVisible(false);
						dispose();
						AirPlane frame = new AirPlane();
						frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(28, 102, 174, 60);
		contentPane.add(btnNewButton);
		//Train button
		JButton btnTrain = new JButton("Train");
		btnTrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transportation Trans = new Transportation();
				Trans.setVisible(false);
				dispose();
				Train frame = new Train();
				frame.setVisible(true);
			}
		});
		btnTrain.setBounds(214, 102, 174, 60);
		contentPane.add(btnTrain);
		//boat button
		JButton btnBoat = new JButton("Boat");
		btnBoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transportation Trans = new Transportation();
				Trans.setVisible(false);
				dispose();
				Boat frame = new Boat();
				frame.setVisible(true);
			}
		});
		btnBoat.setBounds(214, 174, 174, 60);
		contentPane.add(btnBoat);
		//car rental button
		JButton btnCarRental = new JButton("Car Rental");
		btnCarRental.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transportation Trans = new Transportation();
				Trans.setVisible(false);
				dispose();
				CarRental frame = new CarRental();
				frame.setVisible(true);
			}
		});
		btnCarRental.setBounds(28, 174, 174, 60);
		contentPane.add(btnCarRental);
		//Please choose a method
		JLabel lblPleaseChooseA = new JLabel("Please choose a transportation method");
		lblPleaseChooseA.setBounds(16, 59, 286, 16);
		contentPane.add(lblPleaseChooseA);
	}

}
