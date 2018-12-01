package static_demo;

//SuperClass
public class Override_StaticMethod {
	
	//Static method on Override_StaticMethod class which will be hidden in subclass
	public static void display() {
		
		System.out.println("Static or Class method from Override_StaticMethod(Base)");
	}
	
	//Non-Static method which will be overridden in Derived class
	public void print() {
		
		System.out.println("Non-Static or Instance method from Override_StaticMethod(Base)");
	}
}

//Subclass
class Derived extends Override_StaticMethod{
	
	//This method hide display() in Override_StaticMethod(Base Class)
	public static void display() {
		System.out.println("Static or Class method from Derived");
	}
	
	//This method overrides print() in Override_StaticMethod(Base Class)
	public void print() {
		
		System.out.println("Non-Static or Instance method from Derived");
	}
}

//Deriver class
  class Demo {
	
	public static void main(String[] args) {
		
		Override_StaticMethod obj1 = new Derived();
		
		//As per overriding rules this should call to class Derive's static
		//overridden method. Since static method can not be overridden, it
		//call Override_StaticMethod(Base class) display()
		obj1.display();
		
		//Here Overriding works and Derive's print() is called
		obj1.print();
	}

}