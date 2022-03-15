package nLayeredApp.business.conctretes;

import nLayeredApp.business.abstarcts.CategoryService;
import nLayeredApp.core.collections.MyArrayList;
import nLayeredApp.dataAccess.abstracts.CategoryDao;
import nLayeredApp.entities.concretes.Category;

public class CategoryManager implements CategoryService{
	
	private CategoryDao categoryDao;

	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		this.categoryDao.add(category);
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		this.categoryDao.update(category);
	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub
		this.categoryDao.delete(category);
	}

	@Override
	public MyArrayList<Category> getAll() {
		// TODO Auto-generated method stub
		return this.categoryDao.getAll();
	}

}
