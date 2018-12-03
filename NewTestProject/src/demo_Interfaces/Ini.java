package demo_Interfaces;

public interface Ini {
	
	final int a = 30;
	static void display() {
		System.out.println("Hello");
	}

}

class tClass implements Ini{
	
	public static void main(String[] args) {
		
		Ini.display();
	}
}