package workShop_ExceptionHandling.dataAccess.concretes;

import java.util.ArrayList;

import workShop_ExceptionHandling.dataAccess.abstracts.UserDao;
import workShop_ExceptionHandling.entities.User;

public class MemoryUserDao implements UserDao{

	ArrayList<User> users = new ArrayList<User>();
	
	@Override
	public void add(User entity) {
		
		users.add(entity);
		System.out.println(entity.getName() + " " + entity.getLastName() + " eklendi.");
		
	}

	@Override
	public void update(User entity) {

	}

	@Override
	public void delete(User entity) {

		System.out.println(entity.getName() + " " + entity.getLastName() + " silindi.");
		users.remove(entity);
		
	}

	@Override
	public ArrayList<String> mailGetAll() {

		ArrayList<String> eMails = new ArrayList<String>();
		for (User user : users) {
			eMails.add(user.getMail());
		}
		return eMails;
	}
	
	public ArrayList<User> getAll() {
		return users;
	}

}
