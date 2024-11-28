package Programs;

//Logic
//take a number into a variable
//declare last digit and reverse as a variable
//// use while loop till n!=0
//to get the last digit n%10
//to get the remaining digits n/10
//reverseNumber=reverseNumber*10+lastdigit;


public class ReverseNumber {

	public static void main(String[] args) {
		int number=473;
		int lastdigit;
		int reverseNumber=0;
		
		while(number!=0)
		{
			lastdigit=number%10;
			number=number/10;
			reverseNumber=reverseNumber*10+lastdigit;
			
		}
		System.out.println("Reverse Number is "+reverseNumber);
	}

}
