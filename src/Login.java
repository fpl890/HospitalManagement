import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Font;
import javax.swing.SwingConstants;

// https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/components/ButtonDemoProject/src/components/ButtonDemo.java
public class Login extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	protected JButton btnCalendar;

	private JTextField txtUsername;
	private JTextField txtPassword;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblPassword;

	/**
	 * Create the frame.
	 */
	public Login() {
			setLayout(null);
		
			
			
			JLabel label = new JLabel("Login");
			label.setFont(new Font("Tahoma", Font.BOLD, 16));
			label.setBounds(209, 20, 44, 20);
			this.add(label);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(170, 94, 122, 20);
		this.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(170, 168, 122, 20);
		this.add(txtPassword);
		
		btnCalendar = new JButton("Login");
		btnCalendar.setBounds(189, 208, 85, 23);
		this.add(btnCalendar);
		btnCalendar.setEnabled(true);
		btnCalendar.setActionCommand("enable");
		btnCalendar.addActionListener(this);
		
		btnNewButton = new JButton("Create Account");
		btnNewButton.setBounds(151, 252, 160, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.window.setScreen(Screen.REGIS);
			}
		});
		add(btnNewButton);
		
		lblNewLabel = new JLabel("Username");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(190, 69, 83, 14);
		add(lblNewLabel);
		
		lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(190, 144, 83, 14);
		add(lblPassword);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if("enable".equals(e.getActionCommand())) {
			Main.window.setScreen(Screen.CALEN);
		}
		
	}
}
