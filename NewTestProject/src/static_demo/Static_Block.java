package static_demo;

public class Static_Block {

	//static variable
	static int a=20;
	static int b;
	
	//static block
	static {
		
		System.out.println("Static block initialized");
		b=a*4;
	}
	public static void main(String[] args) {
		
		System.out.println("From Main.");
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
	}
}
