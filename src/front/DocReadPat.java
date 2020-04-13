package front;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import back.Main;
import back.Patient;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DocReadPat extends JPanel {
	JLabel name;
	JLabel heightWeight;
	JLabel birth;
	JLabel sex;
	JLabel cond;
	String user;
	Patient p;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public DocReadPat(String user, Patient p) {
		this.p = p;
		this.user = user;
		
		setLayout(null);
		
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
		
		writeDat(p);
		
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.window.setScreen(Main.Screen.PLIS, user, null);
			}
		});
		
		
	}
	
	public void writeDat(Patient p) {
		name.setText("Name: " + p.getName());
		heightWeight.setText("Height: " + Integer.toString(p.getHeight()) + " Weight: " + Double.toString(p.getWeight()));
		birth.setText("birthdate: " + p.getBirthday());
		sex.setText(p.getSex());
	
		cond.setText(p.getPreExistCon());
		
		
	}
}
