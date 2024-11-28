package Programs;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s1="  Hello   World  ";
		s1=s1.trim();
		int length=0;
		
		char[] arr=s1.toCharArray();
		
		for(int i=arr.length-1;i>0;i--)
		{
			if(arr[i]!= ' ')
			{
				length=length+1;
				
			}
			
			else
			{
				if(length>0)
				{
					System.out.println("Length of the last world is "+ length);
					break;
				}
			}
		}
		
		
		

	}

}
