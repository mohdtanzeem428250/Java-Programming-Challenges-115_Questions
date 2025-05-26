package Challenge_115_String_To_Integer;

import java.util.List;

public class FinalTest 
{
	public static void main(String[] args)
	{
		List<String> numbers=List.of("1","2","3","4","5");
		numbers.stream()
			   .map(str->Integer.parseInt(str))
			   .map(number1->Math.pow(number1,2))
			   .reduce((a,b)->a+b)
			   .ifPresent(System.out::println);
	}
}
