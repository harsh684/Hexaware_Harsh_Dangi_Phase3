package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo {

	public static void main(String[] args) {
		
		String str = " Ha r sh  ";
		
		System.out.println(str.isBlank());
		
		System.out.println(str.length());
		
		//removes leading and trailing whitespaces
		System.out.println(str.strip());
		
		//only removes leading whitespaces
		System.out.println(str.stripLeading());
		
		System.out.println();
		
		Files reader = null;
		
		try {
			
			Path path = Paths.get("resources/Input.txt");
			
			String data = Files.readString(path);
			
			
			System.out.println(data);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
