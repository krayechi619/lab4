package labb4;


public class PersonalCustomer extends Customer
{
	
	public PersonalCustomer(String name, String address, float creditRating, float discountRating) {
		super(name, address, creditRating, discountRating);
	}

	private int creditCardNumber;
}