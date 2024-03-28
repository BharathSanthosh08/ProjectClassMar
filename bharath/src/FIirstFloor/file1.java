package FIirstFloor;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class file1 {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\BHARATH V\\eclipse-workspace\\bharath\\src\\FIirstFloor\\SAMPLE\\sample.txt");
		
		boolean f1 = f.createNewFile(); 
			System.out.println(f1);
				
		FileWriter s = new FileWriter(f);
		
	 s.write("i am bharath");
	s.close();
	
	
FileReader v = new FileReader(f);
		char[] d = new char[30];
		v.read(d);
	for(char d1:d) {
			System.out.println(d1);
		}
		v.close();
		
	
		
		
			}
}


