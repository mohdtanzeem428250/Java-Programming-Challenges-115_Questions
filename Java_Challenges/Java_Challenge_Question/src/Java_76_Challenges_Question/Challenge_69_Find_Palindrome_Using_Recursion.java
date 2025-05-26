package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_69_Find_Palindrome_Using_Recursion 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Palindrome Checker");
		System.out.println("Please, Enter The String To be Checked : ");
		String str=scanner.next();
		System.out.println("Your String Is : "+(isPalindrome(str)?"Palindrome":"Not Palindrome"));
	}
	public static boolean isPalindrome(String str)
	{
		if(str.length()<=1)
		{
			return true;
		}
		int lastPosition=str.length()-1;
		if(str.charAt(0)!=str.charAt(lastPosition))
		{
			return false;
		}
		String newStr=str.substring(1,lastPosition);
		return isPalindrome(newStr);
	}
}
