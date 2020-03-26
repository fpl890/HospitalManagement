package front;
import javax.swing.JPanel;

import back.Main;


import javax.swing.JButton;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calendar extends JPanel {


	private static final long serialVersionUID = -2054425670598766858L;

	/**
	 * Create the panel.
	 */

	public Calendar() {  
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{91, 97, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{134, 25, 37, 25, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
	JButton btnNewButton = new JButton("1");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//Schedule panel = new Schedule(frame);
				//frame.setContentPane(panel);
				//frame.revalidate();
				Main.window.setScreen(Main.Screen.SCHED);
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 2;
		add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 4;
		gbc_btnNewButton_1.gridy = 2;
		add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 5;
		gbc_btnNewButton_2.gridy = 2;
		add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_7 = new JButton("4");
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_7.gridx = 6;
		gbc_btnNewButton_7.gridy = 2;
		add(btnNewButton_7, gbc_btnNewButton_7);
		
		JButton btnNewButton_11 = new JButton("5");
		GridBagConstraints gbc_btnNewButton_11 = new GridBagConstraints();
		gbc_btnNewButton_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_11.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_11.gridx = 7;
		gbc_btnNewButton_11.gridy = 2;
		add(btnNewButton_11, gbc_btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("6");
		GridBagConstraints gbc_btnNewButton_12 = new GridBagConstraints();
		gbc_btnNewButton_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_12.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_12.gridx = 8;
		gbc_btnNewButton_12.gridy = 2;
		add(btnNewButton_12, gbc_btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("7");
		GridBagConstraints gbc_btnNewButton_13 = new GridBagConstraints();
		gbc_btnNewButton_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_13.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_13.gridx = 9;
		gbc_btnNewButton_13.gridy = 2;
		add(btnNewButton_13, gbc_btnNewButton_13);
		
		JButton btnNewButton_3 = new JButton("8");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 3;
		gbc_btnNewButton_3.gridy = 3;
		add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("9");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 4;
		gbc_btnNewButton_4.gridy = 3;
		add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("10");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 5;
		gbc_btnNewButton_5.gridy = 3;
		add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnNewButton_23 = new JButton("11");
		GridBagConstraints gbc_btnNewButton_23 = new GridBagConstraints();
		gbc_btnNewButton_23.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_23.gridx = 6;
		gbc_btnNewButton_23.gridy = 3;
		add(btnNewButton_23, gbc_btnNewButton_23);
		
		JButton btnNewButton_25 = new JButton("12");
		GridBagConstraints gbc_btnNewButton_25 = new GridBagConstraints();
		gbc_btnNewButton_25.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_25.gridx = 7;
		gbc_btnNewButton_25.gridy = 3;
		add(btnNewButton_25, gbc_btnNewButton_25);
		
		JButton btnNewButton_28 = new JButton("13");
		GridBagConstraints gbc_btnNewButton_28 = new GridBagConstraints();
		gbc_btnNewButton_28.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_28.gridx = 8;
		gbc_btnNewButton_28.gridy = 3;
		add(btnNewButton_28, gbc_btnNewButton_28);
		
		JButton btnNewButton_8 = new JButton("14");
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_8.gridx = 9;
		gbc_btnNewButton_8.gridy = 3;
		add(btnNewButton_8, gbc_btnNewButton_8);
		
		JButton btnNewButton_17 = new JButton("15");
		GridBagConstraints gbc_btnNewButton_17 = new GridBagConstraints();
		gbc_btnNewButton_17.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_17.gridx = 3;
		gbc_btnNewButton_17.gridy = 4;
		add(btnNewButton_17, gbc_btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("16");
		GridBagConstraints gbc_btnNewButton_18 = new GridBagConstraints();
		gbc_btnNewButton_18.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_18.gridx = 4;
		gbc_btnNewButton_18.gridy = 4;
		add(btnNewButton_18, gbc_btnNewButton_18);
		
		JButton btnNewButton_20 = new JButton("17");
		GridBagConstraints gbc_btnNewButton_20 = new GridBagConstraints();
		gbc_btnNewButton_20.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_20.gridx = 5;
		gbc_btnNewButton_20.gridy = 4;
		add(btnNewButton_20, gbc_btnNewButton_20);
		
		JButton btnNewButton_22 = new JButton("18");
		GridBagConstraints gbc_btnNewButton_22 = new GridBagConstraints();
		gbc_btnNewButton_22.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_22.gridx = 6;
		gbc_btnNewButton_22.gridy = 4;
		add(btnNewButton_22, gbc_btnNewButton_22);
		
		JButton btnNewButton_26 = new JButton("19");
		GridBagConstraints gbc_btnNewButton_26 = new GridBagConstraints();
		gbc_btnNewButton_26.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_26.gridx = 7;
		gbc_btnNewButton_26.gridy = 4;
		add(btnNewButton_26, gbc_btnNewButton_26);
		
		JButton btnNewButton_29 = new JButton("20");
		GridBagConstraints gbc_btnNewButton_29 = new GridBagConstraints();
		gbc_btnNewButton_29.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_29.gridx = 8;
		gbc_btnNewButton_29.gridy = 4;
		add(btnNewButton_29, gbc_btnNewButton_29);
		
		JButton btnNewButton_9 = new JButton("21");
		GridBagConstraints gbc_btnNewButton_9 = new GridBagConstraints();
		gbc_btnNewButton_9.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_9.gridx = 9;
		gbc_btnNewButton_9.gridy = 4;
		add(btnNewButton_9, gbc_btnNewButton_9);
		
		JButton btnNewButton_16 = new JButton("22");
		GridBagConstraints gbc_btnNewButton_16 = new GridBagConstraints();
		gbc_btnNewButton_16.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_16.gridx = 3;
		gbc_btnNewButton_16.gridy = 5;
		add(btnNewButton_16, gbc_btnNewButton_16);
		
		JButton btnNewButton_19 = new JButton("23");
		GridBagConstraints gbc_btnNewButton_19 = new GridBagConstraints();
		gbc_btnNewButton_19.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_19.gridx = 4;
		gbc_btnNewButton_19.gridy = 5;
		add(btnNewButton_19, gbc_btnNewButton_19);
		
		JButton btnNewButton_21 = new JButton("24");
		GridBagConstraints gbc_btnNewButton_21 = new GridBagConstraints();
		gbc_btnNewButton_21.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_21.gridx = 5;
		gbc_btnNewButton_21.gridy = 5;
		add(btnNewButton_21, gbc_btnNewButton_21);
		
		JButton btnNewButton_24 = new JButton("25");
		GridBagConstraints gbc_btnNewButton_24 = new GridBagConstraints();
		gbc_btnNewButton_24.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_24.gridx = 6;
		gbc_btnNewButton_24.gridy = 5;
		add(btnNewButton_24, gbc_btnNewButton_24);
		
		JButton btnNewButton_27 = new JButton("26");
		GridBagConstraints gbc_btnNewButton_27 = new GridBagConstraints();
		gbc_btnNewButton_27.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_27.gridx = 7;
		gbc_btnNewButton_27.gridy = 5;
		add(btnNewButton_27, gbc_btnNewButton_27);
		
		JButton btnNewButton_30 = new JButton("27");
		GridBagConstraints gbc_btnNewButton_30 = new GridBagConstraints();
		gbc_btnNewButton_30.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_30.gridx = 8;
		gbc_btnNewButton_30.gridy = 5;
		add(btnNewButton_30, gbc_btnNewButton_30);
		
		JButton btnNewButton_10 = new JButton("28");
		GridBagConstraints gbc_btnNewButton_10 = new GridBagConstraints();
		gbc_btnNewButton_10.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_10.gridx = 9;
		gbc_btnNewButton_10.gridy = 5;
		add(btnNewButton_10, gbc_btnNewButton_10);
		
		JButton btnNewButton_14 = new JButton("29");
		GridBagConstraints gbc_btnNewButton_14 = new GridBagConstraints();
		gbc_btnNewButton_14.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_14.gridx = 3;
		gbc_btnNewButton_14.gridy = 6;
		add(btnNewButton_14, gbc_btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("30");
		GridBagConstraints gbc_btnNewButton_15 = new GridBagConstraints();
		gbc_btnNewButton_15.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_15.gridx = 4;
		gbc_btnNewButton_15.gridy = 6;
		add(btnNewButton_15, gbc_btnNewButton_15);
		
		JButton btnNewButton_6 = new JButton("31");
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_6.gridx = 5;
		gbc_btnNewButton_6.gridy = 6;
		add(btnNewButton_6, gbc_btnNewButton_6);
		
		/**
		 * 
		 */
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Main.window.setScreen(Main.Screen.SCHED);
			}
		});
		
		

	}
}

