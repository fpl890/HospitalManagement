package front;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;

import back.Appoint;
import back.Doctor;
import back.Main;
import back.Patient;

public class DocListPats extends JPanel implements ActionListener{


		private String doc;
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		Box verticalBox;
		
		ArrayList<Appoint> appoints;
		ArrayList<Patient> pats = new ArrayList<Patient>();
		
		/**
		 * Create the panel.
		 */
		public DocListPats(String user) {
			if(Doctor.isDoc(user)) doc = user;
	
			
			 verticalBox = Box.createVerticalBox();
			
			
			JScrollPane scrollPane = new JScrollPane(verticalBox);
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			
			try {
				appoints =  Doctor.generateConfAppointments(doc);
				
				for(Appoint a : appoints) {
					if(!pats.contains(Patient.lookupPat(a.getpName()))) pats.add(Patient.lookupPat(a.getpName()));
					//System.out.println("name: "+ a.getpName());
					//System.out.println("instance: "+Patient.lookupPat(a.getpName()));
					
				}
				
			} catch (IOException e) {
				System.out.println("could not open file");
				 //TODO Auto-generated catch block
				e.printStackTrace();
			}

			refreshList();
			
			
		
			scrollPane.setBounds(500, 310, -364, -303);
			
			JLabel lblNewLabel = new JLabel("View Patients");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
			
			
			JButton btnNewButton = new JButton("Return to Home");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					Main.window.setScreen(Main.Screen.DPAGE, user, null);

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
		
		void makeBox(Patient p, int ind){
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
			//System.out.println(p);
			JLabel nm = new JLabel("Name: "+p.getName());
			
		
			
			JButton info  = new JButton("More Info");
			info.setActionCommand(Integer.toString(ind));
			info.addActionListener(this);
			
			vbox.add(Box.createRigidArea(new Dimension(0,5)));
			vbox.add(nm);
			

			vbox.add(info);
	
			vbox.add(Box.createRigidArea(new Dimension(0,5)));
			

			verticalBox.add(interHbox);
			
		}
		
		void refreshList() {

			if (pats != null) {
				for(int i= 0; i < pats.size(); i++) {
				
						makeBox(pats.get(i),i);
					
					
				}
			}
		}

		public void actionPerformed(ActionEvent e) {
			
		
			int ind =  Integer.parseInt(e.getActionCommand());	
			Main.window.setScreen(Main.Screen.PATDA, doc, pats.get(ind));
			
			
			
			
				
		
		    
		} 
		

	}


