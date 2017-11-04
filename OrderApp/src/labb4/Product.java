package labb4;

/**
 * 
 */

/**
 * @author douglatr
 *
 */
public class Product {
	
	private String name;
	private Double price;
	private int productID;
	private int quantity;

	public Product(String name, Double price, int productID, int quantity)
	{
		
		this.name = name;
		this.price = price;
		this.productID = productID;
		this.quantity = quantity;
	}
	
	public String getName()
	{
		
		return this.name;
	}
	
	public Double getPrice()
	{
	
		return price;
	}
	
	public int getProductID()
	{
		
		return productID;
	}
	
	public int getQuantity()
	{
		return this.quantity;
	}
}
