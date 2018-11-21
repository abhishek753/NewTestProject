package staticandnonstatic;

public class Company {

	public static void main(String[] args) {
		Department d = new Department();
		Department.comp_name="Microsoft";
		Department.national_holiday();
		
		d.dept_id=11;
		d.dept_name="Airtel";
		d.no_of_emp=159;
		
		d.add_dept();
		d.change_dept();
		
		System.out.println("Department_id: "+d.dept_id);
		System.out.println("Department_id: "+d.dept_name);
		System.out.println("Department_id: "+d.no_of_emp);

	}
}
