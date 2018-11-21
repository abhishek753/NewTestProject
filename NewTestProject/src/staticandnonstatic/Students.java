package staticandnonstatic;

public class Students {

	String name;
	int roll;
	int age;
	
	public Students() {
		
		System.out.println("Adding student records");
	}
	
	public Students(String name, int age, int roll) {
		
		this.name = name;//this.name refers to the global variable name
		this.age = age;
		this.roll = roll;
	}
	
	public static void main(String[] args) {
		
		Students s1 = new Students();
		s1.name = "Tom";
		s1.roll = 1;
		s1.age = 21;
		
		Students s2 = new Students();
		s2.name = "John";
		s2.roll = 2;
		s2.age = 25;
		
		Students s3 = new Students("Ravi",23,3);
		System.out.println("Argumented constructor name: "+s3.name);
		System.out.println("Argumented constructor name: "+s3.age);
		System.out.println("Argumented constructor name: "+s3.roll);
		

	}

}
