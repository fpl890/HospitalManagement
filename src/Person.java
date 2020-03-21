import java.io.*;


public class Person {


	public static void writeInfo(String name, String password) throws IOException{
		BufferedWriter writer = new BufferedWriter(new FileWriter("record.txt", true));
		writer.write(name + "\n");
		writer.append(password + "\n");
		writer.close();

	}



	public static String fetchName() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("record.txt"));
		String name = reader.readLine();
		reader.close();
		return name;
	}


	public static String fetchPassword(String name) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("record.txt"));
		String username = reader.readLine();

		while (username != null) {
			if (username.equals(name)) {
				reader.close();
				return reader.readLine();
				
			}
			reader.readLine();
			username = reader.readLine();
		}
		reader.close();
		return " ";
	}


	public static boolean validUser(String name, String password) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("record.txt"));

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			writeInfo("Firoz", "password");
			writeInfo("Asad", "password");
			writeInfo("Gavin", "password");
			writeInfo("Quanzhi", "password");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {

			System.out.println(fetchName());
			System.out.println(fetchPassword("Firoz"));
			System.out.println(fetchPassword("Gavin"));
			System.out.println(validUser("Sohaib","fpl786"));


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}