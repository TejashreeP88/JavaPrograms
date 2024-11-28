package Programs;

// Logic
// Find the length of both the arrays
// create a new array of length of sum of lengths of 2 arrays
// use System.arraycopy function

//OR

//Find the length of both the arrays
//create a new array of length of sum of lengths of 2 arrays
// declare a variable with value 0
// user for loop to traverse via first array
// new array[variable] = array[i]
// do the same for 2nd arrays as well

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrays {

	public static void main(String[] args) {
		
		//mergeArray1();
		//mergeArray2();
		mergeArray3();
	}
	
	public static void mergeArray1()
	{
		int a[]= {1,3,5,7,4};
		int[] b= {2,4,6,8};
		
		int aLength=a.length;
		int bLength=b.length;
		
		int[] c= new int[aLength+bLength];
		
		System.arraycopy(a, 0, c, 0, aLength);
		System.arraycopy(b, 0, c, aLength, bLength);
		
		System.out.print(Arrays.toString(c));
	

	}	
	
	
	public static void mergeArray2()
	{
		int a[]= {1,3,5,7,4};
		int[] b= {2,4,6,8};
		
		int aLength=a.length;
		int bLength=b.length;
		int position=0;
		
		int[] c= new int[aLength+bLength];
		
		for(int i: a)
		{
			c[position]=i;
			position++;
		}
		
		for(int i: b)
		{
			c[position]=i;
			position++;
		}
	

		System.out.print(Arrays.toString(c));
		
		
	}	
	
	public static void mergeArray3()
	{
		
		
		String str1[] = { "A", "E", "I" };          //source array  
		String str2[] = { "O", "U" };               //destination array  
		List list = new ArrayList(Arrays.asList(str1)); //returns a list view of an array  
		//returns a list view of str2 and adds all elements of str2 into list  
		list.addAll(Arrays.asList(str2));     
		Object[] str3 = list.toArray();         //converting list to array  
		System.out.println(Arrays.toString(str3));  //prints the resultant array  
		
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i));
		}
	}	
	
	

}


