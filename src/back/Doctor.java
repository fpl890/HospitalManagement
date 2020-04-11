package back;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class implements static and notstatic methods needed for doctors
 * Cleaned by Gavin April 8
 * @author Firoz Lakhani
 */
public class Doctor extends Person {
	
	private List<List<String>> schedule = new ArrayList<List<String>>();
	private ArrayList<Appoint> appointments = new ArrayList<Appoint>();
	private String department;
	private String name;
	
	
	/**
	 * @param name = name of doctor
	 * @param department =  name of dept
	 */
	public Doctor (String name, String department) {
		this.name = name;
		this.department = department;
	}
	
	/**
	 * @param name = name of person to check if they are a doctor
	 * @return False if not a saved doctor. True otherwise
	 */
	public static boolean isDoc(String name) {
		boolean found = false;
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("./dat/doctors.txt"));
			String line = reader.readLine();
			while(!found && line != null) {
				if(name.equals(line)) found = true;
				line = reader.readLine();
			}
			
		} catch ( IOException e) {
			e.printStackTrace();
			System.out.println("Couldnt open file");
		}
		return found;
	}
	
	/**
	 * Saves a doctors info into txt file for later retrieval
	 * @throws IOException
	 */
	public  void writeInfo() throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("./dat/doctors.txt", true));
		writer.write(this.getName() + "\n");
		writer.append(this.getDepartment() + "\n");
		writer.close();
	}
	
	/**
	 * @param name = name of doctor to be searched
	 * @return list of appointments under that docs name
	 * @throws IOException
	 */
	public static ArrayList<Appoint> generateAppointments(String name) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("./dat/appointments.txt"));
		ArrayList <Appoint> appts = new ArrayList<Appoint>();
		String line = "";
		while (line!=null) {
			line = reader.readLine();
			if (line!=null &&line.equals(name)) {
				String patient = reader.readLine();
				String[] date = reader.readLine().split("/");
				int  month = Integer.parseInt(date[0]);
				int day = Integer.parseInt(date[1]);
				int year = Integer.parseInt(date [2]);
				String[] time = reader.readLine().split(" ");
				int sHour = Integer.parseInt(time[0]);
				int eHour = Integer.parseInt(time[2]);
				Appoint appt = new Appoint(name, patient, year, month, day, sHour, eHour);
				appts.add(appt);
			}
		}
		reader.close();
		return appts;
	}
	/**
	 * @param name = name of doctor to be searched
	 * @return list of confirmed appointments under that docs name
	 * @throws IOException
	 */
	public static ArrayList<Appoint> generateConfAppointments(String name) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("./dat/confAppointments.txt"));
		ArrayList <Appoint> appts = new ArrayList<Appoint>();
		String line = "";
		while (line!=null) {
			line = reader.readLine();
			if (line!=null &&line.equals(name)) {
				String patient = reader.readLine();
				String[] date = reader.readLine().split("/");
				int  month = Integer.parseInt(date[0]);
				int day = Integer.parseInt(date[1]);
				int year = Integer.parseInt(date [2]);
				String[] time = reader.readLine().split(" ");
				int sHour = Integer.parseInt(time[0]);
				int eHour = Integer.parseInt(time[2]);
				Appoint appt = new Appoint(name, patient, year, month, day, sHour, eHour);
				appts.add(appt);
			}
		}
		reader.close();
		return appts;
	}
	
	
 //Getters and setters
	
	public List<List<String>> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<List<String>> schedule) {
		this.schedule = schedule;
	}

	public void addDay(List<String> s) {
		schedule.add(s);
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void addAppointment(Appoint appt) {
		appointments.add(appt);
	}
	
	public void removeAppointment(Appoint appt) {
		appointments.remove(appt);	
	}
	
	public ArrayList<Appoint> getAppointments() {
		return this.appointments;
	}
	
}