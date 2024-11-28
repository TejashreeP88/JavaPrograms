package Programs;

//Logic
// use while loop till n>0
// to get the last digit n%10
// to get the remaining digits n/10
// convert the integer into string
// get the length of the string
// use math.pow for calculation
// convert the final sum into integer and compare with original integer


public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int a = 153;
		String intA = String.valueOf(a); // convert the integer into the String
		char[] arr=intA.toCharArray();
		
		int len=intA.length();
		//System.out.printlbn(len);
		double finalDigit = 0.0;
		for(int i=0;i<len;i++)
		{
			String digit = String.valueOf(arr[i]); // convert the character array into the String
			double digitToMultiple = Double.parseDouble(intA);
			finalDigit += Math.pow(digitToMultiple, Double.valueOf(len));
		}
		System.out.println(finalDigit);
			*/
		
		
		armstrongNumber();
	}
	

		
	public static void armstrongNumber()
	
	{
		int n=153;
		int temp=n;
		int r;
		double sum=0.0;
		String intA = String.valueOf(n);
		int len=intA.length();
		
		
		while(n!=0)
		{
		
		r=n%10;
		n=n/10;
		sum=sum+Math.pow(r, Double.valueOf(len));
		
		}
		
		System.out.println(sum);
		
		int w = (int) sum; // Double.valueOf(sum).intValue();
		
		if(temp==w)
		{
			System.out.println("Given number is Armstong");
		}
		else
		{
			System.out.println("Given number is not Armstong");
		}
	}


}
