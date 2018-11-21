package staticandnonstatic;

public class Department {
	
	//non static global variables
	
	public String dept_name;
	public int dept_id;
	public int no_of_emp;
	//Global Static variable
	public static String comp_name;
	
	//no  static functions
	
	public void add_dept() {
		
		System.out.println("Department added");
	}
	
	public void change_dept() {
		System.out.println("Department changed");
	}

	//Static method
	public static void national_holiday() {
		
		System.out.println("National Holiday granted");
	}
}
