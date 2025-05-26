package Java_Another_Question;

public class String1 
{
	public static void main(String[] args)
	{
		String str1="Hello";
		String str2="World";
		int size1=str1.length();
		int size2=str2.length();
		int i=0;
		int j=0;
		StringBuilder str3=new StringBuilder();
		while(i<size1&&j<size2)
		{
			str3.append(str1.charAt(i));
			str3.append(str2.charAt(j));
			i++;
			j++;
		}
		System.out.println(str3);
	}
}
