package back;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;

import front.*;



/**
 * The main method both launches the app and handles switching screens within the app
 * Cleaned by Firoz Lakhani
 * @author Gavin
 */
public class Main {
	
	//Total JPanels in app 
	private JPanel login = new Login();
	

			
	

	public static Main window = new Main();
	private JFrame frame;
	private JPanel current = login;
	
	/**
	 * This enum allows encapsulation of all JPanels within Main
	 */
	public enum Screen{
		CALEN, LOGIN, SCHED, REGIS, REQAP, PATDA, PPAGE, DPAGE, PFORM, PCAL, PREQ, PLIS, PVIEW
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
				} catch (Exception e) {
					//e.printStackTrace();
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

	
	public void setScreen(Screen screen, String user, Object flag) {
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
	private JPanel getPanel(Screen srn, String user, Object flag) {
		switch (srn) {
		case CALEN:
			
			JPanel calen = new DocCalendar(user, (String)flag);
			return calen;	
		case LOGIN:
			return login;
		case SCHED:
			JPanel sched = new DocSched(user, (String)flag);
			return sched;
		case REGIS:
			//JPanel register = ;	
			return new Register();
		case REQAP:
			JPanel reqApp = new DocConfirmApt(user);
			return reqApp;
		case PATDA:
			JPanel readPat = new DocReadPat(user, (Patient)flag);
			return readPat;
		case DPAGE:
			return new DocPage(user);
		case PPAGE:
			JPanel patPage = new PatPage(user);	
			return patPage;
		case PFORM:
			JPanel patForm = new PatForm(user);
			return patForm;
		case PCAL:
			JPanel patCalen = new PatCal(user, (String)flag);
			return patCalen;
		case PREQ:
			JPanel patRequest = new PatReqApt(user, (String)flag);
			return patRequest;
		case PLIS:
			JPanel patientList = new DocListPats(user);
			return patientList;
		case PVIEW:
			return new PatViewAppt(user);
					
		default:
			throw new IllegalArgumentException();
		}
	}



	
	
	
}