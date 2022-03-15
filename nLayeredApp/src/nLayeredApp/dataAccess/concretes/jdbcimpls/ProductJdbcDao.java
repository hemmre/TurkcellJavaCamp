package nLayeredApp.dataAccess.concretes.jdbcimpls;

import nLayeredApp.core.collections.MyArrayList;
import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductJdbcDao implements ProductDao{

	MyArrayList<Product> products = new MyArrayList<Product>();
	@Override
	public void add(Product addedProduct) {
		for (int i=0; i<products.size();i++) {
			if(products.get(i).getId() == addedProduct.getId()) {
				System.out.println("Eklenemez");
				return;
			}
		}
		products.add(addedProduct);
		
	}

	@Override
	public void update(Product updatedProduct) {
		for (int i=0; i<products.size();i++) {
			if(products.get(i).getId() == updatedProduct.getId()) {
				products.set(products.indexOf(products.get(i)), updatedProduct);
				System.out.println("Ürün " + products.get(i).getId() + " güncellendi");
				return;
			}
			System.out.println("Güncellenecek ürün bulunamadý");
		}
		
	}

	@Override
	public void delete(Product productToDelete) {
		for (int i=0; i< products.size();i++) {
			if(products.get(i).getId() == productToDelete.getId()) {
				System.out.println("Ürün " + products.get(i).getName() + " silindi");
				products.remove(products.get(i));
				return;
			}
		}
	}

	@Override
	public MyArrayList<Product> getAll() {
		return this.products;
	}

}
