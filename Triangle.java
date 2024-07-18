package FirstProject;
// A java program to input any three angles and check they form a triangle.
public class Triangle {
	public static void main(String[] args)
	{
		int a=45;
		int b=90;
		int c=45;
		int d=a+b+c;
		if(d==180)
		{
		   System.out.println("The given values form a traingle ");
		}
		else
		{
			System.out.println("The given values does not form a triangle");
		}
	}
}
