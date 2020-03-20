class TestSorter
{

	public static void main(String[] args)
	{
		String ch;
		int max;
		
		try
		{
			System.out.println("Enter maximum range for the array integer : ");
			max = Validator.getInt("");
			
			ArraySorter Array = new ArraySorter(max);
			Array.getSorted();
		}
		
		catch(IllegalArgumentException e)
		{
			System.out.println("IllegalArgumentException !!! (Default Value used as 200) : ");
			ArraySorter Array = new ArraySorter(200);
			Array.getSorted();
		}
		
		catch(Exception e)
		{
			System.out.println("Invalid Input (Default Value used as 200) : ");
			ArraySorter Array = new ArraySorter(200);
			Array.getSorted();
		}
	}

}