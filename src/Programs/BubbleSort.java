package Programs;

public class BubbleSort {

	public static void main(String[] args) {
		
		sortAnArray();
		
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		
		int len=arr.length;
		
		for(int i=0;i<len-1;i++)
		{
			for (int j=0;j<len-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		
		for(int k=0;k<len;k++)
		{
			System.out.println(arr[k]);
		}
	}
	
	public static void sortAnArray()
	{
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	}

}
