
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fun1();
		int a=10;
		int b=47;
		int c=2;
		
		if(a>b && a>c)
		{
		System.out.println(a + "is the largest Number");	
		}
		else if(b>a && b>c)
		{
		System.out.println(b + "is the largest Number");	
		}
		else
		{
			System.out.println(c + "is the largest Number");
		}
	}
	
	public static void fun1()
	{
		int a=10;
		int b=47;
		int c=2;
		int temp;
		int largest;
		
		temp=a>b?a:b;
		largest=c>temp?c:temp;
		
		System.out.println("largest Number is "+largest);
		
	}

}
