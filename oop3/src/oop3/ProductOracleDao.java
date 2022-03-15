package oop3;

public class ProductOracleDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("Oracle'a kaydedildi");
	}

	@Override
	public void update(Product product) {
		System.out.println("Oracle'a güncellendi");
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("Oracle'a silindi");
		
	}

}
