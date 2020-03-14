import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 760, 520);
		frame.setResizable(false);
		Calendar pane = new Calendar(frame);
		frame.setContentPane(pane);
		frame.revalidate();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
