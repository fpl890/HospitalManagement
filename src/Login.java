import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

// https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/components/ButtonDemoProject/src/components/ButtonDemo.java
public class Login extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	protected JButton btnCalendar;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Login");
		label.setBounds(201, 39, 46, 14);
		contentPane.add(label);
		
		btnCalendar = new JButton("Calendar");
		btnCalendar.setBounds(180, 201, 89, 23);
		contentPane.add(btnCalendar);
		btnCalendar.setEnabled(true);
		btnCalendar.setActionCommand("enable");
		
		textField = new JTextField();
		textField.setBounds(131, 64, 182, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(131, 111, 182, 30);
		contentPane.add(textField_1);
		btnCalendar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if("enable".equals(e.getActionCommand())) {
			Main.setLogin(false);
			Main.setCalendar(true);
		}
		
	}
}
