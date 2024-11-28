
public class EvenLengthString {

	public static void main(String[] args) {

		// stringOperation();
		//removeSpaces();
		convertToUpperCase();
	}

// Logic
// String is given
// Convert that string into the array (data type of the array is String) use .split(" ") for conversion
// traverse the array using for loop
// if individual word length % 2 == 0 then its even else Odd

	public static void stringOperation() {

		String str = "Sky is Blue and vast";

		String dataArray[] = str.split(" ");

		for (int i = 0; i < dataArray.length; i++) {
			if (dataArray[i].length() % 2 == 0) {
				System.out.println("This is an even length word in a String " + dataArray[i]);
			}
		}

	}

	public static void removeSpaces() {
		String str = " Sky is Blue and vast ";

		System.out.println(str);

		String reverse = "";

		str = str.replaceAll("\\s", "");

		System.out.println(str);

		str = str.replace(" ", "");

		System.out.println(str);

		char chArray[] = str.toCharArray();

		for (int i = chArray.length - 1; i >= 0; i--) {
			reverse = reverse + chArray[i];
		}
		System.out.println(reverse);

		char chArray1[] = reverse.toCharArray();
		for (int i = 0; i < chArray1.length; i += 2) {
			System.out.println(chArray1[i]);
		}

	}
	
	public static void convertToUpperCase()
	{
		
		String str = " sky is blue and vast ";
		str=str.toUpperCase();
		System.out.println(str);
		
		
		String str1 = " MY NAME IS TEJASHREE ";
		str1=str1.toLowerCase();
		System.out.println(str1);
		
		String str2 = "YesterDay Was My BirthDay";
		String newString="";
		char[] arr=str2.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
		arr[i]= Character.toUpperCase(arr[i]);
		
		}
		
		System.out.print(new String(arr));
	}
	
	
	
}
