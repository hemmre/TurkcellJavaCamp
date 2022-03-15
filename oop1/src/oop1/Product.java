package oop1;

//access modifier
public class Product {
	//access modifier
	private int id;
	private String name;
	private double unitPrice;
	private double discount;
	private String[] images;
	private String storage;
	private double discountedPrice;
	
	
	//Overloading
	public Product() {
		super();
	}

	public Product(int id, String name, double unitPrice, double discount, String[] images, String storage) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.discount = discount;
		this.images = images;
		this.storage = storage;
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
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String[] getImages() {
		return images;
	}
	public void setImages(String[] images) {
		this.images = images;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public double getDiscountedPrice() {
		return unitPrice-discount;
	}
	

}
