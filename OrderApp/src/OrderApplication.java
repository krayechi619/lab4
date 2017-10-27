/**
 * 
 */

/**
 * @author douglatr
 *
 */
public class OrderApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO import our products
		
		OrderApplication oa = new OrderApplication();
		
		
		
		
		
		Order order = new Order();
		
		
		
		
		
		oa.createOrder(order);
		
		
		
		
		
		
	}
	
	
	public void createOrder(Order order)
	{
		
		Product  tablet = new Product();
		tablet.name = "Tablets";
		order.addOrderItem(tablet, 5);
		
		
		
	}
	
	private void importCatalogue()
	{
		
		
	}

}
