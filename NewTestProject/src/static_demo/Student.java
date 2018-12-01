package static_demo;

public class Student {

	String name;
	int rollNo;
	
	//static variable
	static String clgName;
	
	//static counter to set unique roll no
	static int counter = 0;
	
	public Student(String name) {
		this.name = name;
		this.rollNo = setRollNo();
	}
	
	//getting unique rollNo
	//through static variable(counter)
	static int setRollNo() {
		counter++;
		return counter;
	}
	
	//static method
	static void setClg(String name) {
		clgName = name;
	}
	
	//instance method
	void getStudentInfo() {
		System.out.println("name :"+this.name);
		System.out.println("rollNo :"+this.rollNo);
		
		//accessing static variable
		System.out.println("clgName :"+clgName);
	}
}

//Driver class
 class StaticDemo{
	public static void main(String[] args) {
		//calling static method
		//without instantiating Student class
		Student.setClg("XYZ");
		
		Student s1 = new Student("John");
		Student s2 = new Student("Alan");
		Student s3 = new Student("Elan");
		
		s1.getStudentInfo();
		s2.getStudentInfo();
		s3.getStudentInfo();
	}
}