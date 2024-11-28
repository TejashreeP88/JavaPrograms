package Programs;

public class LeapYear {

	public static void main(String[] args) {
		
		boolean value=leapYear(2025);
		
		if (value==true)
		{
			System.out.print("Given year is Leap Year");
			
		}
		
		else
			System.out.print("Given year is not Leap Year");
			
	}
	
	public static boolean leapYear(int Year)
	{
		if(Year % 4==0)
		{
			return true;
		}
		
		if(Year % 100==0)
		{
			if(Year % 400==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		return false;
		
		
	}

}
