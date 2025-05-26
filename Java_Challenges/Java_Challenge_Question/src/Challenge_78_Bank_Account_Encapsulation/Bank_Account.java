package Challenge_78_Bank_Account_Encapsulation;

public class Bank_Account 
{
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	public Bank_Account(String accountNumber,String accountHolderName)
	{
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
	}
	public void depositMoney(double money)
	{
		if(money<0)
		{
			System.out.println("Invalid Deposit");
		}
		else
		{
			balance+=money;			
		}
	}
	public double withdrawMoney(double money)
	{
		if(balance<=0)
		{
			System.out.println("Invalid Withdraw");
		}
		else if(balance>=money)
		{
			balance-=money;			
		}
//		else if(money>balance)
//		{
//			System.out.println("Insufficient Fund");
//		}
		else
		{
			money=balance;
			balance=0;
		}
		return money;
	}
}
