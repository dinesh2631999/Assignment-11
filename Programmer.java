package inheritance;

public class Programmer extends Employee {
	
	protected int bonus;
	protected float prog_salary;

	public Programmer(int e_id, String e_name, float e_salary,int bonus) {
		// TODO Auto-generated constructor stub
		super(e_id, e_name, e_salary);
		this.bonus=bonus;
		prog_salary=e_salary+bonus;
	}
	
	
		
	@Override
	public String toString()
	{
		return super.toString() +" [ programmer salary = "+prog_salary+" ]";
	}

}

//@override :-
      