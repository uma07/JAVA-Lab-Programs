import java.text.NumberFormat.*;

public class New_circle_tester
{
	private double radius;
	private static int Count = 0;

// Constructor for Circle
	public Circle(double Radius)
	{
		this.radius = Radius ;
		Count ++ ;
	}


// Default constructor	
	public Circle()
	{
		this(1.0);
		Count ++ ;
	}

// format setting
	public static void set_formatting()
	{
		java.text.NumberFormat.getInstance().setMaximumFractionDigits(Validator.getInt("\nEnter the max no. of fraction digits: ",2,6));
		java.text.NumberFormat.getInstance().setMaximumIntegerDigits(Validator.getInt("\nEnter the max no. of integer digits: ", 0,5)) ;
		java.text.NumberFormat.getInstance().setMinimumFractionDigits(Validator.getInt("\nEnter the min no. of fraction digits: ",2,6));
		java.text.NumberFormat.getInstance().setMinimumIntegerDigits(Validator.getInt("\nEnter the min no. of integer digits: ", 0,5)) ;
	}
// Returns the number of objects created
	public static int getObjectCount()
	{
		return Circle.Count ;
	}
// Returns the circumference of the Circle object	
	public double getCircumference()
	{
		return  (2 * java.lang.Math.PI * this.radius) ;
	}

// Returns the area of the Circle object 
	public double getArea()
	{
		return ( java.lang.Math.PI * this.radius * this.radius ) ;
	}

// returns the formatted circumference of the Circle object
	public String get_formatted_circumference()
	{
		return	java.text.NumberFormat.getInstance().format(2 * java.lang.Math.PI * this.radius) ;
	}

// Returns the formatted area of the Circle obejct
	public String get_formatted_area()
	{
		return java.text.NumberFormat.getInstance().format(java.lang.Math.PI * this.radius * this.radius) ;
	}
}
