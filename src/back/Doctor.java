package back;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 
 *
 */
public class Doctor {
	
	private List<List<String>> schedule = new ArrayList<List<String>>();

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
	
	

}
