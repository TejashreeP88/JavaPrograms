package Programs;

public class DecimalToBinaryConversion {

	public static void main(String[] args) {
	
		int n=500;
		int arr[]=new int[100];
		int i=0;
		
		while(n!=0)
		{
		arr[i]=n%2;
		n=n/2;
		i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}

	}

}
