package oop1;

public class IndividualCustomer extends Customer {
	
	
	private String firstName;
	private String lastName;
	private String nationalIdentitiyNumber;
	public IndividualCustomer() {
		super();
	}
	public IndividualCustomer(String id, String customerNumber,String firstName, String lastName, String nationalIdentitiyNumber) {
		super(id,customerNumber);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentitiyNumber = nationalIdentitiyNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalIdentitiyNumber() {
		return nationalIdentitiyNumber;
	}
	public void setNationalIdentitiyNumber(String nationalIdentitiyNumber) {
		this.nationalIdentitiyNumber = nationalIdentitiyNumber;
	}

}
