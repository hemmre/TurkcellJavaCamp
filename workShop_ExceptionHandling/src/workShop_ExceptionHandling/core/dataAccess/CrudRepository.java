package workShop_ExceptionHandling.core.dataAccess;

import java.util.ArrayList;

import workShop_ExceptionHandling.core.concretes.Entity;

public interface CrudRepository<T extends Entity > {
	void add(T entity);
	void update(T entity);
	void delete(T entity);
	ArrayList<String> mailGetAll();
	
}
