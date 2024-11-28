
public class PerfectNumber {

	public static void main(String[] args) {
		
		int number=15;
		int devisor=0;
		
		for(int i=1; i<number; i++)
		{
			if(number % i==0)
			{
				devisor=devisor+i;
			}
		}
		
		if (number==devisor)
		{
			System.out.print("Number is Perfect Number");
		}
		else
		{
			System.out.print("Number is not Perfect Number");
		}

	}

}
