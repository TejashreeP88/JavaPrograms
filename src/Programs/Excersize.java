package Programs;

public class Excersize {

	public static void main(String[] args) {
		
			int[] num={1,2,3,4,5};
			 
			int length=num.length;
			
			int counter=0;

			 System.out.println("The first element of the array is " + num[0]);
			 System.out.println("The last element of the array is " + num[length-1]);
			 
			 
			 for(int i=length-1;i>=0;i--)
			 {
				 System.out.println(num[i]);
				 counter++;
			 }
			 System.out.println("Total Number of elements in an Array "+ counter);
		
	}

}
