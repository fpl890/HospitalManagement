package front;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import back.Appoint;
import back.Doctor;
import back.Main;
import back.Person;

import javax.swing.JTable;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.Box.Filler;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ScrollPaneConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class DocSched extends JPanel {
	private String doc, date;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Box verticalBox;
	
	ArrayList<Appoint> appoints;
	
	/**
	 * Create the panel.
	 */
	public DocSched(String user, String date) {
		if(Doctor.isDoc(user)) doc = user;
		this.date = date;
		
		 verticalBox = Box.createVerticalBox();
		
		
		JScrollPane scrollPane = new JScrollPane(verticalBox);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		try {
			appoints =  Doctor.generateConfAppointments(doc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//System.out.println("null");
		}
//		
//		for(Appoint appt:appoints) {
//				/*Appoint hello = new Appoint("Firoz","gavin guinn", 	2020, 10, 12, 11, 12);
//				Appoint goodby = new Appoint("Firoz", "ravin tuinn", 	2020, 13, 2, 11, 12);
//				appoints.add(hello);
//				appoints.add(goodby);*/
//				appoints.add(appt);
//		}

		refreshList();
		
		
	
		scrollPane.setBounds(500, 310, -364, -303);
		
		JLabel lblNewLabel = new JLabel("View Confirmed Appointments");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		
		JButton btnNewButton = new JButton("Return to Schedule");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Main.window.setScreen(Main.Screen.CALEN, user, null);

			}
		});
		
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(82)
							.addComponent(btnNewButton)))
					.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		setLayout(groupLayout);
		
	
	
	}
	
	void makeBox(Appoint a, int ind){
		Box interHbox = Box.createHorizontalBox();
		interHbox.setPreferredSize(new Dimension(150, 150));
		interHbox.setAlignmentX(RIGHT_ALIGNMENT);
		
		Box vbox = Box.createVerticalBox();
		
		JLabel id = new JLabel(Integer.toString(ind+1));  
		interHbox.add(id);
		vbox.add(Box.createRigidArea(new Dimension(30,0)));
		interHbox.add(vbox);
		vbox.setAlignmentX(LEFT_ALIGNMENT);
		vbox.setMinimumSize(new Dimension(100, 50) );
		interHbox.setBorder(BorderFactory.createLineBorder(Color.black));
		JLabel nm = new JLabel("Name: "+a.getpName());
		JLabel date = new JLabel ( "Date: " +a.getMonth() + "/"+ a.getDay()+ "/"+a.getYear());
		JLabel time  = new JLabel("From: " + a.getsHour() + " to " +a.geteHour());
	
		

		
		vbox.add(Box.createRigidArea(new Dimension(0,5)));
		vbox.add(nm);
		
		vbox.add(date);
		vbox.add(time);
		vbox.add(Box.createRigidArea(new Dimension(0,5)));
		

		verticalBox.add(interHbox);
		
	}
	
	void refreshList() {
		for (Component c : verticalBox.getComponents()) {
			verticalBox.remove(c);
		}
		if (appoints != null) {
			for(int i= 0; i < appoints.size(); i++) {
				//System.out.println("This date: " + date + " Saved date:" +appoints.get(i).getDate());
				if(appoints.get(i).getDate().equals(date)) {
					makeBox(appoints.get(i), i );
				}
				
			}
		}
	}
	

}