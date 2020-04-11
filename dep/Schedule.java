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

public class Schedule extends JPanel {

	String user = null;
	String date = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 3769564808489547540L;
	List<String> dailySchedule = new ArrayList<String>();


	/**
	 * Create the panel.
	 * @param flag 
	 */
	public Schedule(String user, String date) {
		this.user = user;
		this.date = date;

		JLabel label = new JLabel(date);

		JRadioButton rButtonShift1 = new JRadioButton("0:00 - 8:00");

		JRadioButton rButtonShift2 = new JRadioButton("8:00 - 16:00");

		JRadioButton rButtonShift4 = new JRadioButton("16:00 - 24:00");

		JLabel lblAvailableShiftsselect = new JLabel("Available Shifts (Select wanted shifts)");
		lblAvailableShiftsselect.setFont(new Font("Tahoma", Font.PLAIN, 21));

		JRadioButton rButtonShift3 = new JRadioButton("9:00 - 17:00");

		JRadioButton rButtonShift5 = new JRadioButton("22:00 - 6:00");

		JLabel lblShiftsCurrentlySelected = new JLabel("Shifts currently scheduled for day:");

		JLabel shift1 = new JLabel("0:00 - 8:00");
		JLabel shift2 = new JLabel("8:00 - 16:00");
		JLabel shift3 = new JLabel("9:00 - 17:00");
		JLabel shift4 = new JLabel("16:00 - 24:00");
		JLabel shift5 = new JLabel("22:00 - 6:00");

		shift1.setVisible(false);
		shift2.setVisible(false);
		shift3.setVisible(false);
		shift4.setVisible(false);
		shift5.setVisible(false);

		JButton btnConfirmSelection = new JButton("Confirm Selection");
		btnConfirmSelection.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (rButtonShift1.isSelected()) {
					shift1.setVisible(true);
					if (!dailySchedule.contains("Shift 1")) {
						dailySchedule.add("Shift 1");
					}
					rButtonShift1.doClick();
				}

				if (rButtonShift2.isSelected()) {
					shift2.setVisible(true);
					if (!dailySchedule.contains("Shift 2")) {
						dailySchedule.add("Shift 2");
					}
					rButtonShift2.doClick();
				}
				if (rButtonShift3.isSelected()) {
					shift3.setVisible(true);
					if (!dailySchedule.contains("Shift 3")) {
						dailySchedule.add("Shift 3");
					}
					rButtonShift3.doClick();
				}
				if (rButtonShift4.isSelected()) {
					shift4.setVisible(true);
					if (!dailySchedule.contains("Shift 4")) {
						dailySchedule.add("Shift 4");
					}
					rButtonShift4.doClick();
				}
				if (rButtonShift5.isSelected()) {
					shift5.setVisible(true);
					if (!dailySchedule.contains("Shift 5")) {
						dailySchedule.add("Shift 5");
					}
					rButtonShift5.doClick();
				}

				System.out.println(dailySchedule);
//				scheduleDoctor(bob);
//				System.out.println(bob.getSchedule());

//				rButtonShift1.setEnabled(false);
//				rButtonShift2.setEnabled(false);
//				rButtonShift3.setEnabled(false);
//				rButtonShift4.setEnabled(false);
//				rButtonShift5.setEnabled(false);

			}

		});

		JButton ScheduleReturn = new JButton("Return to Schedule");
		ScheduleReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shift1.setVisible(false);
				shift2.setVisible(false);
				shift3.setVisible(false);
				shift4.setVisible(false);
				shift5.setVisible(false);
				dailySchedule.clear();

				Main.window.setScreen(Main.Screen.CALEN, user, null);

			}
		});

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(20).addComponent(lblAvailableShiftsselect))
						.addGroup(groupLayout.createSequentialGroup().addContainerGap()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(label)
										.addComponent(rButtonShift1).addComponent(rButtonShift3)
										.addComponent(rButtonShift2, GroupLayout.PREFERRED_SIZE, 130,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(rButtonShift4, GroupLayout.PREFERRED_SIZE, 130,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(rButtonShift5, GroupLayout.PREFERRED_SIZE, 130,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(shift5)
										.addComponent(lblShiftsCurrentlySelected, GroupLayout.PREFERRED_SIZE, 231,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(shift1)
										.addComponent(shift2, GroupLayout.PREFERRED_SIZE, 106,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(shift3, GroupLayout.PREFERRED_SIZE, 106,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(shift4, GroupLayout.PREFERRED_SIZE, 106,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup().addGap(21).addComponent(btnConfirmSelection)
								.addGap(41).addComponent(ScheduleReturn)))
				.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
						.createSequentialGroup().addGap(65).addComponent(lblAvailableShiftsselect).addGap(47)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup().addComponent(label).addGap(27))
								.addGroup(groupLayout.createSequentialGroup().addComponent(rButtonShift1)
										.addPreferredGap(ComponentPlacement.RELATED)))
						.addComponent(rButtonShift2).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(rButtonShift3).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(rButtonShift4).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(rButtonShift5))
						.addGroup(groupLayout.createSequentialGroup().addGap(130)
								.addComponent(lblShiftsCurrentlySelected, GroupLayout.PREFERRED_SIZE, 28,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(shift1)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(shift2)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(shift3)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(shift4)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(shift5)))
				.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(btnConfirmSelection)
						.addComponent(ScheduleReturn))
				.addGap(34)));
		setLayout(groupLayout);

	}

	public void scheduleDoctor(Doctor d) {
		d.addDay(dailySchedule);
		dailySchedule.clear();
	}
	
	
}
