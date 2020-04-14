package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 * This class implements the methods needed for a patient
 * @author Asad
 *
 */
public class Patient extends Person {

	String id, name, birthday, sex, preExistCon, docName;
	int height;
	double weight;

	ArrayList<String> listOfAppointments = new ArrayList<String>();
	
	/**
	 * @param id = id a patient
	 * @param name = name of a patient
	 * @param birthday = birthday of a patient
	 * @param sex = sex of a patient
	 * @param preExistCon = PreExisting conditions of a patient
	 * @param height = height of a patient
	 * @param weight = weight of a patient
	 */
	public Patient(String id, String name, String birthday, String sex, String preExistCon, int height, double weight) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.preExistCon = preExistCon;
		this.height = height;
		this.weight = weight;
	}

	
	/**
	 * Write the information for a new patient
	 * @param id = id of patient to be stored
	 * @param name = name of patient to be stored
	 * @param birthday = birthday of patient to be stored
	 * @param sex = gender of patient to be stored
	 * @param height = height of patient to be stored
	 * @param weight = weight of patient to be stored
	 * @param PEC =  PreExisting conditions of patient to be stored
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
	 * Write the information for a PreEexisting patient
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
	 * Obtain the name of a patient depending on their id
	 * @param id = id of patient whose name we want
	 * @return the name of a patient depending on their id
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
	 * Obtain the birthday of a patient depending on their id
	 * @param id = id of patient whose birthday we want
	 * @return the birthday of a patient depending on their id
	 * @throws IOException
	 */
	public static String getPatientBirthday(String id) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("./dat/patientInfo.txt"));
		String patientID = reader.readLine();
		
		while(patientID != null) {
			
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
	 * Obtain the sex of a patient depending on their id
	 * @param id = id of patient whose sex we want
	 * @return the sex of a patient depending on their id
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
	 * Obtain the height of a patient depending on their id
	 * @param id = id of patient whose height we want
	 * @return height of a patient depending on their id
	 * @throws IOException
	 */
	public static int getPatientHeight(String id) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("./dat/patientInfo.txt"));
		String patientID = reader.readLine();
		
		while(patientID != null) {
			if (patientID.equals(id)) {
				reader.readLine();
				reader.readLine();
				reader.readLine();
				String s = reader.readLine();
				reader.close();
				return Integer.parseInt(s);
			}
			patientID = reader.readLine();
		}
		
		reader.close();
		return -1;	
	}
	
	/**
	 * Obtain the weight of a patient depending on their id
	 * @param id = id of patient whose weight we want
	 * @return weight of a patient depending on their id
	 * @throws IOException
	 */
	public static Double getPatientWeight(String id) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("./dat/patientInfo.txt"));
		String patientID = reader.readLine();
		
		while(patientID != null) {
			
			if (patientID.equals(id)) {
				reader.readLine();
				reader.readLine();
				reader.readLine();
				reader.readLine();
				String s = reader.readLine();
				reader.close();
				return Double.parseDouble(s);
			}
			patientID = reader.readLine();
		}
		
		reader.close();
		return null;	
	}
	
	/**
	 * Add of the possible doctors into an ArrayList
	 * @return an ArrayList containing all of the doctors
	 * @throws IOException
	 */
	public static ArrayList<String> fetchDoctors() throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("./dat/doctors.txt"));
		String doctor = "";
		ArrayList<String> doctors = new ArrayList<String>();
		while (doctor != null) {
			doctor = reader.readLine();
			doctors.add(doctor);
			reader.readLine();
		}
		reader.close();
		return doctors;
		
	}
	
	/**
	 * Obtain the PreExisting conditions of a patient depending on their id
	 * @param id = id of patient whose conditions we want
	 * @return PreExisting condition of a patient depending on their id
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
	
		
	/**
	 * Obtain the id of a patient depending on their name
	 * @param name = name of patient whose id we want
	 * @return id depending on the patients name who we want to search
	 * @throws IOException
	 */
	public static String getID(String name) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("./dat/patientInfo.txt"));
		String lastLine= reader.readLine();
		String patientName = reader.readLine();
		
		while(patientName != null) {
			if (patientName.equals(name)) {
		
				
				reader.close();
				return lastLine;
			}
			lastLine = patientName;
			patientName = reader.readLine();
		}
		
		reader.close();
		return null;	
		
	}
	
	/**
	 * Search for a patient depending on their id
	 * @param name = id of patient we want to search
	 * @return a patient depending on the id specified
	 * @throws IOException
	 */
	public static Patient lookupPat(String name) throws IOException {
		
		try {
			String id= getID(name);
			if(id==null) return null;
			return new Patient(id,  getPatientName(id), getPatientBirthday(id), getPatientSex(id), getPatientPEC(id), getPatientHeight(id), getPatientWeight(id));
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		return null;	
	}
	

	/**
	 * Generate the appointments for a given patient
	 * @param name = patient whose appointments we want to fetch
	 * @return ArrayList containing the appointments for a given patient
	 * @throws IOException
	 */
	public static ArrayList<Appoint> generateAppointments(String name) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("./dat/confAppointments.txt"));
		ArrayList <Appoint> appts = new ArrayList<Appoint>();
		String line = reader.readLine();
		String last = "";
		while (line!=null) {
			
			if (line!=null && line.equals(name)) {
				String doc = last;
				String patient = line;
				String[] date = reader.readLine().split("/");
				int  month = Integer.parseInt(date[0]);
				int day = Integer.parseInt(date[1]);
				int year = Integer.parseInt(date [2]);
				String[] time = reader.readLine().split(" ");
				int sHour = Integer.parseInt(time[0]);
				int eHour = Integer.parseInt(time[2]);
				Appoint appt = new Appoint(doc, patient, year, month, day, sHour, eHour);
				appts.add(appt);
			}
			last = line;
			line = reader.readLine();
		}
		reader.close();
		return appts;
	}
	
	
	//Getters and Setters
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
}
