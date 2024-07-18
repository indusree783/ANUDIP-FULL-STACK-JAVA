package FirstProject;
// A java program to input any five numbers and find out the greatest number among them. 
public class GreatestNumber {
	public static void main(String[] args)
	{
		int a=5;
		int b=15;
		int c=25;
		int d=35;
		int e=45;
		if(a>b && a>c && a>d && a>e)
		{
			System.out.println("a is greater");
		}
		else if(b>c && b>d && b>e && b>a)
		{
			System.out.println("b is greater");
		}
		else if(c>d && c>e && c>b && c>a)
		{
			System.out.println("c is greater");
		}
		else if(d>a && d>b && d>c && d>e)
		{
			System.out.println("d is greater");
		}
		else
		{
			System.out.println("e is greater");
		}
	}
}
