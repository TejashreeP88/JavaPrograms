package Programs;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str="  Today is  Wednesday  ";
		String result="";
		System.out.println(str);
		str=str.trim();
		
		System.out.println(str);
		
		str=str.replaceAll(" ", "");
		
		System.out.println(str);
		
		str=str.replace(" ", "");
		
		System.out.println(str);
		
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(!Character.isWhitespace(ch))
			{
				
				result=result+ch;
			}
		}
		
		System.out.println(result);

	}

}
