package wirtingandreading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.processing.Filer;

public class ReadingFiles {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\filewriting\\myTextFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		
		//Read text file
		
		String line = null;
		while((line = reader.readLine())!= null) {
			
			System.out.println(line);
		}
		
		/*System.out.println(reader.readLine());
		System.out.println(reader.readLine());
		System.out.println(reader.readLine());
		System.out.println(reader.readLine());
		System.out.println(reader.readLine()); */
		reader.close();

	}

}
