
public class StringExample1 {
	
public static void main(String[] args) {
		
		lengthOftheLastWord();

	}


public static void lengthOftheLastWord()
{
	String s1="    Hello   World  ";
	int counter=0;
	
	System.out.println("length of the String " + s1.length());
	
	//s1=s1.trim();
	
	//System.out.println("length of the String " + s1.length());
	
	char s1Array[] = s1.toCharArray();
	
	for(int i=s1Array.length-1;i>=0;i--)
	{
		if(s1Array[i]!=' ')
		{
			counter=counter+1;
			
		}
		
		else
		{
			if(counter>0)
			{
				System.out.println("Length of the last world is "+ counter);
				break;
			}
			
		}
		
		
	}
	
	
}
	

}
