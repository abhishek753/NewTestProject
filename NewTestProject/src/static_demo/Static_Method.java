package static_demo;



public class Static_Method {
	
	//static variable
	static int a=10;

	//instance variable
	int b=20;
	
	//static method
	static void m1() {
		
		a=20;
		System.out.println("From m1");
		
		//Cannot make a static reference to the non-static field b
		//b=30; //Compilation error
		
		//Cannot make a static reference to the 
		//non-static method m2()from the type Static_Method
		//m2(); //Compilation error
		
		//Cannot use super in a static context
		//System.out.println(super.a); //Compiler error
	}
	
	//instance method
	void m2() {
		System.out.println("From m2");
	
	}
	public static void main(String[] args) {
		System.out.println("Value of a: "+a);
		m1();
		
	}

}
