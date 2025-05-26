package Challenge_79_Employee_Encapsulation;

public class TestEmployee 
{
	public static void main(String[] args)
	{
		Employee emp=new Employee();
		emp.setName("Tanzeem");
		emp.setAge(21);
		emp.setSalary(25000.0);
		System.out.println(emp.displayEmployeeDetails());
	}
}
