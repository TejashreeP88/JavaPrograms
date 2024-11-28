
public class SecondLargestNumber {

	public static void main(String[] args) {
		
		findSecondLargestNo();
		

	}
	
	public static void findSecondLargestNo()
	{
		int arr[]= {1,3,2,7,5};
		
		int largestNumber=Integer.MIN_VALUE;
		int secondLargestNumber=Integer.MIN_VALUE;
		
		System.out.println("MIN_VALUE"+largestNumber);
		System.out.println("MIN_VALUE"+secondLargestNumber);
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > largestNumber)
			{
				secondLargestNumber=largestNumber;
				largestNumber=arr[i];
				
				//System.out.println(secondLargestNumber);
				//System.out.println(largestNumber);
				
			}
		else if(arr[i] > secondLargestNumber && arr[i]!=largestNumber )
			{
				secondLargestNumber=arr[i];
			}
			
			
		}
		System.out.println("First Largest Number is "+ largestNumber);
		System.out.println("Second Largest Number is "+ secondLargestNumber);
	}
	
	

}
