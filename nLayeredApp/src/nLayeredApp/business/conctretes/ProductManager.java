package nLayeredApp.business.conctretes;

import nLayeredApp.business.abstarcts.ProductService;
import nLayeredApp.core.collections.MyArrayList;
import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

//Business (service) class
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		//Business rules
		if(product.getUnitPrice()>0) {
			this.productDao.add(product);
		}	
	}

	@Override
	public void update(Product product) {
		this.productDao.update(product);
	}

	@Override
	public void delete(Product product) {
		this.productDao.delete(product);
	}

	@Override
	public MyArrayList<Product> getAll() {
		
		return this.productDao.getAll();
	}
	
	
}
