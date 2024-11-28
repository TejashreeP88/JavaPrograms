package Programs;

public class MissingNumberinArray {

	public static void main(String[] args) {
	
		int[] a= {1,2,4,5,6};
		int n=6;
		int sum1=0;
		int sum2=0;
		int missingNumer=0;
		
		sum1=n*(n+1)/2;
		
		System.out.println(sum1);
		
		for(int i:a)
		{
			sum2=sum2+i;
		}
		
		System.out.println(sum2);
		
		
		missingNumer=sum1-sum2;
		System.out.println(missingNumer);
		
	}

}
