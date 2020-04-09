package front;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import back.Doctor;
import back.Main;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PatRequestApt extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3769564808489547540L;


	/**
	 * Create the panel.
	 */
	public PatRequestApt() {

		JLabel label = new JLabel("");

		JRadioButton rButtonApt1 = new JRadioButton("9:00 - 12:00");

		JRadioButton rButtonApt2 = new JRadioButton("12:00 - 3:00");

		JRadioButton rButtonApt4 = new JRadioButton("5:00 - 7:00");

		JLabel lblAvailableAppointments = new JLabel("Request an Appointment");
		lblAvailableAppointments.setFont(new Font("Tahoma", Font.PLAIN, 21));

		JRadioButton rButtonApt3 = new JRadioButton("3:00 - 5:00");

		JRadioButton rButtonApt5 = new JRadioButton("7:00 - 9:00");

		JLabel lblAptRequested = new JLabel("Appointment Requested:");

		JLabel apt1 = new JLabel("9:00 - 12:00");
		JLabel apt2 = new JLabel("12:00 - 3:00");
		JLabel apt3 = new JLabel("3:00 - 5:00");
		JLabel apt4 = new JLabel("5:00 - 7:00");
		JLabel apt5 = new JLabel("7:00 - 9:00");

		apt1.setVisible(false);
		apt2.setVisible(false);
		apt3.setVisible(false);
		apt4.setVisible(false);
		apt5.setVisible(false);

		JButton btnConfirmSelection = new JButton("Confirm Selection");
		btnConfirmSelection.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (rButtonApt1.isSelected()) {
					apt1.setVisible(true);
					rButtonApt1.doClick();
				}

				if (rButtonApt2.isSelected()) {
					apt2.setVisible(true);
					rButtonApt2.doClick();
				}
				if (rButtonApt3.isSelected()) {
					apt3.setVisible(true);
					rButtonApt3.doClick();
				}
				if (rButtonApt4.isSelected()) {
					apt4.setVisible(true);
					rButtonApt4.doClick();
				}
				if (rButtonApt5.isSelected()) {
					apt5.setVisible(true);
					rButtonApt5.doClick();
				}



			}

		});

		JButton ScheduleReturn = new JButton("Return to Schedule");
		ScheduleReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				apt1.setVisible(false);
				apt2.setVisible(false);
				apt3.setVisible(false);
				apt4.setVisible(false);
				apt5.setVisible(false);

				Main.window.setScreen(Main.Screen.CALEN, null);

			}
		});
		
		JLabel lblDisclaimer = new JLabel("We can not guarantee your selected appointment");

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label)
								.addComponent(rButtonApt1)
								.addComponent(rButtonApt3)
								.addComponent(rButtonApt2, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addComponent(rButtonApt4, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addComponent(rButtonApt5, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(apt5)
								.addComponent(lblAptRequested, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
								.addComponent(apt1)
								.addComponent(apt2, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addComponent(apt3, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addComponent(apt4, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(21)
							.addComponent(btnConfirmSelection)
							.addGap(41)
							.addComponent(ScheduleReturn))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addComponent(lblDisclaimer, GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblAvailableAppointments))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(65)
							.addComponent(lblAvailableAppointments)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblDisclaimer, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label)
									.addGap(27))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(rButtonApt1)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addComponent(rButtonApt2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rButtonApt3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rButtonApt4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rButtonApt5))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(130)
							.addComponent(lblAptRequested, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(apt1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(apt2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(apt3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(apt4)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(apt5)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnConfirmSelection)
						.addComponent(ScheduleReturn))
					.addGap(34))
		);
		setLayout(groupLayout);

	}

}