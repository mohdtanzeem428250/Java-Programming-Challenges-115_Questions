package Java_76_Challenges_Question;

public class Challenge_73_Dice_Roll_Using_Math_Random 
{
	int diceRoll()
	{
		double random=Math.random()*6;
		return (int)Math.round(Math.ceil(random));
	}
	public static void main(String[] args)
	{
		Challenge_73_Dice_Roll_Using_Math_Random object=new Challenge_73_Dice_Roll_Using_Math_Random();
		for(int i=0;i<=10;i++)
		{
			System.out.println(object.diceRoll());
		}
	}
}
