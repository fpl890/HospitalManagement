import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Register extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -554404263635667542L;
	
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public Register() {
		setBackground(SystemColor.control);
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(165, 171, 192, 20);
		add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(165, 229, 192, 20);
		add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(237, 146, 48, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(239, 202, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Create Patient Account");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(165, 39, 192, 62);
		add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Create Account");
		btnNewButton.setBounds(201, 260, 120, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Person.writeInfo(textField.getText(), new String(passwordField.getPassword()));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Main.window.setScreen(Screen.LOGIN);
			}
		});
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.window.setScreen(Screen.LOGIN);
			}
		});
		btnNewButton_1.setBounds(217, 294, 89, 23);
		add(btnNewButton_1);

	}
}
