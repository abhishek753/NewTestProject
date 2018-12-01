package static_demo;

public class Static_overload {
	
	public static void Food() {
		
		System.out.println("Test Food() called: ");
	}

	public static void Food(int a) {
		
		System.out.println("Test Food(int) called: ");
	}
	
	public static void main(String[] args) {
		
		Static_overload.Food();
		Static_overload.Food(10);
	}
}
