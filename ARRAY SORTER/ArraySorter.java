import java.util.Random;

class ArraySorter
{
	
	int[] arr=new int[20];
	
	public ArraySorter()
	{
		this(200);
	}
	
	public ArraySorter(int range) throws IllegalArgumentException
	{
		if(range < 1)
			throw new IllegalArgumentException();

		Random num = new Random();
		
		for(int i = 0; i < 20; i++)
			arr[i] = num.nextInt(range);
	}
	
	public void getSorted()
	{
		java.util.Arrays.sort(this.arr, 0, 10);

		for (int i = 0; i < 10; i++)
			System.out.print(" " + this.arr[i]);
		
		System.out.println("\n");
		
		for (int i = 10; i < 20; i++)
			System.out.print(" " + this.arr[i]);

		System.out.println("\n");
	}
	
}