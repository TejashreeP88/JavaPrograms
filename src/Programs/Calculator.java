package Programs;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double num1,num2;
		double result=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		
		System.out.println("Enter math operator");
		char c=sc.next().charAt(0);
		
		switch(c)
		{
		case '+':
			result=num1+num2;
			break;
			
		case '-':
			result=num1-num2;
			break;
			
		case '*':
			result=num1*num2;
			break;
			
		case '/':
			result=num1%num2;
			break;
			
		default:
			 System.out.println("You enter wrong input");
        }
			
		
		System.out.println("final Result is " + result);
				

	}

}
