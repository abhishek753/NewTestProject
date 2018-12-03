package abstraction;

abstract class AbstractClass {
	abstract void fun();
}

class Derived extends AbstractClass
{
	void fun() {
		System.out.println("Derived Fun() called.");
	}
	
}
class  Main{
	
	public static void main(String[] args) {
		
		//Uncommenting the following line will cause compile error as the 
		//line tries to create an instance of abstract class
		// AbstractClass t = new AbstractClass();
		
		//We can have references of AbstractClass type
		AbstractClass b = new Derived();
		b.fun();
	}
}
