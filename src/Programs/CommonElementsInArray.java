package Programs;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArray {

	public static void main(String[] args) {
		
		String[] arr1= {"Article", "in", "Geeks", "for", "Geeks"};
		String arr2[]= { "Geeks", "for", "Geeks" };
		Set<String> set = new HashSet<>();
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i].equals(arr2[j]))
				{
					set.add(arr1[i]);
					break;
				}
			}
		}
		
		for(String k: set)
		{
			System.out.println(k);
		}
		
	}

}
