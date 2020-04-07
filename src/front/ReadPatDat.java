package front;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import back.Main;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReadPatDat extends JPanel {
	JLabel name;
	JLabel heightWeight;
	JLabel birth;
	JLabel sex;
	JLabel cond;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public ReadPatDat() {
		
		
		JLabel lblNewLabel = new JLabel("Patient information:");
		heightWeight = new JLabel();
		heightWeight.setText("hw");
		name = new JLabel();
		name.setText("name");
		birth = new JLabel();
		birth.setText("birht");
		sex = new JLabel();
		sex.setText("sex");
		cond = new JLabel();
		cond.setText("Blank");
		
		writeDat("gavin", "guinn", 200, 90, "06/09/1998", true, "big enegergy");
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.window.setScreen(Main.Screen.DPAGE, null);
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(177, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(218))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(160, Short.MAX_VALUE)
					.addComponent(name)
					.addGap(201))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(157)
					.addComponent(lblNewLabel)
					.addContainerGap(198, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(144)
					.addComponent(heightWeight, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(181, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(birth, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(173)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(sex, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addComponent(cond))))
					.addContainerGap(150, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(29)
					.addComponent(heightWeight)
					.addGap(18)
					.addComponent(name)
					.addGap(49)
					.addComponent(cond)
					.addGap(34)
					.addComponent(sex)
					.addGap(29)
					.addComponent(birth)
					.addGap(12)
					.addComponent(btnNewButton)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		
	}
	
	public void writeDat(String first, String last, int height, int weight, String birthdate, Boolean male, String conditions) {
		name.setText("Name: " + first + " " + last);
		heightWeight.setText("Height: " + Integer.toString(height) + " Weight: " + Integer.toString(weight));
		birth.setText("birthdate: " + birthdate);
		if(male) sex.setText("Male");
		else sex.setText("Female");
		cond.setText(conditions);
		
		
	}
}
