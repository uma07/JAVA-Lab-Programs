/**
 * A rational number given by a numerator and denominator.
 */


public class RationalNumber
{

	/**
	 * The numerator is given as an integer number.
	 * It is always 0 if this RationalNumber is 0.
	 */

	private int numerator;


	/**
	 * The denominator is given as an integer number greater than zero.
	 * It is always 1 if this RationalNumber is 0.
	 */

	private int denominator;


	private int gcd;


	/**
	 * Creates a new RationalNumber with given numerator and denominator.
	 * @param numerator an arbitry integer number
	 * @param denominator an integer not equal to zero
	 */

	public RationalNumber(int num, int den)
	{
		this.numerator = num;

		if (num == 0)
		{
			denominator = 1;
		}

		if (den == 0)
		{
			throw new RuntimeException("Denominator is Zero");
		}

		else
		{
			this.denominator = den;
		}

		reduceFraction();
	}


	/**
	 * The default constructor initializing the
	 * Rational number to '0' value (using Constructor chaining)
	 */

	public RationalNumber()
	{
		this(0,1);
	}


	/**
	 * another constructor accepting numerator only
	 */

	public RationalNumber(int num)
	{
		this(num,1);
	}


	/**
	 * Addition of two rational numbers
	*/

	public RationalNumber add(RationalNumber b)
	{
		RationalNumber c = new RationalNumber((( b.getDenominator() * numerator) + 
							(denominator * b.getNumerator())) ,
				 			(denominator * b.getDenominator()));

		return c;
	}


	/**
	 * Subtraction of two rational numbers
	*/

	public RationalNumber subtract(RationalNumber b)
	{
		RationalNumber c = new RationalNumber((( b.getDenominator() * numerator) - 
							(denominator * b.getNumerator())) ,
				 			(denominator * b.getDenominator()));

		return c;
	}


	/**
	 * Reciprocal Method
	 */

	public RationalNumber reciprocal ()
	{
      		return new RationalNumber (denominator, numerator);
	}

	/**
	 * 'multiply' method for 'divide' method
	 */

	public RationalNumber multiply(RationalNumber b)
	{
		int numer = numerator * b.getNumerator();
		int denom = denominator * b.getDenominator();

		return new RationalNumber (numer, denom);
	}


	/**
	 * ‘divide’ method using ‘reciprocal’ method
	 */

	public RationalNumber divide (RationalNumber b)
	{
		return multiply(b.reciprocal());
	}


	/**
	 * This function returns the Rational Number as a string
	 */

	public String toString ()
	{
      		String result;

	      	if (numerator == 0)
         		result = "0";
      		else if (denominator == 1)
            		result = numerator + "";
      		else
            		result = numerator + "/" + denominator;
    
		return result;
	}


	/**
	 * Returns the greates common divisor of two positive integer numbers.
	 */

	private int getGcd(int p, int q)
	{
			p = Math.abs(p);
			q = Math.abs(q);
			int r = p%q;
			while (r > 0)
			{
				p = q;
				q = r;
				r = p%q;
			}
			//System.out.println("GCD::"+q);
			return q;
	}


	/**
	 * Reduces the fraction of numerator and denominator by their
	 * greatest common divisor.
	 */

	private void reduceFraction()
	{
		this.gcd = getGcd(Math.abs(numerator), denominator);
		//int num, den;

		if (gcd > 0)
		{
			numerator = numerator / gcd;
			denominator = denominator / gcd;
		}

	}


	public int getGcd()
	{
		return this.gcd;
	}


	/**
	 * Returns the denominator of this RationalNumber.
	 * It is zero, if this RationalNumber is zero.
	 */

	public int getDenominator()
	{
		return denominator;
	}


	/**
	 * Returns the numerator of this RationalNumber.
	 */

	public int getNumerator()
	{
		return numerator;
	}


	/**
	 * Returns the value of this RationalNumber as a double value.
	 */

	public double getDoubleValue()
	{
		return (double) numerator / (double) denominator;
	}
}