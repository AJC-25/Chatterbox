import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("file.txt");
			writer.write("This is my String.");
			writer.close();
			System.out.println("Success!");
			
		} catch (IOException e) {
			System.out.println("Error!");
			e.printStackTrace();
		}
	}		
}
