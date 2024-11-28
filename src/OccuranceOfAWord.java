import java.util.HashMap;

public class OccuranceOfAWord {

	public static void main(String[] args) {
		
		countOfChar();

	}
	
	public static void countOfChar()
	{
		
		String str="madam";
		HashMap <Character,Integer> map=new HashMap<Character,Integer>();
		
		char[] charstr=str.toCharArray();
		
		for(int i=0;i<charstr.length;i++)
		{
			//System.out.println(charstr[i]);
			map.put(charstr[i], map.getOrDefault(charstr[i], 0)+1);			
			
		}
		
		System.out.println(map);
		
	for(char c:map.keySet())
		{
			System.out.println(c+ " "+map.get(c));
		}

		
		
		
	}
	
	
	

}
