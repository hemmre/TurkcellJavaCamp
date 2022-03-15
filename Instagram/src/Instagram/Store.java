package Instagram;

public class Store {

	private int id;
	private String productName;
	private String productImage;
	private String description;
	private double price;
	private double discount;
	private double discountedPrice;
	
	public Store() {
		super();
	}

	public Store(int id, String productName, String productImage, String description, double price, double discount,
			double discountedPrice) {
		super();
		this.id = id;
		this.productName = productName;
		this.productImage = productImage;
		this.description = description;
		this.price = price;
		this.discount = discount;
		this.discountedPrice = discountedPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getDiscountedPrice() {
		discountedPrice = price - discount;
		return discountedPrice;
	}
	
}
