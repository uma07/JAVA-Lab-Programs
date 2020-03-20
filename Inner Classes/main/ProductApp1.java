package main;

import main.utility.*;
import main.products.*;
import main.products.db.*;
import main.products.interfaces.*;
import java.util.*;

public class ProductApp1
{
	public static void main(String[] args)
	{
		String temp = new String();
		temp = "y";
	    List<Product> p = new ArrayList<Product>();
		Product s;
		while(temp.equals("y"))
		{
			System.out.println("Enter any product code from the following : ");
			System.out.println("\n TPDE (Theory of PDE) ");
			System.out.println(" AI (Artificial Intelligence)");
			System.out.println(" TOS (Thoeory of stats)");
			System.out.println(" txt (Text Pad)");
			System.out.println(" wrdpd (Word Pad)\n");
			temp = Validator.getString("");
			s = ProductDB.getProduct(temp);
			if(s != null)
			{
				temp = Validator.getString("Do you want to insert tags? (y/n): ");
				while(temp.equals("y"))
				{
					if(temp.equals("y") || temp.equals("Y"))
					{
						temp = Validator.getString("\nEnter tag: ");
						s.setTags(temp);
					}
					else
						break;
					temp = Validator.getString("continue to insert tags? (y/n): ");
					if(temp.equals("n"))
						break;
				}
				p.add(s);
				System.out.println(s);
			}

			temp = Validator.getString("\nContinue to enter product name? (y/n) : ");
			
			if(temp.equals("n"))
			{	
				System.out.println(Product.getCount() + " objects are created.\n");
				
				System.out.println("Ascending Order w.r.t. product price : ");
				System.out.println("------------------------------------");
				Collections.sort(p,(new Product()).getPriceComparator());
				
				for(int i = 0; i < p.size(); i++)
					System.out.println(p.get(i));
				
				System.out.println("Descending Order w.r.t. product price : ");
				System.out.println("-------------------------------------");
				Collections.sort(p,(new Product()).getPriceComparatorDescending());
				
				for(int i = 0; i < p.size(); i++)
					System.out.println(p.get(i));
				
				System.out.println("Ascending Order w.r.t. product code : ");
				System.out.println("-----------------------------------");
				Collections.sort(p,(new Product()).getCodeComparator());
				
				for(int i = 0; i < p.size(); i++)
					System.out.println(p.get(i));
				
				break;
			}
		}
	}
}