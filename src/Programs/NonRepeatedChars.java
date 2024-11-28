package Programs;

public class NonRepeatedChars {

	public static void main(String[] args) {
	
		char z=occurance();
		System.out.print(z);
	}
	
	public static char occurance()

	{
		String str="Today is Thursday";
		char[] newArr=str.toCharArray();
		
		for(int i=0;i<newArr.length;i++)
		{
			for(int j=0;j<newArr.length;j++)
			{
				if(i!=j && newArr[i]==newArr[j])
				{
					System.out.println("inside If Loop " + newArr[i] + newArr[j]);
					break;
					
				}
				
			if(j==newArr.length-1)
			
				{
				
				System.out.println("inside 2nd If Loop " + newArr[i]);
					return newArr[i];
				}
			}
		}
		return 0;

	}
}
