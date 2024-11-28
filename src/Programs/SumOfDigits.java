package Programs;

public class SumOfDigits {

	public static void main(String[] args) {
		int num=8347;
		int r=0;
		int result=0;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			result=result+r;
		}

		
		System.out.print("Sum of the digits is " + result);
	}

}
