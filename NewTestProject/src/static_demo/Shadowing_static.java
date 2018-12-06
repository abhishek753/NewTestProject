package static_demo;

public class Shadowing_static {
	
	static void fun() {
		System.out.println("A.Fun()");
	}

}

class B extends Shadowing_static{
	static void fun() {
		System.out.println("B.Fun()");
	}
  

public static void main(String[] args) {
	
Shadowing_static t = new B();
t.fun();

}
}