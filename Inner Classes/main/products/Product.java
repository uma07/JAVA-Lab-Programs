package main.products;

import main.products.interfaces.*;
import java.text.NumberFormat;
import java.util.*;

public class Product implements java.lang.Comparable<Product>,Tagable
{
    private String code,tags;
    private String description;
    private double price;
    public static int count = 0;

    public Product()
    {
        code = "";
        description = "";
		tags="";
        price = 0;
        count ++ ;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
	{
        return code;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public String getFormattedPrice()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
	
	public String getTags()
	{
		return tags;
	}
	
	public void setTags(String S)
	{
		if(tags == "")
			tags = S;
		else
			tags = tags + ", " + S;
	}

    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " + this.getFormattedPrice() + "\n" +
			   "Tags : " + this.getTags() + "\n";
    }

    public static int getCount()
    {
        return count;
    }
	
	public int compareTo(Product P)
	{
		Product S = (Product)P;
		return this.code.compareTo(S.code);
	}
	
	public Comparator<Product> getPriceComparator()		//anonymous class
	{
		return new Comparator<Product>()
		{
			public int compare(Product p, Product s)
			{
				if(p.price < s.price)
					return -1;
				else if(p.price == s.price)
						return 0;
				else
					return 1;
			}
		};
	}
	
	public Comparator<Product> getPriceComparatorDescending()		//local class
	{
		class priceComparatorDescending implements Comparator<Product>
		{
			public int compare(Product p, Product s)
			{
				if(p.price < s.price)
					return 1;
				else if(p.price == s.price)
						return 0;
				else
					return -1;
			}
		};
		
		return new priceComparatorDescending();
	}
	
	class codeComparator implements Comparator<Product>
	{
		public int compare(Product p, Product s)
		{
			return p.code.compareTo(s.code);
		}
	}
	
	public Comparator<Product> getCodeComparator()		//inner class
	{
		return new codeComparator();
	}

}
