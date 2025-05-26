package Java_76_Challenges_Question;

public class Challenge_46_Array_Is_Palindrome 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome To Check Palindrome Array");
		int[] myArray=Challenge_40_Array_Utility.inputArray();
		boolean isPalin=isPalindrome(myArray);
		if(isPalin)
		{
			System.out.println("Your Array Is Palindrome");
		}
		else
		{
			System.out.println("Your Array Is Not Palindrome");
		}
	}
	public static boolean isPalindrome(int[] myArray)
	{
		int i=0;
		while(i<myArray.length/2)
		{
			if(myArray[i]!=myArray[myArray.length-1-i])
			{
				return false;
			}
			i++;
		}
		return true;
	}
}
