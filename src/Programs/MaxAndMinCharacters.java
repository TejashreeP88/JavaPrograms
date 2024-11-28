package Programs;

import java.util.HashMap;

public class MaxAndMinCharacters {

	public static void main(String[] args) {
		 
		 
		maxChar();
	

	}
	
	
	public static void maxChar()
	{
		String str = "Tejashree Madhusudan Patwardhan";
		str=str.toLowerCase();
		str=str.replace(" ", "");
		 int maxchar=0;
		 int minchar=Integer.MAX_VALUE;
		 char maxNo = 0;
		 char minNo = 0;
		 
		 char[] charArr=str.toCharArray();
		 
		 HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		 
		 for(char c:charArr)
			 
		 {
			 map.put(c, map.getOrDefault(c, 0)+1);
		 }
		 
		 System.out.println(map);
		 
		 for(char ch:map.keySet())
		 {
			 int count=map.get(ch);
			 
			 if(count>maxchar)
			 {
				 maxchar=count;
				 maxNo=ch;
	
				 
			 }
			 else if(count<minchar)
			 {
				 minchar=count;
				 minNo=ch;
				
			 }
		 }
		 
		 System.out.println("Maximum number of character is " + maxNo);
		 System.out.println("Minimum number of character is " +minNo);
	}
}
	
