import java.math.BigInteger;

public class FactorialOfaNumber {

	public static void main(String[] args) {
		
		//findFactorial();
		findFactorial1();

	}
	
	public static void findFactorial()
	{
		
		int number=50;
		BigInteger result = BigInteger.ONE ;
		
		for (int i=1;i<=number;i++)
		{
			result=result.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println("Factorial of a Number is "+ result);
	}
	
	// 5!=5*4*3*2*1
	//for loop starts from 1 till the given number
	//initialize result variable =1, result=result*i;
	
	public static void findFactorial1()
	{
		
		int number=5;
		int result=1;
		//BigInteger result = BigInteger.ONE ;
		
		for (int i=1;i<=number;i++)
		{
			result=result*i;
		}
		
		System.out.println("Factorial of a Number is "+ result);
	}

}
