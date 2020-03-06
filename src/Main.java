import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main {
	static Main window = new Main();
	private JFrame login;
	private JFrame calendar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {	
					setLogin(true);
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
		initLogin();
		initCalendar();
	}

	private void initLogin() {
		login = new Login();
		login.setBounds(100, 100, 450, 300);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void initCalendar() {
		calendar = new Calendar();
		calendar.setBounds(100, 100, 450, 300);
		calendar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void setCalendar(Boolean set) {
		window.calendar.setVisible(set);
	}
	
	public static void setLogin(Boolean set) {
		window.login.setVisible(set);
	}
}
