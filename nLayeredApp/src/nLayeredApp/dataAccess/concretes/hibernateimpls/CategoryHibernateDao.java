package nLayeredApp.dataAccess.concretes.hibernateimpls;

import nLayeredApp.core.collections.MyArrayList;
import nLayeredApp.dataAccess.abstracts.CategoryDao;
import nLayeredApp.entities.concretes.Category;

public class CategoryHibernateDao implements CategoryDao{

	MyArrayList<Category> categories = new MyArrayList<Category>();

	@Override
	public void add(Category addedCategory) {

		for (int i=0; i<categories.size();i++) {
			if(categories.get(i).getId() == addedCategory.getId()) {
				System.out.println(addedCategory.getId()+" ayný ID eklenemez");
				return;
			}
		}
		categories.add(addedCategory);
		System.out.println(addedCategory.getName()+" eklendi.");
		
	}

	@Override
	public void update(Category updatedCategory) {

		for (int i=0; i<categories.size();i++) {
			if(categories.get(i).getId() == updatedCategory.getId()) {
				categories.set(categories.indexOf(categories.get(i)), updatedCategory);
				System.out.println("Ürün " + categories.get(i).getId() + " güncellendi");
				return;
			}
			System.out.println("Güncellenecek ürün bulunamadý");
		}
		
	}

	@Override
	public void delete(Category categoryToDelete) {

		for (int i=0; i< categories.size();i++) {
			if(categories.get(i).getId() == categoryToDelete.getId()) {
				System.out.println("Ürün " + categories.get(i).getName() + " silindi");
				categories.remove(categories.get(i));
				return;
			}
		}
		
	}

	@Override
	public MyArrayList<Category> getAll() {
		
		return this.categories;
	}
	
	

}
