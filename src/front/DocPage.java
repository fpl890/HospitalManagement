package front;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import back.Doctor;
import back.Main;
import back.Person;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DocPage extends JPanel implements ActionListener{
	String doc;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	




	/**
	 * Create the application.
	 */
	public DocPage(String user) {
		if(Doctor.isDoc(user)) doc = user ;
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		

		
		JLabel lblNewLabel = new JLabel("Doctor Home Screen");
		lblNewLabel.setBounds(155, 11, 123, 36);
		this.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("View requested appointments");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(245, 58, 179, 23);
		this.add(btnNewButton);
		btnNewButton.setActionCommand("reqApp");
		btnNewButton.addActionListener(this);
		
		JButton button = new JButton("View appointments' schedule");
		button.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button.setBounds(244, 92, 180, 23);
		this.add(button);
		button.setActionCommand("sched");
		button.addActionListener(this);
		
		JButton button_1 = new JButton("View list of patients");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.window.setScreen(Main.Screen.PLIS, doc, null);
			}
		});
		button_1.setBounds(245, 127, 179, 23);
		this.add(button_1);
		
		JButton btnNewButton_1 = new JButton("Back to login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.window.setScreen(Main.Screen.LOGIN, null, null);
			}
		});
		btnNewButton_1.setBounds(293, 227, 131, 23);
		this.add(btnNewButton_1);
		
		ImageIcon doc = new ImageIcon("./img/doctor.jpg");
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_1.setIcon(doc);
		lblNewLabel_1.setBounds(22, -94, 213, 478);
		this.add(lblNewLabel_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd =  e.getActionCommand();
		if(cmd.equals("sched")){
			Main.window.setScreen(Main.Screen.CALEN, doc, null);
		}
		else if (cmd.equals("reqApp")) {
			Main.window.setScreen(Main.Screen.REQAP, doc, null);
		}
		
	}
}
