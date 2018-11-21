package arrays;

public class LearningFunctions {
	
	public static int a=30;
	public static int b=20;
	
	public static void print() {
		System.out.println("Learning Functions");
	}
	
	public static void addNumbers() {
		int c=a+b;
		System.out.println("Additions of two numbers are: "+c);
	}
	
	//It is called method/function overloading.When we same function with different parameter.
	public static void addNumbers(int r,int s) {
		int add=r+s;
		System.out.println("Additions of two numbers are: "+add);
	}
	
	//To print the table by using method/function calling in main method.
	public static void table(int t) {
		for(int i=1;i<=10;i++) {
			System.out.println(t*i);
		}
	}
	
	public static void main(String[] args) {
		
		print();
		addNumbers();
		addNumbers(40, 30);
		table(7);
	}

}
