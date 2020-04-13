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

public class PatForm extends JPanel implements ActionListener{

	private String user; 
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

	public String generateID() {
		return UUID.randomUUID().toString();
	}

	/**
	 * Create the application.
	 */
	public PatForm(String us) {
		user =us;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		

		tfFirstName = new JTextField();
		tfFirstName.setBounds(87, 11, 86, 20);
		tfFirstName.setColumns(10);

		tfHeight = new JTextField();
		tfHeight.setBounds(87, 42, 86, 20);
		tfHeight.setColumns(10);

		buttonMale.setBounds(87, 109, 109, 23);

		buttonFemale.setBounds(212, 109, 109, 23);

		tfLastName = new JTextField();
		tfLastName.setBounds(289, 11, 86, 20);
		tfLastName.setColumns(10);

		tfWeight = new JTextField();
		tfWeight.setBounds(289, 42, 86, 20);
		tfWeight.setColumns(10);

		JTextPane tpConditions = new JTextPane();
		tpConditions.setBounds(87, 139, 245, 111);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(342, 227, 89, 23);

		JLabel lbFirstName = new JLabel("First Name");
		lbFirstName.setBounds(10, 14, 86, 14);

		JLabel lbLastName = new JLabel("Last Name");
		lbLastName.setBounds(212, 14, 76, 14);

		JLabel lbHeight = new JLabel("Height");
		lbHeight.setBounds(10, 45, 46, 14);

		JLabel lbWeight = new JLabel("Weight");
		lbWeight.setBounds(212, 45, 46, 14);

		JLabel lbBirthday = new JLabel("Birthday");
		lbBirthday.setBounds(10, 76, 76, 14);

		JLabel lbSex = new JLabel("Sex");
		lbSex.setBounds(10, 113, 46, 14);

		JLabel lbConditions = new JLabel("Conditions");
		lbConditions.setBounds(10, 139, 76, 20);

		tfBirthday = new JTextField();
		tfBirthday.setBounds(87, 73, 86, 20);
		tfBirthday.setColumns(10);

		JLabel lbBirthday2 = new JLabel("mm/dd/yyyy");
		lbBirthday2.setBounds(183, 76, 89, 14);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(tfHeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lbHeight))
								.addComponent(tfWeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tpConditions, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(tfBirthday, 74, 74, 74)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lbBirthday2)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(18)
											.addComponent(lbBirthday))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(16)
											.addComponent(lbWeight)
											.addPreferredGap(ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(buttonFemale)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(lbSex)
													.addGap(23))
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addComponent(btnSubmit)
													.addComponent(buttonMale)))))
									.addContainerGap(67, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(30)
									.addComponent(lbConditions)
									.addContainerGap())))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(tfLastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lbLastName)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(tfFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lbFirstName)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(tfLastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbLastName))
							.addGap(47)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(27)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lbHeight)
										.addComponent(tfHeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(tfWeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lbWeight))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(tpConditions, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lbConditions))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(tfBirthday, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lbBirthday2)
										.addComponent(lbBirthday)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(21)
									.addComponent(lbSex)
									.addGap(18)
									.addComponent(buttonFemale)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(buttonMale)))
							.addGap(11)
							.addComponent(btnSubmit)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(tfFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbFirstName))
							.addGap(215))))
		);
		setLayout(groupLayout);

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
