package front;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import back.Main;

public class patientPage extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private String user;
	/**
	 * Create the application.
	 */
	public patientPage(String user) {
		this.user = user;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		JButton btnBookApt = new JButton("Book Appointment");
		btnBookApt.setBounds(243, 57, 150, 64);
		this.add(btnBookApt);
		btnBookApt.setActionCommand("sched");
		btnBookApt.addActionListener(this);
		
		
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
	
	public void actionPerformed(ActionEvent e) {
		String cmd =  e.getActionCommand();
		if(cmd.equals("sched")){
			Main.window.setScreen(Main.Screen.PCAL, this.user, null);
		}
		
	}
}

