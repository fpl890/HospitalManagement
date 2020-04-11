package back;
import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import front.*;



/**
 * The main method both launches the app and handles switching screens within the app
 * @author Gavin
 *
 */
public class Main {
	
	//Total JPanels in app 
	private JPanel login = new Login();
	private JPanel calendar;
	private JPanel schedule;
	private JPanel register = new Register();	
	private JPanel docPage ;	
	private JPanel patForm =  new patientform();
	private JPanel patCal;
	private JPanel patReq;
			
	
	private JPanel readPat = new ReadPatDat();
	public static Main window = new Main();
	private JFrame frame;
	private JPanel current = login;
	
	/**
	 * This enum allows encapsulation of all JPanels within Main
	 */
	public enum Screen{
		CALEN, LOGIN, SCHED, REGIS, REQAP, PATDA, PPAGE, DPAGE, PFORM, PCAL, PREQ
	}
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {	
					window = new Main();
					window.frame.setVisible(true);
					/*
					try {
						Appoint.requestAppt("gavin", "John", 2020, 4, 9, 1, 2);
						Appoint.requestAppt("Asad", "Jacky", 2000, 7, 5, 1, 2);
						Appoint.requestAppt("gavin", "Emily", 2000, 7, 6, 1, 2);
						Appoint.requestAppt("Firoz", "Samantha", 2000, 7, 7, 1, 2);
						Appoint.requestAppt("Steven", "Sarah", 2000, 7, 8, 1, 2);
						Appoint.requestAppt("Steven", "James", 2000, 7, 9, 1, 2);
						Appoint.requestAppt("gavin", "Bill", 2000, 7, 10, 1, 2);
						Appoint.requestAppt("gavin", "Jannet", 2000, 7, 11, 1, 2);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create and initialize the application.
	 */
	public Main() {
		frame = new JFrame();
		frame.setBounds(500, 500, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(current);
	}
	
	
	/**
	 * Purpose: This method is called by some JPanel to swich to a different panel
	 * @param screen: member of the enum screen
	 */

	
	public void setScreen(Screen screen, String user, String flag) {
		frame.remove(current);
		current = getPanel(screen, user, flag);
		frame.setContentPane(current);
		frame.validate();
		frame.repaint();
	}
	

	/**
	 * Helper function for setScreen which "coverts" the enum name to a JPanel
	 * @param srn: member of the enum Screen
	 * @return appropriate JPanel
	 */
	private JPanel getPanel(Screen srn, String user, String flag) {
		switch (srn) {
		case CALEN:
			JPanel calen = new SimpleCalendar(user, flag);
			return calen;	
		case LOGIN:
			return login;
		case SCHED:
			JPanel sched = new newSched(user, flag);
			return sched;
		case REGIS:
			return register;
		case REQAP:
			JPanel reqApp = new ReqAppoint(user);
			return reqApp;
		case PATDA:
			return readPat;
		case DPAGE:
			return new doctorPage(user);
		case PPAGE:
			JPanel patPage = new patientPage(user);	
			return patPage;
		case PFORM:
			return patForm;
		case PCAL:
			JPanel patCalen = new PatientCalendar(user, flag);
			return patCalen;
		case PREQ:
			JPanel patRequest = new PatRequestApt(user, flag);
			return patRequest;
			
		default:
			throw new IllegalArgumentException();
		}
	}


	private JPanel schedule(String flag) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}