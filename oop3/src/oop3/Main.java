package oop3;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(1,"Elma",12);
		
		ProductManager manager = new ProductManager(new ProductOracleDao());
		manager.add(product);

	}

}
