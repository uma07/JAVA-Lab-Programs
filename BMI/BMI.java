public class BMI
{
	public static void main(String [] args)
	{
		double bmi=0;

		System.out.println("Choose the following : ");
		System.out.println("1.kilograms and meters");
		System.out.println("2.pounds and feet");
		int ch = Validator.getInt("");
		if(ch==1)
		{
			System.out.println("Enter the body weight of the person :"); 
			double a = Validator.getDouble("");
			System.out.println("Enter the height of the person : ");
			double b = Validator.getDouble("");

			bmi = a/(b*2);
		}

		else if(ch==2)
		{
			System.out.println("Enter the body weight of the person :");
			double a = Validator.getDouble("");
			System.out.println("Enter the height of the person : ");
			double b = Validator.getDouble("");

			bmi = (a * 4.88)/(b * 2);
		}

		else 
			System.out.println("Soory ! Wrong choice!!!");

		System.out.println("BMI : "+bmi);
		if(bmi <= 18.5)
			System.out.println("Under weight");
		else if(bmi > 18.5 && bmi <= 25)
			System.out.println("Normal weight");
		else if(bmi > 25 && bmi <= 30)
			System.out.println("Over weight");
		else if(bmi > 30)
			System.out.println("Too Muscular(Obese)");		
	}
}