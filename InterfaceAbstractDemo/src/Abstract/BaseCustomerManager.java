package Abstract;

import Entities.Customer;

public class BaseCustomerManager {

	
	public void save(Customer customer) throws Exception {
		System.out.println(  customer.getFirstName() + " " + customer.getLastName() + " saved to db  ");
	}
	
}
