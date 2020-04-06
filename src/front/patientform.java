package front;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.UUID;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;

import back.Patient;

public class patientform {

	private JFrame frame;
	private JTextField tfFirstName;
	private JTextField tfHeight;
	private JTextField tfLastName;
	private JTextField tfWeight;
	private JTextField tfBirthday;

	JRadioButton buttonMale = new JRadioButton("Male");
	JRadioButton buttonFemale = new JRadioButton("Female");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					patientform window = new patientform();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public String generateID() {
		return UUID.randomUUID().toString();
	}

	/**
	 * Create the application.
	 */
	public patientform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tfFirstName = new JTextField();
		tfFirstName.setBounds(87, 11, 86, 20);
		frame.getContentPane().add(tfFirstName);
		tfFirstName.setColumns(10);

		tfHeight = new JTextField();
		tfHeight.setBounds(87, 42, 86, 20);
		frame.getContentPane().add(tfHeight);
		tfHeight.setColumns(10);

		buttonMale.setBounds(87, 109, 109, 23);
		frame.getContentPane().add(buttonMale);

		buttonFemale.setBounds(212, 109, 109, 23);
		frame.getContentPane().add(buttonFemale);

		tfLastName = new JTextField();
		tfLastName.setBounds(289, 11, 86, 20);
		frame.getContentPane().add(tfLastName);
		tfLastName.setColumns(10);

		tfWeight = new JTextField();
		tfWeight.setBounds(289, 42, 86, 20);
		frame.getContentPane().add(tfWeight);
		tfWeight.setColumns(10);

		JTextPane tpConditions = new JTextPane();
		tpConditions.setBounds(87, 139, 245, 111);
		frame.getContentPane().add(tpConditions);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(342, 227, 89, 23);
		frame.getContentPane().add(btnSubmit);

		JLabel lbFirstName = new JLabel("First Name");
		lbFirstName.setBounds(10, 14, 86, 14);
		frame.getContentPane().add(lbFirstName);

		JLabel lbLastName = new JLabel("Last Name");
		lbLastName.setBounds(212, 14, 76, 14);
		frame.getContentPane().add(lbLastName);

		JLabel lbHeight = new JLabel("Height");
		lbHeight.setBounds(10, 45, 46, 14);
		frame.getContentPane().add(lbHeight);

		JLabel lbWeight = new JLabel("Weight");
		lbWeight.setBounds(212, 45, 46, 14);
		frame.getContentPane().add(lbWeight);

		JLabel lbBirthday = new JLabel("Birthday");
		lbBirthday.setBounds(10, 76, 76, 14);
		frame.getContentPane().add(lbBirthday);

		JLabel lbSex = new JLabel("Sex");
		lbSex.setBounds(10, 113, 46, 14);
		frame.getContentPane().add(lbSex);

		JLabel lbConditions = new JLabel("Conditions");
		lbConditions.setBounds(10, 139, 76, 20);
		frame.getContentPane().add(lbConditions);

		tfBirthday = new JTextField();
		tfBirthday.setBounds(87, 73, 86, 20);
		frame.getContentPane().add(tfBirthday);
		tfBirthday.setColumns(10);

		JLabel lbBirthday2 = new JLabel("mm/dd/yyyy");
		lbBirthday2.setBounds(183, 76, 89, 14);
		frame.getContentPane().add(lbBirthday2);

		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Patient.writeInfo(new String(generateID()),
							new String(tfFirstName.getText() + " " + tfLastName.getText()),
							new String(tfBirthday.getText()), new String(obtainSex()),
							new Integer(Integer.parseInt(tfHeight.getText())),
							new Double(Double.parseDouble(tfWeight.getText())), new String(tpConditions.getText()));
				} catch (NumberFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
	}

	public String obtainSex() {
		if (buttonMale.isSelected() && !buttonFemale.isSelected())
			return "male";
		if (!buttonMale.isSelected() && buttonFemale.isSelected())
			return "female";
		return "";
	}
}
