package Programs;

public class SecondLargestNumber {

	public static void main(String[] args) {
	
			 int arr[]= {0,1,34,93,105,2,55,75,129};
			 
			 int max=Integer.MIN_VALUE;
			 int secondLargest=0;
			 
			 for(int i:arr)
			 {
				 if(i>max)
				 {
					 secondLargest=max;
					 max=i;
				 }
				 
				 else if(i>secondLargest && i !=max)
				 {
					 secondLargest=i;
				 }
			 }
			 
			
			 System.out.print("Second Largest Number is "+ secondLargest);

		}

	

	}


