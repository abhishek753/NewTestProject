package interface_demo;

public class MethodCalling {

	public static void main(String[] args) {
		MethodCalling m = new MethodCalling();
		m.go();
		m.go1();
		m.go2();
		
		go3();
	}
	public static void go3() {
		System.out.println("Inside Go3 Method");
	}

	public void go() {
		System.out.println("Inside Go Method");
	}
	public void go1() {
		System.out.println("Inside Go1 Method");
	}
	public void go2() {
		System.out.println("Inside Go2 Method");
	}
}
