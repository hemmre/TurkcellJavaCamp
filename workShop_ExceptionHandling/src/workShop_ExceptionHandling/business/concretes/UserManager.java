package workShop_ExceptionHandling.business.concretes;

import java.util.ArrayList;
import workShop_ExceptionHandling.business.abstracts.UserService;
import workShop_ExceptionHandling.core.exceptions.BusinessException;
import workShop_ExceptionHandling.dataAccess.abstracts.UserDao;
import workShop_ExceptionHandling.entities.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public void add(User user) throws BusinessException {

		if (	checkMailExist(user.getMail())
				&&checkMail(user.getMail())
				&&checkPasswordLength(user.getPassword())
				&&checkNameLength(user.getName())
				&&checkLastNameLength(user.getLastName())) 
		{
			userDao.add(user);
		}
		
	}

	@Override
	public void update(User user) throws BusinessException {
		if (	checkMailExist(user.getMail())
				&&checkMail(user.getMail())
				&&checkPasswordLength(user.getPassword())) 
		{
			userDao.update(user);
		}
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public ArrayList<String> mailGetAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean checkPasswordLength(String password) throws BusinessException {
		
		if (password.length()<6) {
			throw new BusinessException("Password can not be shorter than 6 char.");
		}
		return true;
				
	}
	public boolean checkNameLength(String name) throws BusinessException {
		
		if (name.length()<2) {
			throw new BusinessException("Name can not be shorter than 2 char.");
		}
		return true;
				
	}
	public boolean checkLastNameLength(String lastName) throws BusinessException {
		
		if (lastName.length()<2) {
			throw new BusinessException("Last Name can not be shorter than 2 char.");
		}
		return true;
				
	}
	public boolean checkMail(String mail) throws BusinessException {
		if(mail.contains("@")) {
			return true;
		}
		else
			throw new BusinessException("Enter a valid e-mail address.");
		
	}
	public boolean checkMailExist(String mail) throws BusinessException {
		if (userDao.mailGetAll().contains(mail)) {
			throw new BusinessException("E-mail already exist.");
		}
		return true;
	}
		
	}
	

