package oop3;

public class ProductMsSqlDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("MsSql'e kaydedildi");
		
	}

	@Override
	public void update(Product product) {
		System.out.println("MsSql'e kaydedildi");
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("MsSql'e kaydedildi");
		
	}

	

}
