package labb4;


public class Customer {
	private String name;
	private String address;
	private float creditRating;
	private float discountRating;

	public Customer(String name_, String address_, float creditRating_, float discountRating_)
	{
		
		this.name = name_;
		this.address = address_;
		this.creditRating = creditRating_;
		this.discountRating = discountRating_;
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
