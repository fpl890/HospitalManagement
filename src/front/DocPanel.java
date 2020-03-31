package front;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import back.Main;

import javax.swing.JButton;

public class DocPanel extends JPanel implements ActionListener {
	JButton btnNewButton;
	JButton btnNewButton_1;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public DocPanel() {
		
		 btnNewButton = new JButton("Calendar");
		btnNewButton.setActionCommand("calen");
		btnNewButton.addActionListener(this);
		
		 btnNewButton_1 = new JButton("View Appointments");
		btnNewButton_1.setActionCommand("apnt");
		btnNewButton_1.addActionListener(this);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(163)
					.addComponent(btnNewButton_1)
					.addContainerGap(164, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(196, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(179))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(98)
					.addComponent(btnNewButton)
					.addGap(18)
					.addComponent(btnNewButton_1)
					.addContainerGap(138, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
	
	public void actionPerformed(ActionEvent e) {
	
	    if(e.getActionCommand().equals("calen")) {
	    
	    	Main.window.setScreen(Main.Screen.CALEN);
	    	
	    }
	    else if(e.getActionCommand().equals("apnt")) {
	    	Main.window.setScreen(Main.Screen.REQAP);
	    }
	    
	} 
}
