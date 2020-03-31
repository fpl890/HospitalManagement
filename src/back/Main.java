package back;
import java.awt.EventQueue;
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
	private JPanel calendar = new SimpleCalendar();
	private JPanel schedule = new Schedule();
	private JPanel register = new Register();	
	private JPanel reqApp = new ReqAppoint();		
	private JPanel docPan = new DocPanel();
	public static Main window = new Main();
	private JFrame frame;
	private JPanel current = login;
	
	/**
	 * This enum allows encapsulation of all JPanels within Main
	 */
	public enum Screen{
		CALEN, LOGIN, SCHED, REGIS, REQAP, DOCPA
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
	public void setScreen(Screen screen) {
		frame.remove(current);
		current = getPanel(screen);
		frame.setContentPane(current);
		frame.validate();
		frame.repaint();
	}
	

	/**
	 * Helper function for setScreen which "coverts" the enum name to a JPanel
	 * @param srn: member of the enum Screen
	 * @return appropriate JPanel
	 */
	private JPanel getPanel(Screen srn) {
		switch (srn) {
		case CALEN:
			return calendar;	
		case LOGIN:
			return login;
		case SCHED:
			return schedule;
		case REGIS:
			return register;
		case REQAP:
			return reqApp;
		case DOCPA:
			return docPan;
		default:
			throw new IllegalArgumentException();
		}
	}
}