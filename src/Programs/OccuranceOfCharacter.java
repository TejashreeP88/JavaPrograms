package Programs;

import java.util.HashMap;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		String str="successful";
		
		char newArray[]=str.toCharArray();
		
		HashMap <Character,Integer> map= new HashMap<Character,Integer>();
		
		for(int i=0; i<newArray.length;i++)
		{
			map.put(newArray[i], map.getOrDefault(newArray[i], 0)+1);
		}
		
		for(char c: map.keySet())
		{
			System.out.println(c+ " "+map.get(c));
		}

	}

}
