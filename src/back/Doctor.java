package back;
import java.util.ArrayList;
import java.util.List;

public class Doctor {
	
	private List<List<String>> schedule = new ArrayList<List<String>>();

	public List<List<String>> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<List<String>> schedule) {
		this.schedule = schedule;
	}
	
	public void addDay(List<String> s) {
		schedule.add(s);
	}
	
	

}
