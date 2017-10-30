package labb4;

import java.util.*;

/**
 * 
 */

/**
 * @author douglatr
 *
 */
public class ProductCatalogue implements Iterable<Product> {
	public ProductCatalogue()
	{
		System.out.println("ProductCatalogue class");
	}
	public ArrayList<Product> Products = new ArrayList<Product>();
			
	public void addProduct(String name_, Double price_, int productID_)
	{
		Product product = new Product(name_, price_, productID_);
		Products.add(product);
		
		
		
	}
	
	public void createProductCatalogue(Order order)
	{
		
		
	}
	@Override
	public Iterator<Product> iterator()
	{
		System.out.println("called ProductCatalogue class");
		return Products.iterator();
	}
}
