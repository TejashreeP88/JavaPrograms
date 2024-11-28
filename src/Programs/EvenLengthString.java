package Programs;

public class EvenLengthString {

	public static void main(String[] args) {
		String str = "Sky is Blue and vast";
		
		String[] arr=str.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i].length()%2==0)
			{
				System.out.println("This is an even length word in a String " + arr[i]);
			}
		}

	}

}
