import java.io.*;


public class FileRW {

	
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
	
	
	public static String fetchPassword() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("record.txt"));
		reader.readLine();
		String password = reader.readLine();
		reader.close();
		return password;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			writeInfo("Firoz", "compsci4520");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(fetchName());
			System.out.println(fetchPassword());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
