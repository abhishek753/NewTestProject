package exceptionHandling;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TestExecp {

	public static void main(String[] args) {
		
		try {
		System.out.println("Beginning");
		int divide = 10/0;
		System.out.println(divide);
		}
		catch(Exception e) {
		//catch(Throwable t) {
			
			System.out.println("Error occurred");
			System.out.println(e.getMessage());
		}
		System.out.println("Ending");
	}

}
