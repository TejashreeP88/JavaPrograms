
public class ReverseAnInteger {

	public static void main(String[] args) {
		reverse();
	}
	
	public static void reverse()
	{
		int number=-3894;
		int reverse=0;
		int lastDigit;
		
		String value="60";
		
		while(number!=0)
		{
		lastDigit = number % 10; // u get remainder, and its a last digit
		
		// below condition is to check the number is in range of integer data type.
	/*	if(reverse>Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE/10 && lastDigit >7 ))
		{
			System.out.println(0);
			System.exit(0);
		}
		
		if(reverse<Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE/10 && lastDigit < -8))
		{
			System.out.println(0);
			System.exit(0);
		}
		
	*/
		
		reverse = reverse*10+lastDigit;
		number = number / 10; //  u get Quotient
		
		
		System.out.println("last digit is " + lastDigit);
		System.out.println("number is " + number);
		
		System.out.println("reverse number is " + reverse);
		}
		
		int test=Integer.parseInt(value, 10);
		
		System.out.println(value + "and" + test);
	}

}
