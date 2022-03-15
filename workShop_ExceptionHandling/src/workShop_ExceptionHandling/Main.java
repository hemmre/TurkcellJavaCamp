package workShop_ExceptionHandling;


import workShop_ExceptionHandling.business.concretes.UserManager;
import workShop_ExceptionHandling.core.exceptions.BusinessException;
import workShop_ExceptionHandling.entities.User;
import workShop_ExceptionHandling.dataAccess.concretes.MemoryUserDao;

public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager(new MemoryUserDao());
		
		User user1 = new User( "Emre", "Uzungoz", "emre@gmail.com", "1234567");
		User user2 = new User( "E", "Uzungoz", "emre@gmail.com", "1234567");
		User user3 = new User( "Emre", "Uzun", "e@gmail.com", "123");
		
		
		try {
			userManager.add(user1);
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			userManager.add(user2);
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			userManager.add(user3);
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		userManager.delete(user1);
		
		try {
			userManager.add(user1);
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
	}

}
