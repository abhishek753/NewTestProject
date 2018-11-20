package interface_demo;

public class MEthod_Overloading {
	static int add(int a,int b) {return a+b;}
	static double add(double a,double b,double c) {return a+b+c;}
	static int add(int a,int b,int c) {return a+b+c;}
}

class TestOverloading{
	public static void main(String[] args) {
		System.out.println(MEthod_Overloading.add(12, 13));
		System.out.println(MEthod_Overloading.add(10.6, 15.8, 20.9));
		System.out.println(MEthod_Overloading.add(50,50,50));
	}
}
