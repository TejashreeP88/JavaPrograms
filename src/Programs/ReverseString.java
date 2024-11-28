package Programs;


// Logic
//1. use trim() to remove the whitespace
//2. Convert the String into character Array
//3. Traverse the array using for loop from the last towards the first
//4. Take one empty String and add each character in the string 


public class ReverseString {

	
	public static void main(String[] args) {
	
			String str="  Today is Monday  ";
			String reverse="";
			str=str.trim();
			
			char[] newArray=str.toCharArray(); // to convert the entire string into the character array.
			char a=str.toCharArray()[3]; // to get a single character at the given index
			char b=str.charAt(3); // to get a single character at the given index
			int ind=str.indexOf('i'); // to get a index of the given character
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(ind);
			
			for(int i=newArray.length-1;i>=0;i--)
			{
				reverse=reverse+newArray[i];
			}
			
		
			
			System.out.println("Reverse String is " + reverse);
			
	}

}
