package oop1;

public class Customer {
	
	private String id;
	private String customerNumber;
	public Customer() {
		super();
	}
	public Customer(String id, String customerNumber) {
		super();
		this.id = id;
		this.customerNumber = customerNumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	

}
