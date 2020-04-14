package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;


/**
 * @author Firoz Lakhani
 *
 */

public class Appoint {
	private String pName;
	private String dName;
	private int year;
	private int month;
	private int day;
	private int sHour;
	private int eHour;
	
	/**
	 * @param dName
	 * @param pName
	 * @param year
	 * @param month
	 * @param day
	 * @param sHour
	 * @param eHour
	 */
	public Appoint(String dName, String pName, int year, int month, int day, int sHour, int eHour){
	
		this.setdName(dName);
		this.setpName(pName);
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
		this.setsHour(sHour);
		this.seteHour(eHour); 
	}

	
	
	//getters and setters
	public String getdName() {
		return this.dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}
	
	public String getpName() {
		return this.pName;
	}

	public void setpName(String dName) {
		this.pName = dName;
	}
	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getsHour() {
		return sHour;
	}

	public void setsHour(int sHour) {
		this.sHour = sHour;
	}

	public int geteHour() {
		return eHour;
	}

	public void seteHour(int eHour) {
		this.eHour = eHour;
	}
	
	public String getDate() {
		return month+"/"+day+"/"+year;
	}
	
	//https://stackoverflow.com/questions/1377279/find-a-line-in-a-file-and-remove-it
	public static void rmAppt(Appoint a) throws Exception {
		File inputFile = new File("./dat/appointments.txt");
		File tempFile = new File("./dat/tempFile.txt");

		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
		BlockingQueue<String> blockingQueue = new LinkedBlockingDeque<>(4);
		
		
		ArrayList<String> remove = new ArrayList<String>();
		remove.add(a.getdName());
		remove.add(a.getpName());
		remove.add(a.getDate());
		remove.add(a.getsHour()+ " to "+ a.geteHour());
		String currentLine = reader.readLine();
		
		while(currentLine != null) {
			while(currentLine != null &&blockingQueue.offer(currentLine)) {
				currentLine = reader.readLine();
				//System.out.println(currentLine);
			}
			

			if(!blockingQueue.containsAll(remove)) {
				
				while(blockingQueue.peek() != null) {
					writer.write(blockingQueue.poll() + System.getProperty("line.separator"));
				//	System.out.println("writing");
				}
			}
		    // trim newline when comparing with lineToRemove
		   
			currentLine = reader.readLine();
		   // writer.write(currentLine + System.getProperty("line.separator"));
		}
		writer.close(); 
		reader.close(); 
		inputFile.delete();
		tempFile.renameTo(inputFile);
		
	}
	
	/**
	 * @param dName - name of the doctor
	 * @param pName - name of the patient
	 * @param year - year of the appointment
	 * @param month - month of the appointment
	 * @param day - day of the appointment
	 * @param sHour - start hour
	 * @param eHour - end hour
	 * Purpose: Appends the patient request to the doctor list of requested appointments
	 */
	public static void requestAppt(String dName,String pName, int year, int month, int day, int sHour, int eHour) throws IOException {
			
		BufferedWriter writer = new BufferedWriter(new FileWriter("./dat/appointments.txt", true));
		writer.write(dName+ "\n");
		writer.append(pName + "\n");
		writer.append(month + "/" + day + "/"+ year + "\n");
		writer.append(sHour+" to "+ eHour +"\n");
		writer.close();
		
	}
	
	/**
	 * @param dName - name of the doctor
	 * @param pName - name of the patient
	 * @param year - year of the appointment
	 * @param month - month of the appointment
	 * @param day - day of the appointment
	 * @param sHour - start hour
	 * @param eHour - end hour
	 * Purpose: Appends the patient request to the doctor list of confirmed appointments
	 */
	public static void confirmAppt(String dName,String pName, int year, int month, int day, int sHour, int eHour) throws IOException {
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("./dat/confAppointments.txt", true));
		writer.write(dName+ "\n");
		writer.append(pName + "\n");
		writer.append(month + "/" + day + "/"+ year + "\n");
		writer.append(sHour+" to "+ eHour +"\n");
		writer.close();
		
	}
	

	
	

}
