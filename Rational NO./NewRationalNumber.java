	/**
	 * This is the main() function
	 */
	public class NewRationalNumber
	{
		public static void main(String []args)
		{
			RationalNumber a;
			
			System.out.println("Enter the numerator : ");
			int numerator = Validator.getInt("");

			System.out.println("Enter the denominator : ");
			int denominator = Validator.getInt("");

			a = new RationalNumber(numerator, denominator);

			int gcd = a.getGcd();
			System.out.println("The G.C.D. is : "+gcd);
			
			System.out.println("Reduced Fraction : " + a.getNumerator() + "/" + a.getDenominator());

			System.out.println("Double Value : "+a.getDoubleValue());

			RationalNumber b = new RationalNumber(6,7);

			System.out.println("Sum is : "+a.add(b));

			System.out.println("Difference is : "+a.subtract(b));

			System.out.println("Multiplication is : "+a.multiply(b));
			
			System.out.println("Division is : "+a.divide(b));
		}
	}