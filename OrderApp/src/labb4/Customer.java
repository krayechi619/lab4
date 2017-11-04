package labb4;


public class Customer {
	private String name;
	private String address;
	private float creditRating;
	private float discountRating;

	public Customer(String name, String address, float creditRating, float discountRating)
	{
		
		this.name = name;
		this.address = address;
		this.creditRating = creditRating;
		this.discountRating = discountRating;
	}

public float getCreditRating() {
	return creditRating;
}
public String getName() {
	return name;
}
public String getAddress() {
	return address;
}
public float getDiscountRating() {
	return discountRating;
}
}
