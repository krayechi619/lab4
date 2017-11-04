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
	private ArrayList<Product> Products = new ArrayList<Product>();
	
	public ProductCatalogue()
	{
		
	}
	
	public void addProduct(String name, Double price, int productID, int quantity)
	{
		
		
		Product product = new Product(name, price, productID, quantity);
		Products.add(product);
	}
	
	
	public Iterator<Product> iterator()
	{
		return Products.iterator();
	}
}
