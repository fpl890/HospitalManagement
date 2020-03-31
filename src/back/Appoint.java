package back;

public class Appoint {
	private String name;
	private int year;
	private int month;
	private int day;
	private int sHour;
	private int eHour;
	
	public Appoint(String name, int year, int month, int day, int sHour, int eHour){
		this.setName(name);
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
		this.setsHour(sHour);
		this.seteHour(eHour); 
			
				
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
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
}
