package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_57_Month_Find_Using_Switch 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Month Mapping");
		System.out.print("Please, Enter Your Month Number : ");
		int monthNumber=scanner.nextInt();
		Challenge_57_Month_Find_Using_Switch object=new Challenge_57_Month_Find_Using_Switch();
		object.oldSwitchCase(monthNumber);
		String monthName=object.newSwitchCase(monthNumber);
		System.out.println("Your Month Name Is : "+monthName);
	}
	public void oldSwitchCase(int monthNumber)
	{
		System.out.println("Old Switch Case...");
		switch(monthNumber)
		{
			case 1: 
					System.out.println("January");
					break;
			case 2:
					System.out.println("Febuary");
					break;
			case 3:
					System.out.println("March");
					break;
			case 4: 
					System.out.println("April");
					break;
			case 5:
					System.out.println("May");	
					break;
			case 6:
					System.out.println("June");
					break;
			case 7: 
					System.out.println("July");
					break;
			case 8:
					System.out.println("August");
					break;
			case 9:
					System.out.println("September");
					break;
			case 10: 
					System.out.println("October");
					break;
			case 11:
					System.out.println("November");	
					break;
			case 12:
					System.out.println("December");
					break;
			default:
					System.out.println("Invalid Month Number, Please Try Again...");
		}
	}
	public String newSwitchCase(int monthNumber)
	{
		System.out.println("New Switch Case...");
		return switch(monthNumber)
		{
			case 1-> "January";
			case 2-> "Febuary";
			case 3-> "March";
			case 4-> "April";
			case 5-> "May";
			case 6-> "June";
			case 7-> "July";
			case 8-> "August";
			case 9-> "September";
			case 10-> "October";
			case 11-> "November";
			case 12-> "December";
			default -> "Invalid Month Number, Please Try Again...";
		};
	}
}
