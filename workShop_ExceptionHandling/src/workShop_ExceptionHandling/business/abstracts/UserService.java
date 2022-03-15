package workShop_ExceptionHandling.business.abstracts;
import java.util.ArrayList;

import workShop_ExceptionHandling.core.exceptions.BusinessException;
import workShop_ExceptionHandling.entities.User;

public interface UserService {

	void add(User user) throws BusinessException;
	void update(User user) throws BusinessException;
	void delete(User user);
	ArrayList<String> mailGetAll();
}
