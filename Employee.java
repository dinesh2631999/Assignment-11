package inheritance;

public class Employee {
	
	protected int e_id;
	protected String e_name;
	public float e_salary;
	
	
	public Employee(int e_id, String e_name, float e_salary) {
		
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_salary = e_salary;
	}

	public String toString()
	{
		return "[ empId = "+e_id+" empName = "+e_name+" empSalary = "+e_salary+" ]";
	}
	

}
