package back;
import java.io.*;


/**
 * @author Firoz Lakhani
 * Cleaned by Firoz Lakhani
 */
public class Person {


	/**
	 * Function saves the username and password of the user to a file
	 * @param name
	 * @param password
	 * @throws IOException
	 */
	public static void writeInfo(String name, String password) throws IOException{
		BufferedWriter writer = new BufferedWriter(new FileWriter("./dat/record.txt", true));
		writer.write(name + "\n");
		writer.append(password + "\n");
		writer.close();

	}
	

	/**
	 * Function fetches the password if a particular user 
	 * @param name
	 * @return
	 * @throws IOException
	 */
	public static String fetchPassword(String name) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("./dat/record.txt"));
		String username = reader.readLine();

		while (username != null) {
			if (username.equals(name)) {
				String x = reader.readLine();
				reader.close();
				return x;
				
			}
			reader.readLine();
			username = reader.readLine();
		}
		reader.close();
		return " ";
	}


	/**
	 * Function checks if the user login attempt is valid
	 * @param name
	 * @param password
	 * @return
	 * @throws IOException
	 */
	public static boolean validUser(String name, String password) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("./dat/record.txt"));

		String username = reader.readLine();
		while (username != null) {

			if (username.equals(name)) {
				if (reader.readLine().equals(password)) {
					reader.close();
					return true;
				}else {
					reader.close();
					return false;
				}
			}
			reader.readLine();
			username = reader.readLine();
		}
		reader.close();
		return false;
	} 
	
	public static boolean isDoc(String name) {
		
		return false;
		
	}


}