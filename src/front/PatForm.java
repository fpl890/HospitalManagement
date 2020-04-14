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
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.UUID;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;

import back.Main;
import back.Patient;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

/*
 * This class will create a JPanel which allows 
 * patients to enter their personal information
 */
public class PatForm extends JPanel implements ActionListener{

	private String user; 
	private JFrame frame;
	private JTextField tfFirstName;
	private JTextField tfHeight;
	private JTextField tfLastName;
	private JTextField tfWeight;
	private JTextField tfBirthday;

	JRadioButton buttonMale = new JRadioButton("Male");
	JRadioButton buttonFemale = new JRadioButton("Female");

	
	/**
	 * 
	 * @return A random generated id represented as a string
	 */
	public String generateID() {
		return UUID.randomUUID().toString();
	}

	
	/**
	 * @param us the user for which the information is stored for
	 */
	public PatForm(String us) {
		user =us;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {		
		setLayout(null);

		tfFirstName = new JTextField();
		tfFirstName.setBounds(87, 11, 86, 20);
		tfFirstName.setColumns(10);
		add(tfFirstName);

		tfHeight = new JTextField();
		tfHeight.setBounds(87, 42, 86, 20);
		tfHeight.setColumns(10);
		add(tfHeight);

		buttonMale.setBounds(87, 109, 109, 23);
		add(buttonMale);

		buttonFemale.setBounds(212, 109, 109, 23);
		add(buttonFemale);

		tfLastName = new JTextField();
		tfLastName.setBounds(289, 11, 86, 20);
		tfLastName.setColumns(10);
		add(tfLastName);

		tfWeight = new JTextField();
		tfWeight.setBounds(289, 42, 86, 20);
		tfWeight.setColumns(10);
		add(tfWeight);

		JTextPane tpConditions = new JTextPane();
		tpConditions.setBounds(87, 139, 245, 111);
		add(tpConditions);
		

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(342, 227, 89, 23);
		add(btnSubmit);

		JLabel lbFirstName = new JLabel("First Name");
		lbFirstName.setBounds(10, 14, 86, 14);
		add(lbFirstName);

		JLabel lbLastName = new JLabel("Last Name");
		lbLastName.setBounds(212, 14, 76, 14);
		add(lbLastName);

		JLabel lbHeight = new JLabel("Height");
		lbHeight.setBounds(10, 45, 46, 14);
		add(lbHeight);

		JLabel lbWeight = new JLabel("Weight");
		lbWeight.setBounds(212, 45, 46, 14);
		add(lbWeight);

		JLabel lbBirthday = new JLabel("Birthday");
		lbBirthday.setBounds(10, 76, 76, 14);
		add(lbBirthday);

		JLabel lbSex = new JLabel("Sex");
		lbSex.setBounds(10, 113, 46, 14);
		add(lbSex);

		JLabel lbConditions = new JLabel("Conditions");
		lbConditions.setBounds(10, 139, 76, 20);
		add(lbConditions);

		tfBirthday = new JTextField();
		tfBirthday.setBounds(87, 73, 86, 20);
		tfBirthday.setColumns(10);
		add(tfBirthday);

		JLabel lbBirthday2 = new JLabel("mm/dd/yyyy");
		lbBirthday2.setBounds(183, 76, 89, 14);
		add(lbBirthday2);
		

		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Patient.writeInfo(new String(generateID()),
							user,
							new String(tfBirthday.getText()), new String(obtainSex()),
							new Integer(Integer.parseInt(tfHeight.getText())),
							new Double(Double.parseDouble(tfWeight.getText())), new String(tpConditions.getText()));
				} catch (NumberFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Main.window.setScreen(Main.Screen.LOGIN, null, null);

			}
		});
	}


	/**
	 * Convert the selection of male or female radio button into a readable string
	 * @return "female" or "male" depending on which radio button is selected
	 */
	public String obtainSex() {
		if (buttonMale.isSelected() && !buttonFemale.isSelected())
			return "male";
		if (!buttonMale.isSelected() && buttonFemale.isSelected())
			return "female";
		return "";
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
