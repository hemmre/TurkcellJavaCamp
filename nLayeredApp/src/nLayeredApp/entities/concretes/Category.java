package nLayeredApp.entities.concretes;


import nLayeredApp.core.collections.MyArrayList;
import nLayeredApp.core.concretes.Entity;

public class Category extends Entity{
	
	private int id;
	private String name;
	
	
	private MyArrayList<Product> products;
	
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Category() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public MyArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(MyArrayList<Product> products) {
		this.products = products;
	}

	


}
