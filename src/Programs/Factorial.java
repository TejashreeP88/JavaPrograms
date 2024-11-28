package Programs;

import java.math.BigInteger;

//Logic
//declare a variable in which we will store a number for which we need find the factorial
//declare one variable and initialize with 1
//For loop to go till the number for which we need find the factorial
//multiple variable and initialize with 1 * i

public class Factorial {

	public static void main(String[] args) {
		int n=3223;
		int result=1;
		
		for(int i=1;i<=n;i++)
		{
			result=result*i;
		}
		
		System.out.print("Factorial of the number " + n + " is " + result);
	
	
	// To solve the limit of integer range
	
	BigInteger result1=BigInteger.ONE;
	
	for(int i=1;i<=n;i++)
	{
		result1=result1.multiply(BigInteger.valueOf(i));
	}
	
	System.out.print("Factorial of the number " + n + " is " + result1);
}

}
