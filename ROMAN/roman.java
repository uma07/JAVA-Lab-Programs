public class roman
{
	public static void main(String [] args)
	{
		String ch="y";

		while(ch.equals("y") || ch.equals("Y"))
		{
			System.out.println("Enter the integer(1-4000) : ");
			int num = Validator.getInt("");
			int n;

			System.out.println("");
			if(num >= 1 && num < 4000)
			{

				n = num/1000;

				if(n == 1)
					System.out.print("M");

				else if(n == 2)
					System.out.print("MM");

				else if(n == 3)
					System.out.print("MMM");

				n = (num/100)%10;

				if(n == 9)
					System.out.print("CM");

				else if(n>4 && n<9)
				{
					System.out.print("D");
					while(n != 5)
					{
						System.out.print("C");
						n--;
					}
				}


				else if(n == 4)
					System.out.print("CD");

				else if(n>0 && n<4)
				{
					while(n > 0)
					{
						System.out.print("C");
						n--;
					}
				}

				n = (num/10)%10;

				if(n == 9)
					System.out.print("XC");

				else if(n>4 && n<9)
				{
					System.out.print("L");
					while(n != 5)
					{
						System.out.print("X");
						n--;
					}
				}


				else if(n == 4)
					System.out.print("XL");

				else if(n>0 && n<4)
				{
					while(n > 0)
					{
						System.out.print("X");
						n--;
					}
				}

				n = num%10;

				if(n == 9)
					System.out.print("IX");

				else if(n>4 && n<9)
				{
					System.out.print("V");
					while(n != 5)
					{
						System.out.print("I");
						n--;
					}
				}


				else if(n == 4)
					System.out.print("IV");

				else if(n>0 && n<4)
				{
					while(n > 0)
					{
						System.out.print("I");
						n--;
					}
				}

			}
			else
				System.out.println("Sorry !!! Range is from 1 to 4000");

			ch = Validator.getString("\nDo u want to enter again(y/n) : ");
		}
	}
}