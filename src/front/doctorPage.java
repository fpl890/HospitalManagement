package front;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class doctorPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					doctorPage window = new doctorPage();
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
	public doctorPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Doctor Home Screen");
		lblNewLabel.setBounds(155, 11, 123, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("View requested appointments");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(245, 58, 179, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("View appointments' schedule");
		button.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button.setBounds(244, 92, 180, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("View list of patients");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(245, 127, 179, 23);
		frame.getContentPane().add(button_1);
		
		JButton btnNewButton_1 = new JButton("Back to login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(293, 227, 131, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/doctor.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(22, -94, 213, 478);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
