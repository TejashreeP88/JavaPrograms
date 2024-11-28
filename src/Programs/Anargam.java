package Programs;

//Logic
// convert both the strings in to LowerCase
// convert both the strings in to character Array
// Sort both the Arrays
// compare both the arrays

// OR
// Create a HashMap
//convert both the strings in to LowerCase
//convert both the strings in to character Array
// insert 1st character array in Hashmap add value as 1
//insert 2nd character array in Hashmap decrease the value to 0
// if key / Value is not found in hashmap return false
// Traverse through the hashmap and check if all the values are 0



import java.util.Arrays;
import java.util.HashMap;

public class Anargam {

	public static void main(String[] args) {
		
		
		if (anagramsUsingHashmap()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
	
		
		String Str1="Brag";
		String Str2="Grab";
		String Result="";
		String Result1="";
		
		Str1=Str1.toLowerCase();
		Str2=Str2.toLowerCase();
		
		char[] arrStr1=Str1.toCharArray();
		char[] arrStr2=Str2.toCharArray();
		
		Arrays.sort(arrStr1);
		Arrays.sort(arrStr2);
		
		if(arrStr1.length!=arrStr2.length)
		{
			System.out.println("Both the Strings are not Anagam");
		}
		
		if(Arrays.equals(arrStr1, arrStr2))
		{
			System.out.println("Both the Strings are Anagam");
		}
		
		for(char a: arrStr1)
		{
			Result=Result+a;
		}
		
		for(char b: arrStr2)
		{
			Result1=Result1+b;
		}
		
		if(Result.equalsIgnoreCase(Result1))
		{
			System.out.println("Both the Strings are Anagam");
		}


	}
	
	public static boolean anagramsUsingHashmap()
	{
		String Str1="Brag";
		String Str2="Grab";
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>(); 
		
		Str1=Str1.toLowerCase();
		Str2=Str2.toLowerCase();
		
		char[] arrStr1=Str1.toCharArray();
		char[] arrStr2=Str2.toCharArray();
		
		for(char c:arrStr1)
		{
			map.put(c, map.getOrDefault(c,0)+1);
		}
		
		for(char c:arrStr2)
		{
			if(!map.containsKey(c) || map.get(c)==0)
			{
				return false;
			}
			
			map.put(c, map.get(c)-1);
		}
		
		for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }
		
		return true;
	}

}
