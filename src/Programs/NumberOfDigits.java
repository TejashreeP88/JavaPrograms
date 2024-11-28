package Programs;

public class NumberOfDigits {

	public static void main(String[] args) {
		int number=28732872;
		int digit=0;
		int counter=0;
		
		while(number!=0)
		{
			digit=number%10;
			
			number=number/10;
			counter++;
			
		}
		
		System.out.println(counter);

	}

}
