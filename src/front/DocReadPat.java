package front;

import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.UUID;
import back.Main;
import back.Patient;

import java.awt.Color;
import javax.swing.SwingConstants;

public class DocReadPat extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private String user; 
	private Patient p;

	/**
	 * Launch the application.
	 */

	public String generateID() {
		return UUID.randomUUID().toString();
	}

	/**
	 * Create the application.
	 */
	public DocReadPat(String us, Patient p) {
		user =us;
		this.p = p;
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {		
		setLayout(null);

		JTextPane condBox = new JTextPane();
		condBox.setEditable(false);
		condBox.setBounds(87, 139, 245, 111);
		condBox.setText(p.getPreExistCon());
		add(condBox);
		

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(183, 266, 89, 23);
		add(btnBack);

		JLabel lbFirstName = new JLabel("Name:");
		lbFirstName.setBounds(10, 14, 86, 14);
		add(lbFirstName);

		JLabel lbHeight = new JLabel("Height");
		lbHeight.setBounds(10, 45, 46, 14);
		add(lbHeight);

		JLabel lbWeight = new JLabel("Weight");
		lbWeight.setBounds(317, 48, 46, 14);
		add(lbWeight);

		JLabel lbBirthday = new JLabel("Birthday");
		lbBirthday.setBounds(10, 76, 76, 14);
		add(lbBirthday);

		JLabel lbSex = new JLabel("Sex");
		lbSex.setBounds(10, 104, 46, 14);
		add(lbSex);

		JLabel lbConditions = new JLabel("Conditions");
		lbConditions.setBounds(10, 139, 76, 20);
		add(lbConditions);

		JLabel lbBirthday2 = new JLabel("(mm/dd/yyyy)");
		lbBirthday2.setBounds(183, 76, 89, 14);
		add(lbBirthday2);
		
		JLabel nameBox = new JLabel("");
		nameBox.setHorizontalAlignment(SwingConstants.CENTER);
		nameBox.setOpaque(true);
		nameBox.setBackground(Color.WHITE);
		nameBox.setBounds(87, 11, 86, 20);
		nameBox.setText(p.getName());
		add(nameBox);
		
		JLabel heightBox = new JLabel("");
		heightBox.setOpaque(true);
		heightBox.setBackground(Color.WHITE);
		heightBox.setBounds(87, 42, 86, 20);
		heightBox.setText((Integer.toString(p.getHeight())));
		add(heightBox);
		
		JLabel birthBox = new JLabel("");
		birthBox.setHorizontalAlignment(SwingConstants.CENTER);
		birthBox.setOpaque(true);
		birthBox.setBackground(Color.WHITE);
		birthBox.setBounds(87, 73, 86, 20);
		birthBox.setText(p.getBirthday());
		add(birthBox);
		
		JLabel sexBox = new JLabel("");
		sexBox.setHorizontalAlignment(SwingConstants.CENTER);
		sexBox.setOpaque(true);
		sexBox.setBackground(Color.WHITE);
		sexBox.setBounds(87, 101, 86, 20);
		sexBox.setText(p.getSex());
		add(sexBox);
		
		JLabel weightBox = new JLabel("");
		weightBox.setHorizontalAlignment(SwingConstants.CENTER);
		weightBox.setOpaque(true);
		weightBox.setBackground(Color.WHITE);
		weightBox.setBounds(294, 73, 86, 20);
		weightBox.setText(Double.toString(p.getWeight()));
		add(weightBox);
		
		
		

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.window.setScreen(Main.Screen.DPAGE, user, null);
			}
		});
	}
}
