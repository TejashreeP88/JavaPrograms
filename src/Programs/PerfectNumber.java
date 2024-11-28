package Programs;

public class PerfectNumber {

	public static void main(String[] args) {
		int num=496;
		int x=0;
		
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				x=x+i;
				
			}
		}
		
		if(num==x)
			System.out.print("The number is a perfect number "+ num + "," + x);
		
		else
			System.out.print("The number is not a perfect number "+ num + "," + x);

	}

}
