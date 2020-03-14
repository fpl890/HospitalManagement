import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class Schedule extends JPanel {

	/**
	 * Create the panel.
	 */
	public Schedule(JFrame frame) {
		
		JLabel label = new JLabel("");
		
		JRadioButton radioButton = new JRadioButton("0:00 - 8:00");
		
		JRadioButton radioButton_1 = new JRadioButton("8:00 - 16:00");
		
		JRadioButton radioButton_1_1 = new JRadioButton("16:00 - 24:00");
		
		JLabel lblAvailableShiftsselect = new JLabel("Available Shifts (Select wanted shifts)");
		lblAvailableShiftsselect.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JRadioButton radioButton_2 = new JRadioButton("9:00 - 17:00");
		
		JRadioButton radioButton_1_1_1 = new JRadioButton("22:00 - 6:00");
		
		JButton btnConfirmSelection = new JButton("Confirm Selection");
		
		JLabel lblShiftsCurrentlySelected = new JLabel("Shifts currently scheduled for day:");
		
		JLabel label_1 = new JLabel("0:00 - 8:00");
		
		
		JLabel label_2 = new JLabel("8:00 - 16:00");
		
		JLabel label_3 = new JLabel("9:00 - 17:00");
		
		JLabel label_4 = new JLabel("16:00 - 24:00");
		
		JLabel label_5 = new JLabel("22:00 - 6:00");
		
		label_1.setVisible(false);
		label_2.setVisible(false);
		label_3.setVisible(false);
		label_4.setVisible(false);
		label_5.setVisible(false);
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(lblAvailableShiftsselect))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(70)
							.addComponent(btnConfirmSelection)))
					.addContainerGap(387, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addComponent(radioButton)
						.addComponent(radioButton_2)
						.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButton_1_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButton_1_1_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_5)
						.addComponent(lblShiftsCurrentlySelected, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(99, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(65)
							.addComponent(lblAvailableShiftsselect)
							.addGap(47)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label)
									.addGap(27))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(radioButton)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addComponent(radioButton_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(radioButton_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(radioButton_1_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(radioButton_1_1_1)
							.addGap(48)
							.addComponent(btnConfirmSelection))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(130)
							.addComponent(lblShiftsCurrentlySelected, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_4)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_5)))
					.addContainerGap(182, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
