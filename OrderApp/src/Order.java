import java.util.ArrayList;
import java.util.Date;
/**
 * 
 */

/**
 * @author douglatr
 *
 */
public class Order {
	private Date dateReceived;
	private double price;
	private int orderID;
	
	
	
	
	public Date getDateReceived() 
	{
	   return dateReceived;
	}
	public double calculatePrice() {
		return price;
	}
	public ArrayList<OrderLine> orderLine = new ArrayList<OrderLine>();
	
	
	
	public void addOrderItem(Product product, int quantity)
	{
		
		
		
		
	}
	
	public void createOrder(Order order)
	{
		
		
	}
	

}
