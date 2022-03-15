package oop2;

import java.util.ArrayList;

public class ProductManager {
	
	//collections
	ArrayList<Product> products = new ArrayList<Product>();
	
	public ProductManager() {
		
	}

	public void add(Product product) {
		this.products.add(product);
	}
	public void delete(Product product) {
		System.out.println("Ürün silindi : "+ product.getName());
	}
	public void update(Product product) {
		System.out.println("Ürün güncellendi : "+ product.getName());
	}
	
	public ArrayList<Product> getAll(){
		return this.products;
	}
}
