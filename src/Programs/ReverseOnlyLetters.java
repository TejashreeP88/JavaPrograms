package Programs;

public class ReverseOnlyLetters {

	public static void main(String[] args) {
		String str="1ab2wjde23ef1";
		
		char[] newArr=str.toCharArray();
		int left=0;	
		int right=newArr.length-1;		
		
		
		while(left<right)
		{
			if(!Character.isLetter(newArr[left]))
			{
				left++;
			}
			
			else if(!Character.isLetter(newArr[right]))
			{
				right--;
			}
			else
				
			{
				char temp=newArr[left];
				newArr[left]=newArr[right];
				newArr[right]=temp;
				left++;
				right--;
				
			}
			
		}
		
		System.out.println("New String is " + new String (newArr));

	}

}
