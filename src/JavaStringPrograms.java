import java.util.Arrays;
import java.util.HashMap;

public class JavaStringPrograms {

	public static void main(String[] args) {

		// System.out.print("character is " + getCharacter());

		// getCharacterArray();

		// replaceCharater();

		// reverseString();

		// sortString();

		// swapChars();

		// pangramCheck();

		// reverseStringAtSamePosition();

		// palindrome();

		//anargam();

		anargamUsingHashmap();
		
		//vowelsCount();
		
		//reverseCharacters();
		
		//reverseVowels();
		
		//replaceVowels();
	}

	public static char getCharacter() {
		String str = "GeeksForGeeks";

		return str.charAt(6);

	}

	public static void getCharacterArray() {
		String str = "GeeksForGeeks";

		char ch = str.toCharArray()[3];

		System.out.print("character is " + ch);

	}

	public static void replaceCharater() {
		String str = "GeeksForGeeks";

		StringBuilder strbuild = new StringBuilder(str);
		strbuild.setCharAt(5, 'G');
		System.out.print("New String is " + strbuild);
	}

	public static void reverseString() {
		String str = "Hello";
		String reverse = "";

		char[] charArray = str.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {

			reverse = reverse + charArray[i];

			System.out.print(charArray[i]);

		}

		System.out.print("Reverse String is " + reverse);

		StringBuilder strbuild = new StringBuilder(str);
		strbuild.reverse();
		System.out.print(strbuild);

	}

	public static void sortString() {
		String str = "GeeksForGeeks";
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		System.out.print(charArray);

	}

	public static void swapChars() {
		String str = "tejas";
		char temp;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length - 1; i += 2) {

			temp = charArray[i];
			charArray[i] = charArray[i + 1];
			charArray[i + 1] = temp;

		}

		System.out.println(charArray);

		int length = str.length();

		StringBuffer sb = new StringBuffer(length);

		for (int j = 0; j < length - 1; j += 2) {

			sb.append(str.charAt(j + 1));
			sb.append(str.charAt(j));
		}
		if (length % 2 != 0) {
			sb.append(str.charAt(length - 1));
		}

		System.out.println(sb.toString());
	}

	public static void pangramCheck() {
		String str = "abcdefghijklmnopqrstuvwxyz";

		str = str.toLowerCase();

		boolean allLetterPresent = true;

		for (char ch = 'a'; ch <= 'z'; ch++) {

			if (!str.contains(String.valueOf(ch))) {
				allLetterPresent = false;
				break;
			}
		}

		if (allLetterPresent) {
			System.out.print("The String is pangram");
		} else {
			System.out.print("The String is not pangram");
		}

	}
	
	
	
	public static boolean pangramCheck1() {
		String str = "abcdefghijklmnopqrstuvwxyz";

		str = str.toLowerCase();

		while(str.length()>=26)
		{
			for (char ch = 'a'; ch <= 'z'; ch++) {
			
			if(str.indexOf(ch)<0)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		}
		return false;
	}

	public static void reverseStringAtSamePosition() {

		String input = "How Are You";
		String[] words = input.split(" ");

		String reverse = "";
		for (int i = 0; i < words.length; i++) {

			for (int j = words[i].length() - 1; j >= 0; j--) {

				reverse += words[i].charAt(j);
			}
			System.out.print(reverse + " ");
			reverse = "";
		}
	}

	public static void palindrome() {
		String input = "madam";
		String reverse = "";

		char[] charArray = input.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			reverse = reverse + charArray[i];

		}

		if (input.equals(reverse)) {
			System.out.print("String is palindrome");
		}

		else {
			System.out.print("String is not palindrome");
		}

	}

	public static void anargam() {
		String s1 = "listen";
		String s2 = "silent";
		String result = "";
		String result1 = "";

		char[] strArray1 = s1.toCharArray();
		char[] strArray2 = s2.toCharArray();
		

		Arrays.sort(strArray1);
		Arrays.sort(strArray2);

		for (int i = 0; i < strArray1.length; i++) {
			result = result + strArray1[i];
			result1 = result1 + strArray2[i];

		}

		System.out.println("s1 is " + result);
		System.out.println("s2 is " + result1);

		// System.out.println("s2 is " + strArray2.toString());

	}

	public static boolean anargamUsingHashmap() {

		String s1 = "listen";
		String s2 = "silent";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		char[] charstr = s1.toCharArray();
		char[] charstr2 = s2.toCharArray();

		/*
		 * for(int i=0;i<charstr.length;i++) { //System.out.println(charstr[i]);
		 * map.put(charstr[i], map.getOrDefault(charstr[i], 0)+1);
		 * 
		 * }
		 */
		for (char c : charstr) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (int i = 0; i < charstr2.length; i++) {
			if (!map.containsKey(charstr2[i]) || map.get(charstr2[i]) == 0) {
				return false;
			}
			map.put(charstr2[i], map.getOrDefault(charstr2[i], 0) - 1);
		}

		for (int count : map.values()) {
			if (count != 0) {
				return false;
			}
		}
		System.out.println(map);
		return true;
	}
	
	public static void vowelsCount()
	{
		String str="Hello World";
		int vowels=0;
		int consonants=0;
		str=str.toLowerCase();
		char [] charArray = str.toCharArray();
		
		for(char c:charArray)
		{
			if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
			
		}
		
		
		System.out.print("vowels is "+ vowels);
		System.out.print("consonants is "+ consonants);
	}
	
	public static void reverseCharacters()
	{
		String input="1ab2";
		
		char[] charArray=input.toCharArray();
		
		int left=0;
		int right=charArray.length-1;
		while(left<right)
		{
		if(!Character.isLetter(charArray[left]))
		{
			left++;
			
		}
		else if(!Character.isLetter(charArray[right]))
		{
			
			right--;
		}
		else
		{
			char temp=charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			left++;
			right--;
		}
		
		}
		System.out.print("Reverse value is"+ Arrays.toString(charArray));
		System.out.print("Reverse value is "+ new String(charArray));
	}
	
	
	public static void reverseVowels()
	{
		String input="HEllo";
		
		String vowels="aeiou";
		
		input=input.toLowerCase();
		
		char[] newArray=input.toCharArray();
		
		int left=0;
		int right=newArray.length-1;
		
		while(left<right)
		{
		if(vowels.indexOf(newArray[left])==-1)
		{
			left++;
			
		}
		else if(vowels.indexOf(newArray[right])==-1)
		{
			
			right--;
		}
		else
		{
			char temp=newArray[left];
			newArray[left]=newArray[right];
			newArray[right]=temp;
			left++;
			right--;
		}
		
		}
		System.out.print("Reverse value is"+ Arrays.toString(newArray));
		System.out.print("Reverse value is "+ new String(newArray));
		
	}
	
	
	public static void replaceVowels()
	{
		String input="HEllo";
		
		String vowels="aeiou";
		
		input=input.toLowerCase();
		
		char[] newArray=input.toCharArray();
		
		StringBuilder sb= new StringBuilder();
		
		for(int i=0;i<newArray.length;i++)
		{
			if(!(vowels.indexOf(newArray[i])==-1))
			{
				sb.append('x');
			}
			else
			{
				sb.append(newArray[i]);	
			}
		}
		
		System.out.println(sb.toString());
		
	}

	
}
