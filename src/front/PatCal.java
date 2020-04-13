package front;
import javax.swing.*;
//import javax.swing.event.*;
import javax.swing.table.*;

import back.Main;


import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PatCal extends JPanel{
	private static final long serialVersionUID = 1L;
	JLabel lblMonth, lblYear;
     JButton btnPrev, btnNext, btnRet;
     JTable tblCalendar;
     JComboBox<String> cmbYear;
     JFrame frmMain;
     
     DefaultTableModel mtblCalendar;
     JScrollPane stblCalendar;
    
     int realYear, realMonth, realDay, currentYear, currentMonth;
     int indFirstX;
     int numDays;
     String user = null;
    
    
    public PatCal (String user, String flag){
    	this.user = user;
  
        try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
        catch (ClassNotFoundException e) {}
        catch (InstantiationException e) {}
        catch (IllegalAccessException e) {}
        catch (UnsupportedLookAndFeelException e) {}
        
        

 //       frmMain = new JFrame ("Simple Calander");  
//        
//        frmMain.setSize(330, 375); 
//        pane = frmMain.getContentPane(); 
 //       pane.setLayout(null); 
 //       frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        //controling
        lblMonth = new JLabel ("January");
        lblYear = new JLabel ("Change year:");
        cmbYear = new JComboBox<String>();
        btnPrev = new JButton ("<<");
        btnNext = new JButton (">>");
        btnRet = new JButton("Back");
        
        mtblCalendar = new DefaultTableModel(){
			private static final long serialVersionUID = 1L;
			public boolean isCellEditable(int rowIndex, int mColIndex){return false;}
		};
		
        tblCalendar = new JTable(mtblCalendar);
        stblCalendar = new JScrollPane(tblCalendar);
        
        //https://stackoverflow.com/questions/7350893/click-event-on-jtable-java
        tblCalendar.addMouseListener(new java.awt.event.MouseAdapter() {
        	@Override
        	
        	public void mouseClicked(java.awt.event.MouseEvent evt) {		
        		
               int row = tblCalendar.rowAtPoint(evt.getPoint());
               int col = tblCalendar.columnAtPoint(evt.getPoint());
               
               int day = row * 7 + (col + 1) - indFirstX;
               
               if(day<=numDays && day >= 1) {
            	   Main.window.setScreen(Main.Screen.PREQ, user,(currentMonth+1)+"/"+day+"/"+currentYear);	
               }
               
                
                
               }
        });
      
        this.setBorder(BorderFactory.createTitledBorder("Calendar"));
        
        
        btnPrev.addActionListener(new btnPrev_Action());
        btnNext.addActionListener(new btnNext_Action());
        cmbYear.addActionListener(new cmbYear_Action());
        btnRet.addActionListener(new btnRet_Action());
       
        this.add(btnRet);
        this.add(lblMonth);
        this.add(lblYear);
        this.add(cmbYear);
        this.add(btnPrev);
        this.add(btnNext);
        this.add(stblCalendar);
        
    
        this.setBounds(0, 0, 320, 335);
        lblMonth.setBounds(160-lblMonth.getPreferredSize().width/2, 25, 100, 25);
        lblYear.setBounds(10, 305, 80, 20);
        cmbYear.setBounds(230, 305, 80, 20);
        btnPrev.setBounds(10, 25, 50, 25);
        btnNext.setBounds(260, 25, 50, 25);
        stblCalendar.setBounds(10, 50, 300, 250);
        
     
      
        
        //Get month and year
        GregorianCalendar cal = new GregorianCalendar();
        realDay = cal.get(GregorianCalendar.DAY_OF_MONTH);
        realMonth = cal.get(GregorianCalendar.MONTH);
        realYear = cal.get(GregorianCalendar.YEAR); 
        currentMonth = realMonth; 
        currentYear = realYear;
        
        //The header
        String[] headers = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; 
        for (int i=0; i<7; i++){
            mtblCalendar.addColumn(headers[i]);
        }
        
        tblCalendar.getParent().setBackground(tblCalendar.getBackground()); 
        
     
        tblCalendar.getTableHeader().setResizingAllowed(false);
        tblCalendar.getTableHeader().setReorderingAllowed(false);
        
       
        tblCalendar.setColumnSelectionAllowed(true);
        tblCalendar.setRowSelectionAllowed(true);
        tblCalendar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
       
        tblCalendar.setRowHeight(38);
        mtblCalendar.setColumnCount(7);
        mtblCalendar.setRowCount(6);
        
     
        for (int i=realYear-100; i<=realYear+100; i++){
            cmbYear.addItem(String.valueOf(i));
        }
        
        
        refreshCalendar (realMonth, realYear); 
    }
    
    public void refreshCalendar(int month, int year){
        
        String[] months =  {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int nod, som; 
      
        
      
        btnPrev.setEnabled(true);
        btnNext.setEnabled(true);
        if (month == 0 && year <= realYear-10){btnPrev.setEnabled(false);} 
        if (month == 11 && year >= realYear+100){btnNext.setEnabled(false);} 
        lblMonth.setText(months[month]);
        lblMonth.setBounds(160-lblMonth.getPreferredSize().width/2, 25, 180, 25); 
        cmbYear.setSelectedItem(String.valueOf(year)); 
        
        //Create table
        for (int i=0; i<6; i++){
            for (int j=0; j<7; j++){
                mtblCalendar.setValueAt(null, i, j);
            }
        }
        
        //get the first day of month and number of days
        GregorianCalendar cal = new GregorianCalendar(year, month, 1);
        nod = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        som = cal.get(GregorianCalendar.DAY_OF_WEEK);
        
        indFirstX = (1+som-2)%7;
        
        
        numDays = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        //Draw the Calander
        for (int i=1; i<=nod; i++){
            int row = (i+som-2)/7; //new Integer((i+som-2)/7);
            int column  =  (i+som-2)%7;
            mtblCalendar.setValueAt(i, row, column);
        }
        
        
        tblCalendar.setDefaultRenderer(tblCalendar.getColumnClass(0), new tblCalendarRenderer());
    }
    
     class tblCalendarRenderer extends DefaultTableCellRenderer{

		private static final long serialVersionUID = 1L;

		public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column){
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            if (column == 0 || column == 6){ 
                setBackground(new Color(255, 220, 220));
            }
            else{ 
                setBackground(new Color(255, 255, 255));
            }
            if (value != null){
                if (Integer.parseInt(value.toString()) == realDay && currentMonth == realMonth && currentYear == realYear){
                    setBackground(new Color(220, 220, 255));
                }
            }
            setBorder(null);
            setForeground(Color.black);
            return this;
        }
    }
    
     class btnPrev_Action implements ActionListener{
        public void actionPerformed (ActionEvent e){
            if (currentMonth == 0){
                currentMonth = 11;
                currentYear -= 1;
            }
            else{ //Back one month
                currentMonth -= 1;
            }
            refreshCalendar(currentMonth, currentYear);
        }
    }
     class btnNext_Action implements ActionListener{
        public void actionPerformed (ActionEvent e){
            if (currentMonth == 11){ 
                currentMonth = 0;
                currentYear += 1;
            }
            else{ 
                currentMonth += 1;
            }
            refreshCalendar(currentMonth, currentYear);
        }
    }
     
     class cmbYear_Action implements ActionListener{
        public void actionPerformed (ActionEvent e){
            if (cmbYear.getSelectedItem() != null){
                String b = cmbYear.getSelectedItem().toString();
                currentYear = Integer.parseInt(b);
                refreshCalendar(currentMonth, currentYear);
            }
        }
    }
     class btnRet_Action implements ActionListener{
         public void actionPerformed (ActionEvent e){
             if (cmbYear.getSelectedItem() != null){
            	 Main.window.setScreen(Main.Screen.PPAGE, user, null);
             }
         }
     }
}


//Barebone model form the javahungry.blogspot.com