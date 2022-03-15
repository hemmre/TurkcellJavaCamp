package nLayeredApp.business.abstarcts;

import nLayeredApp.core.collections.MyArrayList;
import nLayeredApp.entities.concretes.Category;

public interface CategoryService {
	
	void add(Category category);
	void update(Category category);
	void delete(Category category);
	MyArrayList<Category> getAll();
}
