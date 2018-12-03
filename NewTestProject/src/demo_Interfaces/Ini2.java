package demo_Interfaces;

public interface Ini2 {
	final int a = 20;
	default void display() {
		System.out.println("Helloo");
	}
}

//A class that implements interface.
class hClass implements Ini2{
	
	//Driver class
	public static void main(String[] args) {
		
		hClass t = new hClass();
		t.display();
	}

}
