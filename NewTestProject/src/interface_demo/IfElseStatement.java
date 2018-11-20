package interface_demo;

public class IfElseStatement {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*20);
		System.out.println(num);
		
		if(num>10) {
			System.out.println(num+" Is Greater than 10.");
		}else if(num<10 && num>5) {
			System.out.println(num+" is between 10 and 5.");
		}
		else {
			System.out.println(num+" Is Less than 10.");

		}

	}

}
