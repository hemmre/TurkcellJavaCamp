package oop1;

public class Main {

	public static void main(String[] args) {
		
	
	Product product1 = new Product();//instance creation
								  //default constructor
	product1.setName("IPhone 12");
	System.out.println(product1.getName());
	
	
	Product product2 = new Product(2,"IPhone 13",15000,1500,new String[] {},"128 Gb");
									//parametrizedconstructor
	Customer engin = new IndividualCustomer("1","123456","Engin","Demirog","123");
	Customer turkcell = new CorporateCustomer("2","321654","Turkcell","3215648795");
	
	Customer[] customers = {engin,turkcell};
	//polymorphism
}
}