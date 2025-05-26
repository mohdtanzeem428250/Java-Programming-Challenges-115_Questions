package Challenge_79_Employee_Encapsulation;

public class Employee 
{
	private String name;
	private int age;
	private double salary;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getAge()
	{
		return name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public String getSalary()
	{
		return name;
	}
	public String displayEmployeeDetails()
	{
		return "Employees=[Name : "+name+" Age : "+age+" Salary : "+salary+"]";
	}
}
