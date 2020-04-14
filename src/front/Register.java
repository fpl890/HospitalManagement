package front;
import javax.swing.JPanel;
import javax.swing.JTextField;

import back.Doctor;
import back.Main;
import back.Person;


import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;


public class Register extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -554404263635667542L;
	
	private JTextField textField;
	private JPasswordField passwordField;
	private JRadioButton patRad;
	private JRadioButton docRad;
	

	/**
	 * Create the panel.
	 */
	public Register() {
		
		setBackground(SystemColor.control);
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(125, 109, 192, 20);
		add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(125, 167, 192, 20);
		add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(197, 84, 48, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(198, 140, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Create Account");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(157, 11, 130, 62);
		add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Create Account");
		btnNewButton.setBounds(161, 238, 120, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Person.writeInfo(textField.getText(), new String(passwordField.getPassword()));
					if(docRad.isSelected()) {
						Doctor doc = new Doctor(textField.getText(), "Covid prevention");
						doc.writeInfo();
						Main.window.setScreen(Main.Screen.LOGIN, null, null);
					}
					else if (patRad.isSelected()) {
						Main.window.setScreen(Main.Screen.PFORM, textField.getText(), null);
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.window.setScreen(Main.Screen.LOGIN, null, null);
			}
		});
		btnNewButton_1.setBounds(177, 272, 89, 23);
		add(btnNewButton_1);
		
		patRad = new JRadioButton("Patient");
		patRad.setBounds(135, 194, 109, 23);
		add(patRad);
		
		docRad = new JRadioButton("Doctor");
		docRad.setBounds(246, 194, 109, 23);
		add(docRad);

	}
}
