package nLayeredApp.core.dataAccess;

import nLayeredApp.core.collections.MyArrayList;
import nLayeredApp.core.concretes.Entity;

public interface CrudRepository<T extends Entity> {
	void add(T entity);
	void update(T entity);
	void delete(T entity);
	MyArrayList<T> getAll();

}
