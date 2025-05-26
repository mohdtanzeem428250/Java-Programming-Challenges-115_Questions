package Challenge_107_String_Stream;

import java.util.List;

public class StreamTest 
{
	public static void main(String[] args)
	{
		List<String> names=List.of("Tanzeem","Sohail","Rahul","Kapil","Punit");
		names.stream()
			 .filter(filterNames->filterNames.length()>5)
			 .forEach(items->System.out.println(items));
	}
}
