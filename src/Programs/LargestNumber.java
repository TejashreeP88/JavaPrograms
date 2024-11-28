package Programs;

//Logic
// declare one variable with either 0 or Integer.MIN_VALUE
// for loop to traverse through array
// comapre each element with the variable, if element value is greater than the variable then assign element value to a variable.

public class LargestNumber {

	public static void main(String[] args) {
		 int arr[]= {0,1,34,93,105,2,55,75,129};
		 
		 int max=Integer.MIN_VALUE;
		 
		 for(int i:arr)
		 {
			 if(i>max)
			 {
				 max=i;
			 }
		 }
		 
		 System.out.print("Largest Number is "+ max);

	}

}
