package interface_demo;

interface A{
	void a();
	void b();
	void c();
	void d();
}

abstract class Abstract_Interface implements A{
	public void c() {System.out.println("I am C");}

}

class M extends Abstract_Interface{
	public void a() {System.out.println("I ma A");}
	public void b() {System.out.println("I am B");}
	public void d() {System.out.println("I am D");}	
	
}

 class Test{
	public static void main(String[] args) {
		A a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
		
	}
}