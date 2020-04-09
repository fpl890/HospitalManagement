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
	
	public Patient(String id, String name, String birthday, String sex, String preExistCon, int height, double weight) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.preExistCon = preExistCon;
		this.height = height;
		this.weight = weight;
	}

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
	
	
	/**
	 * @param id
	 * @param name
	 * @param birthday
	 * @param sex
	 * @param height
	 * @param weight
	 * @param PEC
	 * @throws IOException
	 */
	public static void writeInfo(String id, String name, String birthday, String sex, int height, double weight,
			String PEC) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("./dat/patientInfo.txt", true));
		writer.write(id + "\n");
		writer.append(name + "\n");
		writer.append(birthday + "\n");
		writer.append(sex + "\n");
		writer.append(height + "\n");
		writer.append(weight + "\n");
		writer.append(PEC + "\n");
		writer.close();
	}
	
	/**
	 * @param id
	 * @param name
	 * @param birthday
	 * @param sex
	 * @param height
	 * @param weight
	 * @param PEC
	 * @throws IOException
	 */
	public void writeInfo() throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("./dat/patientInfo.txt", true));
		writer.write(id + "\n");
		writer.append(name + "\n");
		writer.append(birthday + "\n");
		writer.append(sex + "\n");
		writer.append(height + "\n");
		writer.append(weight + "\n");
		writer.append(preExistCon + "\n");
		writer.close();
	}


		
	/**
	 * @param id
	 * @return
	 * @throws IOException
	 */
	public static String getPatientName(String id) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("./dat/patientInfo.txt"));
		String patientID = reader.readLine();
		String s = null;
		while(patientID != null) {
			
			if (patientID.equals(id)) {
				 s = reader.readLine();
				 
				reader.close();
				return s;
			}
			patientID = reader.readLine();
		}
		
		reader.close();
		return s;	
	}
	
	
	/**
	 * @param id
	 * @return
	 * @throws IOException
	 */
	public static String getPatientBirthday(String id) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("./dat/patientInfo.txt"));
		String patientID = reader.readLine();
		
		while(patientID != null) {
			//System.out.println(patientID);
			if (patientID.equals(id)) {
				reader.readLine();
				String s = reader.readLine();
				reader.close();
				return s;
			}
			patientID = reader.readLine();
		}
		
		reader.close();
		return null;	
	}
	
	/**
	 * @param id
	 * @return
	 * @throws IOException
	 */
	public static String getPatientSex(String id) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("./dat/patientInfo.txt"));
		String patientID = reader.readLine();
		
		while(patientID != null) {
			if (patientID.equals(id)) {
				reader.readLine();
				reader.readLine();
				String s = reader.readLine();
				reader.close();
				return s;
			}
			patientID = reader.readLine();
		}
		
		reader.close();
		return null;	
	}
	
	/**
	 * @param id
	 * @return
	 * @throws IOException
	 */
	public static String getPatientHeight(String id) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("./dat/patientInfo.txt"));
		String patientID = reader.readLine();
		
		while(patientID != null) {
			if (patientID.equals(id)) {
				reader.readLine();
				reader.readLine();
				reader.readLine();
				String s = reader.readLine();
				reader.close();
				return s;
			}
			patientID = reader.readLine();
		}
		
		reader.close();
		return null;	
	}
	
	/**
	 * @param id
	 * @return
	 * @throws IOException
	 */
	public static String getPatientWeight(String id) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("./dat/patientInfo.txt"));
		String patientID = reader.readLine();
		
		while(patientID != null) {
			System.out.println(patientID);
			if (patientID.equals(id)) {
				reader.readLine();
				reader.readLine();
				reader.readLine();
				reader.readLine();
				String s = reader.readLine();
				reader.close();
				return s;
			}
			patientID = reader.readLine();
		}
		
		reader.close();
		return null;	
	}
	
	/**
	 * @param id
	 * @return
	 * @throws IOException
	 */
	public static String getPatientPEC(String id) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("./dat/patientInfo.txt"));
		String patientID = reader.readLine();
		
		while(patientID != null) {
			if (patientID.equals(id)) {
				reader.readLine();
				reader.readLine();
				reader.readLine();
				reader.readLine();
				reader.readLine();
				String s = reader.readLine();
				reader.close();
				return s;
			}
			patientID = reader.readLine();
		}
		
		reader.close();
		return null;	
	}
	

}
