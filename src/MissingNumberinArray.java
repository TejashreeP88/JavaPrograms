
public class MissingNumberinArray {

	public static void main(String[] args) {
		
		findMissingNumber();

	}
	
	public static void findMissingNumber()
	{
		
		int arr[] = {1,2,4,5,6};
		
		int sum1=0;
		int sum2=0;
		int number=0;
		
		int n=6;
		
		sum1=n*(n+1)/2;
		
		System.out.println("Sum of all the numbers " + sum1);
		
		
		System.out.println(arr.length-1);
		for (int i=0; i<=arr.length-1;i++)
		{
			sum2=sum2+arr[i];
			
		}
		
		System.out.println("Sum of array " + sum2);
		
		
		number=sum1-sum2;
		
		System.out.println("Missing Number from the array is " + number);
		
	}

}
