package demo_Interfaces;

public interface Ini1 {
	//public,static and final
		final int a = 10;
		
		//public and abstracts
		void display();

	}
	//A class that implements interface.
	class testclass implements Ini1{
		
		//Implementing the capabilities of interface.
		public void display() {
			
			System.out.println("Hello");
		}
		
		//Driver code
		public static void main(String[] args) {
			
			testclass t = new testclass();
			t.display();
			System.out.println(a);
		}

}
