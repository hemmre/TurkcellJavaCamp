package nLayeredApp.business.abstarcts;

import nLayeredApp.core.collections.MyArrayList;
import nLayeredApp.entities.concretes.Product;

public interface ProductService {
	
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	MyArrayList<Product> getAll();

}
