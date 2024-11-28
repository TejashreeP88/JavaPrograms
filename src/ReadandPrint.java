import java.util.Scanner;

public class ReadandPrint {

	public static void main(String[] args) {
		
		int num;
		String name;
		
		System.out.println("Enter integer number");
		System.out.println("Enter String");
		
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		name = scan.nextLine();
		
		System.out.println("Enterd integer number is " +num);
		System.out.println("Enterd String value is " +name);

	}

}
