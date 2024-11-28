package Programs;

//Logic
// use Arrays.sort() to sort the given array
// use 2 for loops. i=0 and j=1
// compare the value of i[] and j[]
// to sort in ascending order i[] > j[]
//to sort in descending order i[] < j[]
// using swaping logic by using 3rd variable


import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		
		int[] arr= {1,4,2,6,8,20,5};
		
		Arrays.sort(arr);
		
		
		for(int a:arr)
		{
			//System.out.println(a);
		}
		
		
		int[] arr1= {1,4,2,6,8,20,5};
		
		int temp;
		

		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]>arr1[j])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
	
	}
	

}
	
