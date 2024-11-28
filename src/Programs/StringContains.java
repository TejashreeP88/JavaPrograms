package Programs;

public class StringContains {

	public static void main(String[] args) {
		String str="How are You";
		String str1="How do You do";
		
		int isFound=str.indexOf("How");
		
		if(isFound==-1)
		{
			System.out.println("Str not contains str1");
		}
		else
			System.out.println("Str contains str1");
		
		
		if(str.toLowerCase().contains(str1.toLowerCase()))
		{
			System.out.println("Str contains str1");
		}
		else
			System.out.println("Str not contains str1");
		
		
		int ind=str1.lastIndexOf("do");
		System.out.println(ind);
		
		String subS=str1.substring(4,6);
		System.out.println(subS);
		

	}

}
