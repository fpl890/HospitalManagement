package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Appoint {
	private String pName;
	private String dName;
	private int year;
	private int month;
	private int day;
	private int sHour;
	private int eHour;
	
	public Appoint(String dName, String pName, int year, int month, int day, int sHour, int eHour){
		this.setdName(dName);
		this.setpName(pName);
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
		this.setsHour(sHour);
		this.seteHour(eHour); 
			
				
	}

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
	
	
	
	public static void requestAppt(String dName,String pName, int year, int month, int day, int sHour, int eHour) throws IOException {
			
		BufferedWriter writer = new BufferedWriter(new FileWriter("./dat/appointments.txt", true));
		writer.write(dName+ "\n");
		writer.append(pName + "\n");
		writer.append(month + "/" + day + "/"+ year + "\n");
		writer.append(sHour+" to "+ eHour +"\n");
		writer.close();
		
	}
	
	/*
	
	public static void main (String[] args) {
		try {
			Appoint.requestAppt("Firoz", "John", 2000, 7, 4, 1, 2);
			Appoint.requestAppt("Asad", "Jacky", 2000, 7, 5, 1, 2);
			Appoint.requestAppt("Gavin", "Emily", 2000, 7, 6, 1, 2);
			Appoint.requestAppt("Firoz", "Samantha", 2000, 7, 7, 1, 2);
			Appoint.requestAppt("Steven", "Sarah", 2000, 7, 8, 1, 2);
			Appoint.requestAppt("Steven", "James", 2000, 7, 9, 1, 2);
			Appoint.requestAppt("Gavin", "Bill", 2000, 7, 10, 1, 2);
			Appoint.requestAppt("Gavin", "Jannet", 2000, 7, 11, 1, 2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	*/

}
