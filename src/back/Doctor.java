package back;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author 
 *
 */
public class Doctor extends Person {
	
	private List<List<String>> schedule = new ArrayList<List<String>>();
	private ArrayList<Appoint> appointments = new ArrayList<Appoint>();
	private String department;
	private String name;
	
	public Doctor (String name, String department) {
		this.name = name;
		this.department = department;
	}
	public Doctor () {
		this.name = "John Doe";
		this.department = "unknown";
	}
	
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
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		
		}
		
		return found;
		
}
	
	/**
	 * @return
	 */
	public List<List<String>> getSchedule() {
		return schedule;
	}

	/**
	 * @param schedule
	 */
	public void setSchedule(List<List<String>> schedule) {
		this.schedule = schedule;
	}
	
	/**
	 * @param s
	 */
	
	public void addDay(List<String> s) {
		schedule.add(s);
	}
	
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public String fetchDepartment() throws IOException {
	
			BufferedReader reader = new BufferedReader(new FileReader("./dat/appointments.txt"));
			String line = "";
			while(!line.equals(this.getName())) {
				line = reader.readLine();
			}
			
			return reader.readLine();
			
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
	
	/*public void getAppointment(int index) {
		appointments.get(index);
	}*/
	
	public ArrayList<Appoint> getAppointments() {
		return this.appointments;
	}
	
	/*
	
	public void sortAppointments() {
		Comparator<Appoint> compareByTime = new Comparator<Appoint>() {
		    @Override
		    public int compare(Appoint o1, Appoint o2) {
		    	if (o1.getYear().compareTo(o2.getYear()) == 0) {
		    		
		    		if(o1.getMonth().compareTo(o2.getMonth()) == 0) {
		    			
		    			if(o1.getDay().compareTo(o2.getDay()) == 0) {
		    					
			    				return o1.getTimeFrame().compareTo(o2.getTimeFrame());	
			    		}else{
			    			return o1.getDay().compareTo(o2.getDay());
			    		}
		    		}else{
		    			return o1.getMonth().compareTo(o2.getMonth());
		    		}
		    	}else {
		    		return o1.getYear().compareTo(o2.getYear());
		    	}
		        
		    }
		};
		Collections.sort(this.appointments, compareByTime);
	
	}
	*/
	
	public  void writeInfo() throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("./dat/doctors.txt", true));
		writer.write(this.getName() + "\n");
		writer.append(this.getDepartment() + "\n");
		writer.close();
		

	}
	
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
		return appts;
	}
	

	
}
