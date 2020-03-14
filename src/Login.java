import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

// https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/components/ButtonDemoProject/src/components/ButtonDemo.java
public class Login extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	protected JButton btnCalendar;

	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	public Login() {	
	
		
		
		JLabel label = new JLabel("Login");
		label.setBounds(201, 39, 46, 14);
		this.add(label);
		
		btnCalendar = new JButton("Calendar");
		btnCalendar.setBounds(180, 201, 89, 23);
		this.add(btnCalendar);
		btnCalendar.setEnabled(true);
		btnCalendar.setActionCommand("enable");
		
		textField = new JTextField();
		textField.setBounds(131, 64, 182, 30);
		this.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(131, 111, 182, 30);
		this.add(textField_1);
		btnCalendar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if("enable".equals(e.getActionCommand())) {
			Main.window.setScreen(Screen.CALEN);
		}
		
	}
}
