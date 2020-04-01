package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Patient extends Person {

	String id, name, birthday, sex, preExistCon;
	int height;
	double weight;

	ArrayList<String> listOfAppointments = new ArrayList<String>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPreExistCon() {
		return preExistCon;
	}

	public void setPreExistCon(String preExistCon) {
		this.preExistCon = preExistCon;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public ArrayList<String> getListOfAppointments() {
		return listOfAppointments;
	}

	public void setListOfAppointments(ArrayList<String> listOfAppointments) {
		this.listOfAppointments = listOfAppointments;
	}

	public static void writeInfo(String id, String name, String birthday, String sex, int height, double weight,
			String PEC, ArrayList<String> LOA) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("./dat/patientInfo.txt"));
		writer.write(id + "\n");
		writer.write(LOA + "\n");
		writer.write(name + "\n");
		writer.write(birthday + "\n");
		writer.write(sex + "\n");
		writer.write(height + "\n");
		writer.write(weight + "\n");
		writer.write(PEC + "\n");
	}

	/*
	 * IS THIS NEEDED ONLY NEED TO READ LISTOFAPPOINTMENTS
	 */
	public static String getAppointments(String id) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("./dat/patientInfo.txt"));
		String patientID = reader.readLine();
		
		while(patientID != null) {
			if (patientID == id) {
				 String s = reader.readLine();
				 reader.close();
				 return s;
				 
			}
			
			patientID = reader.readLine();
			
		}
		reader.close();
		return "";
	}
	

}
