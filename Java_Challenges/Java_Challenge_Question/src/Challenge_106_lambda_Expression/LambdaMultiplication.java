package Challenge_106_lambda_Expression;
import java.util.function.BinaryOperator;
public class LambdaMultiplication
{
	public static void main(String[] args)
	{
		BinaryOperator<Integer> multiple=(a,b)->a*b;
		int result=multiple.apply(4,5);
		System.out.println(result);
	}
}
