
public class SortArray {

	public static void main(String[] args) {
		
		moveAllZerosAtTheEnd();
	}
	
	
	public static void moveAllZerosAtTheEnd()
	{
		int arr[]= {1,0,2,0,3,0};
		
		
		int putNonzeroValuesHere=0;
		int temp;
		
		for(int current=0;current<arr.length;current++){
			
			if(arr[current]!=0)
			{
				temp=arr[putNonzeroValuesHere];
				arr[putNonzeroValuesHere]=arr[current];
				arr[current]=temp;
				putNonzeroValuesHere ++;
			}
			
		}
		
		for(int no:arr)
		{
			System.out.print(no +"");
		}
	}

}
