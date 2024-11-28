package Programs;

// Logic
// trim() the given string
// convert the string into lower case
// declare two counter variables
// convert the string into character array
// use a for loop to traverse via array
// compare each element with aeiou, if it match the increment 1st counter
// else increment 2nd counter

//OR

//trim() the given string
//convert the string into lower case
//declare two counter variables
//declare one String variable which contains the value is aeiou
//convert the string into character array
//use a for loop to traverse via array
//if StringVariable.indexOf(each element from the array)
//if its not Vowel, value will be equal to -1 increment 1st counter
//else increment 2nd counter

public class VowelsAndConsonants {

	public static void main(String[] args) {
		
		String str="My name is Tejashree";
		String vowelsList=("aeiou");
		str=str.trim();
		str=str.toLowerCase();
	
		
		
		int vowels=0;
		int consonants=0;
		
		char[] newArray=str.toCharArray();
		
		for(int i=0;i<newArray.length;i++)
		{
			/*
			if(newArray[i]=='a' || newArray[i]=='e' || newArray[i]=='i' || newArray[i]=='o' || newArray[i]=='u' )
			{
				vowels++;
			}
			else 
				consonants++;
			*/
			
			if(vowelsList.indexOf(newArray[i])==-1)
			{
				consonants++;
			}
			else
				vowels++;
			
		}
		
		System.out.println("Total number of vowels in a given String is "+vowels);
		System.out.println("Total number of consonants in a given String is "+consonants);

	}

}
