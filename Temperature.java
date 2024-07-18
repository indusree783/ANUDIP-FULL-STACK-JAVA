package FirstProject;
// A java program to input temperature in fahrenheit and convert it in celsius.
public class Temperature {
	public static void main(String[] args)
	{
		int fahrenheit=50;  //temperature in fahrenheit 
		int celsius=(fahrenheit-32)*5/9;  //calculating celsius temperature
		System.out.println("value of temperature in celsius:"+ celsius);
	}
}