package ExcelReadWrite.writing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilereadingWriting {

	public static void main(String[] args) throws IOException {
		
		
		//Create a File
		File f = new File("D:\\filewriting\\testfile.txt");
		f.createNewFile();
		
		//Write inside a File
		FileWriter fw = new FileWriter("D:\\filewriting\\testfile.txt");
		BufferedWriter filewrite = new BufferedWriter(fw);
		
		filewrite.write("Please write inside this file");
		filewrite.newLine();
		filewrite.write("Hello India");
		
		filewrite.flush();

		//Read from a File
		
		FileReader fr = new FileReader("D:\\filewriting\\testfile.txt");
		BufferedReader filereader = new BufferedReader(fr);
		String i = "";
		
//		System.out.println(filereader.readLine());
//		System.out.println(filereader.readLine());
		
		while((i=filereader.readLine())!=null) {
			
			System.out.println(i);
		}
		
		
	}

}
