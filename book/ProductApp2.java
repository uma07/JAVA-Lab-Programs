public class ProductApp2
{
	public static void main(String[] args)
	{
		String tmp = new String() ;
		Product p[];
		p=new Product[10];
		Product s;
		while(true)
		{
			tmp = Validator.getString("Enter product code: ") ;
			s = ProductDB.getProduct(tmp) ;
			if(s != null)
				p[Product.getCount() - 1] = s;
			tmp = Validator.getString("\nContinue? (y/n) : ") ;
			if(tmp.equals("n"))
			{	
				System.out.println("\nYou have created " + Product.getCount() + " object(s).\n") ;
				
				for(int i=0; i < Product.getCount(); i++)
					System.out.println(p[i]);
				return ;
			}
		}
	}
}