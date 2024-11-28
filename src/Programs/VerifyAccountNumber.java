package Programs;

public class VerifyAccountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		verifyAccountNo("123-456-789");
	}
	
	public static String verifyAccountNo(String number)
	{
		
		String accountNumber=number.replaceAll("[^a-zA-Z0-9]", " ").replaceAll(" " , "");
		System.out.println(accountNumber);
		int len=accountNumber.length();
		System.out.println(len);
		
		if(len!=9)
		{
			System.out.println("Error");
		}
		
		
		return number;
		
	}

}
