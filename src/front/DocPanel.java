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
		
		JButton btnNewButton_2 = new JButton("View patient info");
		btnNewButton_2.setActionCommand("pati");
		btnNewButton_2.addActionListener(this);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(196, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(179))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(163)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_1))
					.addContainerGap(164, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(98)
					.addComponent(btnNewButton)
					.addGap(18)
					.addComponent(btnNewButton_1)
					.addGap(38)
					.addComponent(btnNewButton_2)
					.addContainerGap(77, Short.MAX_VALUE))
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
	    else if (e.getActionCommand().equals("pati")) {
	    	Main.window.setScreen(Main.Screen.PATDA);
	    }
	    
	} 
}
