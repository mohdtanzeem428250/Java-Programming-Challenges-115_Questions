package Challenge_108_String_Filter;

import java.util.List;

public class StringFilterAndConcatinate 
{
	public static void main(String[] args)
	{
		List<String> names=List.of("Mohd Tanzeem","Bad","Is Teaching C","Ghatiya","Ganda","Bekaar","On Coding Seekha Aur Seekhao","Best Youtube Channel");
		String item=names.stream()
		     .filter(paragraph->paragraph.length()>10)
		     .reduce("",(a,b)->a+" "+b);
		System.out.print(item);
	}
}
