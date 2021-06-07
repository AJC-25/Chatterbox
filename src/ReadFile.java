import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

	File file = new File("file.txt");
	
	try (FileInputStream in = new FileInputStream(file)){
		int input;
		while ((input = in.read()) != -1) {
			System.out.print(normalizeToLowerCase((char) input));			
		}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static char normalizeToLowerCase (char a){
        if (65 <= a && a<=90) {
            a = (char)( (a + 32) ); 
        }
        return a;
	}	
}

