package wirtingandreading;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WritingFiles {

	public static void main(String[] args) throws IOException {
		
		//Stream Connectivity
		File f = new File("D:\\filewriting\\myTextFile.html");
		FileWriter fw = new FileWriter(f,false);
		BufferedWriter writer = new BufferedWriter(fw);
		
		//Writing inside the file
		
		writer.write("<html> <body> <title>Way2Automation</title><h1>Learning Java from Way2Automation.com</h1></body> </html>");
		/*for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				
				int num = (int)(Math.random()*100);
				writer.write(num+",");
			}
			writer.newLine();
		}*/
		
//		writer.newLine();
//		writer.write("second Line");
//		writer.newLine();
//		writer.write("Hello India");
//		writer.newLine();
//		writer.write("Way2Automation");

		//Closing Stream
		writer.close();
		
		System.out.println("File Created !!");
	}

}
