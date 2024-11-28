package Programs;

//Logic
//Check if given number is Prime or Not
//Take the number from the user
// For loop starts from i=2, i will be less than the given number
// if the given number is completely divisible by i, then its not a prime Number

// Print 1st 10 Prime Numbers
// take one counter variable=1, which should be less than the total numbers we wanted to print, counter++
// take one value variable=1,increment before sending it to Prime Number function
// 



public class PrimeNumber {

	public static void main(String[] args) {

/*		if (primeNumber(2))

			System.out.print("The give number is prime");

		else
			System.out.print("The give number is not prime");

*/		
		primeNumberList(7);
	}

	public static boolean primeNumber(int number) {
		if (number <= 1)
			return false;

		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}

		return true;

	}

	public static boolean primeNumberList(int number) {
		int count = 1;
		//int value=1;
		while (count <= number) {
			//value++;
			if(primeNumber(count))
			{
				System.out.println("The given number is prime " + count);
			}
			else
			{
				System.out.println("The given number is not prime " + count);
			}
			count++;
			}
			
			return true;


}
}
