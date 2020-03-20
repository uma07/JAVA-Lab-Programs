import java.lang.*;
import java.util.*;

public class Circle_tester
{
	public static void main(String []args)
	{
		double Radius;
		double circum, area;
		String ch = new String();
		String s1 = new String();
		String s2 = new String();

		System.out.println("Circle Tester") ;
		System.out.println("=============");
		while(true)
		{
			Radius = Validator.getDouble("Enter the radius of the circle : ") ;
			
			Circle c = new Circle(Radius) ;
			circum = c.getCircumference() ;
			area = c.getArea() ;
			System.out.println("Circumference: " +circum );
			System.out.println("Area: " +area) ;

			New_circle_tester.set_formatting();
			s1 = c.get_formatted_circumference();
			s2 = c.get_formatted_area();	
			System.out.println("\nFormatted Circumference: " + s1 + "\nFormatted Area: " + s2) ;
			
			ch = Validator.getString("\nContinue? (y/n) : ") ;
			if(ch.equals("n"))
			{	
				rad = Circle.getObjectCount() ;
				System.out.println("\nGoodbye. You created " + Radius + " Circle object(s).\n") ;
				return ;
			}
		}
	}
}
