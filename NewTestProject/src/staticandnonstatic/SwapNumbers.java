package staticandnonstatic;

public class SwapNumbers {
	int s;
	int t;
	public static void swap(int a, int b) {
		//pass by value
		int temp=a;
		a=b;
		b=temp;
	}
	public static void swap(SwapNumbers p) {
		//pass by reference
		int temp=p.s;
		p.s=p.t;
		p.t=temp;
		
	}
	
	public static void main(String[] args) {
		SwapNumbers sp = new SwapNumbers();
		sp.s=20;
		sp.t=30;
		swap(sp.s,sp.t);//pass by value
		System.out.println("Pass by value s is: "+sp.s);
		System.out.println("Pass by value t is: "+sp.t);
		
		swap(sp);//pass by reference
		System.out.println("Pass by reference s is: "+sp.s);
		System.out.println("Pass by reference s is: "+sp.t);

			
		

	}

}
