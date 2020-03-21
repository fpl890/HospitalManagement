package back;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;

import front.Login;
import front.Register;
import front.Schedule;
import front.SimpleCalendar;



/**
 * @author Gavin
 *
 */
public class Main {
	//Total JPanels in app 
	private JPanel login = new Login();
	private JPanel calendar = new SimpleCalendar();
	private JPanel schedule = new Schedule();
	private JPanel register = new Register();
	
	public static Main window = new Main();
	private JFrame frame;
	private JPanel current = login;
	
	public enum Screen{
		CALEN, LOGIN, SCHED, REGIS
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
	 * Create the application.
	 */
	public Main() {
		frame = new JFrame();
		frame.setBounds(500, 500, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(current);
	}
	
	// Purpose: This method is called by some JPanel to swich to a different panel
	// Input: member of the enum screen
	// Output: nothing
	public void setScreen(Screen screen) {
		frame.remove(current);
		current = getPanel(screen);
		frame.setContentPane(current);
		frame.validate();
		frame.repaint();
	}
	
	
	// Purpose: Helper function for setScreen
	// Input: member of the enum screen
	// Ouput: JPanel
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
		default:
			throw new IllegalArgumentException();
		}
	}
}