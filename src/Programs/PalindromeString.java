package Programs;

//Logic
	//1. Convert the String into character Array
	//2. Traverse the array using for loop from the last towards the first
	//3. Take one empty String and add each character in the string 
	//4. Compare the original string and the new reversed string, if both are equal then the string is Palindrome.


public class PalindromeString {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="madam";
		String reverse="";
		
		char[] newArray=str.toCharArray();
		
		for(int i=newArray.length-1;i>=0;i--)
		{
			reverse=reverse+newArray[i];
		}
		
		if(str.equals(reverse))
		{
			System.out.print("Given String is Palindrome");
		}
		else
			System.out.print("Given String is not Palindrome");
			

		
	}

}
