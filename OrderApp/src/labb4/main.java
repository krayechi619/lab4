package labb4;

public class main {

	public static void main(String[] args) {
		Customer customer = new Customer("macaliea", "U of R", 0.00f, 0.00f);
		double price = 0.0;
		
		Order order = new Order(customer);
		OrderApplication App = new OrderApplication();

		if (App.createOrder(order)) {
			price = order.calculatePrice();
			System.out.printf("The price of the order is $%.2f\n", price);
		}
	}
}

