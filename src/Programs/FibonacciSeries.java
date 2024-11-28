package Programs;

//Logic
	//0,1,1,2,3,5,8,13,21,34
	//Take n as total numbers we want to print
	//declare 1st number as 0 and second number as 1
	//write a for loop, just to iterate till n numbers , or use while loop
	//print the 1st number
	//declare one more int variable which will have sum of 1st number and 2nd number
	//replace first number with second number and second number with sum of 1st number and 2nd number


public class FibonacciSeries {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int i=0;
		int firstNumber=0;
		int secondNumber=1;

		//for(int i=0;i<n;i++)
		
		while(i<n)
		{
			System.out.print(firstNumber + " ");
			int nextNumber=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=nextNumber;
			i++;
			
		}
	}

}
