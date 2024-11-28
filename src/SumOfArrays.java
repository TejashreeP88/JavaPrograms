
public class SumOfArrays {

	public static void main(String[] args) {
		
		arraySum();
		

	}
	
	public static void arraySum()
	{
		int arr[]= {2,54,23,65,9,35};
		int sum=0;
		
		for (int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("Sum of the array is "+ sum);
		
	}

}
