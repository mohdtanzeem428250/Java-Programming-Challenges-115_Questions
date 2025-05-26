package Challenge_114_Employee_Sorting;

import java.util.Comparator;
import java.util.List;

public class TestingSorting 
{
	public static void main(String[] args)
	{
		List<Employee> employee=List.of(new Employee("Tanzeem",55000),
										new Employee("Sohail",12000),
										new Employee("Rahul",21000),
										new Employee("Nitin",32000));
		employee.stream()
				.sorted((emp1,emp2)->emp1.getSalary()-emp2.getSalary())
				.forEach(System.out::println);
	}
}
