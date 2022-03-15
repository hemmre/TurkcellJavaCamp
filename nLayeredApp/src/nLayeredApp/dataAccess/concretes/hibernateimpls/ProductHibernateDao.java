package nLayeredApp.dataAccess.concretes.hibernateimpls;

import nLayeredApp.core.collections.MyArrayList;
import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductHibernateDao implements ProductDao{

	MyArrayList<Product> products = new MyArrayList<Product>();
	
	@Override
	public void add(Product addedProduct) {
		
		for (int i=0; i<products.size();i++) {
			if(products.get(i).getId() == addedProduct.getId()) {
				System.out.println(addedProduct.getId()+" ayn� ID eklenemez");
				return;
			}
		}
		
		products.add(addedProduct);
		System.out.println(addedProduct.getName()+" eklendi.");
		
	}

	@Override
	public void update(Product updatedProduct) {
		
		for (int i=0; i<products.size();i++) {
			if(products.get(i).getId() == updatedProduct.getId()) {
				products.set(products.indexOf(products.get(i)), updatedProduct);
				System.out.println("�r�n " + products.get(i).getId() + " g�ncellendi");
				return;
			}
			System.out.println("G�ncellenecek �r�n bulunamad�");
		}
	}

	@Override
	public void delete(Product productToDelete) {
		
		for (int i=0; i< products.size();i++) {
			if(products.get(i).getId() == productToDelete.getId()) {
				System.out.println("�r�n " + products.get(i).getName() + " silindi");
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
