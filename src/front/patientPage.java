package front;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class patientPage extends JPanel{

	private static final long serialVersionUID = 1L;

	/**
	 * Create the application.
	 */
	public patientPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		JButton btnNewButton = new JButton("Book Appointment");
		btnNewButton.setBounds(243, 57, 150, 64);
		this.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View requested");
		btnNewButton_1.setBounds(243, 166, 150, 61);
		this.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back to login");
		btnNewButton_2.setBounds(0, 238, 434, 23);
		this.add(btnNewButton_2);
		
		
		JLabel lblNewLabel = new JLabel("Patient Home Screen");
		lblNewLabel.setBounds(0, 0, 434, 51);
		this.add(lblNewLabel);
		
		ImageIcon patient = new ImageIcon("./img/patient.jpg");
		JLabel lblNewLabel_1 = new JLabel("");
		
		lblNewLabel_1.setIcon(patient);
		lblNewLabel_1.setBounds(-123, 31, 371, 362);
		this.add(lblNewLabel_1);
	}
}

