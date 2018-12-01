package static_demo;

public class Static_Variables {
	
	//static variable
	static int a=m1();
	static char c = d();
	
	//static block
	
	static {
		
		System.out.println("Inside static block");
	}
	
	//static method
	
	static int m1() {
		
		System.out.println("from m1.");
		return 20;
	}
	
	static char d() {
		
		System.out.println("From d");
		return c ;
	}
	
	//static method(main !!)
	
	public static void main(String[] args) {
		
		System.out.println("value of a: "+a);
		System.out.println("From Main.");
		System.out.println("c:"+c);
	}
}
