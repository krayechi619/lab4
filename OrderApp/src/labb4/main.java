package labb4;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Customer customer = new Customer("macali", "3277 wascana", 0.00f, 0.00f);
		double price = 0.0;

		Order order = new Order(customer);
		OrderApplication App = new OrderApplication();

		if (App.createOrder(order)) {
			price = order.calculatePrice();
			System.out.printf("The price of the order is $%.2f\n", price);
		}

		do {
			System.out.printf("The current order is:\n");
			order.printOrder();

			Scanner read = new Scanner(System.in);
			char input = 0;

			do {
				System.out.printf("press x to delete an order line, press y to change quantity: ");
				input = read.next().charAt(0);
			} while ((input != 'x' && input != 'y'));

			if (input == 'x') {
				System.out.printf("Enter the orderline ID to remove: ");
				String index = read.next();

				if (order.removeOrderItem(Integer.parseInt(index) - 1) != null) {
					System.out.printf("order removed");
				}
			}
			
			else if (input == 'y')
			{
				System.out.printf("Enter the orderline ID:" );
				int index = Integer.parseInt(read.next());
				
				if (index <= order.OrderCount() && index != 0)
				{
					System.out.printf("Enter the new quantity: ");
					int quantity = Integer.parseInt(read.next());
					
					order.setQuantity(index - 1,  quantity);
				}
			}
			
		} while (true);
	
	}
}