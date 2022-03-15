package oop3;

//Business (service) class
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		this.productDao.add(product);
		System.out.println("Ürün eklendi");		
	}

	@Override
	public void update(Product product) {
		System.out.println("Ürün güncellendi");
	}

	@Override
	public void delete(Product product) {
		System.out.println("Ürün silindi");
	}
	
	
}
