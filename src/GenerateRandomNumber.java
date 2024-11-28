import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt(1000));
		System.out.println(rand.nextInt(1000, 1500));
		System.out.println(rand.nextBoolean());
		
		System.out.println(Math.random());
	
	}

}
