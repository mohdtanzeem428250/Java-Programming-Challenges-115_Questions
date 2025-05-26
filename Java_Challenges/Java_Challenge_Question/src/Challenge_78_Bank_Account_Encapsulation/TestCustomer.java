package Challenge_78_Bank_Account_Encapsulation;

public class TestCustomer 
{
	public static void main(String[] args)
	{
		Bank_Account tanzeem=new Bank_Account("1230546325","Mohd Tanzeem");
		tanzeem.depositMoney(100);
		System.out.println(tanzeem.withdrawMoney(200));
		tanzeem.depositMoney(-40);
		tanzeem.withdrawMoney(0);
	}
}
