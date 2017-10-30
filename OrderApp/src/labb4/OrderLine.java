package labb4;

/**
 * 
 */

/**
 * @author douglatr
 *
 */
public class OrderLine {
private int quantity;
private double price;
private Product product;

public OrderLine( Product product, int quantity, double price) {
	this.product = product;
	this.quantity = quantity;
	this.price = price;
}
public Product getProduct() {
	return product;
}
public int getQuantity() {
	return quantity;
}
public double getPrice() {
	return price;
}
}
