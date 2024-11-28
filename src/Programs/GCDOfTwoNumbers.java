package Programs;

//Logic
// take two numbers in 2 variables
// use for loop till the smallest number
// if both the numbers % i == 0 then gcd=i
public class GCDOfTwoNumbers {

	public static void main(String[] args) {
		int a=12;
		int b=8;
		int gcd=1;
		
		for(int i=1;i<=a && i<=b; i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		
		System.out.print(gcd);
				
				

	}

}
