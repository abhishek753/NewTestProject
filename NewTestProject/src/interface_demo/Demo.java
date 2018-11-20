package interface_demo;

public class Demo {
	public static void main(String[] args) {
		Calculator calcl = new Calculator();
		int i = calcl.getSum(10, 20);
		System.out.println("This is the Sum of Number: " +i);
		int j = calcl.getSub(2, 5);
		System.out.println("This is the Sub of Number: " +j);
		int k = calcl.getMul(5, 8);
		System.out.println("This is the Mul of Number: " +k);
		int l = calcl.getDiv(40, 5);
		System.out.println("This is the Div of Number: " +l);
		
		int num = (int)(Math.random()*100);
		System.out.println(num);
	}

}
