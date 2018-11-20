package interface_demo;



interface Printable{
	void print();
}
interface Showable extends Printable{
	void show();
}
//class SumAdd implements Printable,Showable{
	class Interf implements Showable {
	public void print() {System.out.println("Hello");}
	public void show() {System.out.println("Welcome");}
	
	public static void main(String[] args) {
		Interf obj = new Interf();
		obj.print();
		obj.show();
	}
	
}

	
	


