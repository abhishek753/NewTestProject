package static_demo;


//Java program to demonstrate that a static member 
//can be accessed before instantiating a class

public class Static_member {
	
	//static method
	static void m1() {
		System.out.println("From m1 Method: ");
	}
	
	static void test() {
		
		System.out.println("Check Test");
	}
	public static void main(String[] args) {
		//Calling m1 without creating
		//any object of class Static_memmber
		
		m1();
		test();
	}

}
