
public class SwapNumbers {

	public static void main(String[] args) {
		
		//swapUsingTempVariable();
		//parmeterisedSwapUsingTempVariable(10,20);
		//swapNumbersUsingMaths();
		swapNumbersUsingBinary();
	}
	
	
	public static void swapUsingTempVariable()
	{
		int a=10;
		int b=20;
		int temp;
		
		System.out.println("Original Value of a : "+ a);
		System.out.println("Original Value of b : "+ b);
		
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Swapped Value of a : "+ a);
		System.out.println("Swapped Value of b : "+ b);
		
	}
	
	
	public static void parmeterisedSwapUsingTempVariable(int a,int b)
	{
		
		int temp;
		
		System.out.println("Original Value of a : "+ a);
		System.out.println("Original Value of b : "+ b);
		
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Swapped Value of a : "+ a);
		System.out.println("Swapped Value of b : "+ b);
		
	}
	
	public static void swapNumbersUsingMaths()
	{
		int a=37;
		int b=98;
		
		System.out.println("Original Value of a : "+ a);
		System.out.println("Original Value of b : "+ b);
		
		a=a+b; // a=30
		b=a-b; // b=10
		a=a-b; // a=20
		
		
		System.out.println("Swapped Value of a : "+ a);
		System.out.println("Swapped Value of b : "+ b);
				
	}
	
	public static void swapNumbersUsingBinary()
	{
		
		int a=37;
		int b=98;
		
		System.out.println("Original Value of a : "+ a);
		System.out.println("Original Value of b : "+ b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("Swapped Value of a : "+ a);
		System.out.println("Swapped Value of b : "+ b);
		
		
	}
	
	

}
