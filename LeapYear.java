package FirstProject;
// A java program to check a year is leap year or not.
public class LeapYear {
	public static void main(String[] args)
	{
		int year=2024;
		if(year%4 == 0)
		{
			System.out.println("Given year is a leap year.");
		}
		else
		{
			System.out.println("Given year is not a leap year.");
		}
	}
}
