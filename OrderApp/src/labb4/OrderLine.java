package labb4;

/**
 * 
 */

/**
 * @author douglatr *
 */
public class OrderLine {
	
	private int quantity;
	private Double price;
	private Product product;
	
	public OrderLine(Product product, int quantity, Double price)
	{
		
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public Product getProduct()
	{
		
		return this.product;
	}
	
	public int getQuantity()
	{
		
		return this.quantity;
	}
	
	public Double getPrice()
	{
		return this.price;
	}
	
	public void setPrice(Double price_)
	{
		this.price = price_;
	}
	
	public void setQuantity(int quantity_)
	{
		this.quantity = quantity_;
	}
}