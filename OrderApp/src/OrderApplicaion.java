/**
 * 
 */

/**
 * @author douglatr
 *
 */
public class OrderApplicaion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO import our products
		
		OrderApplicaion oa = new OrderApplicaion();
		
		
		
		
		
		Order order = new Order();
		
		
		
		
		
		oa.createOrder(order);
		
		
		
		
		
		
	}
	
	
	public void createOrder(Order order)
	{
		
		Product  tablet = new Product();
		tablet.name = "Tablets";
		order.addOrderItem(tablet, 5);
		
		
		
	}
	
	public void importCatalogue()
	{
		
		
	}

}
