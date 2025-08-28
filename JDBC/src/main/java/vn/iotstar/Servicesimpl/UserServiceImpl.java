package vn.iotstar.Servicesimpl;

import vn.iotstar.DAO.UserDao;
import vn.iotstar.DAOimpl.UserDAOImpl;
import vn.iotstar.Models.User;
import vn.iotstar.Services.UserService;

public class UserServiceImpl implements UserService {
	UserDao userDao = new UserDAOImpl();
	
	@Override
	public User login(String username, String password) {
	User user = this.get(username);
	if (user != null && password.equals(user.getPassWord())) {
	return user;
	}
	return null;
	}
	
	@Override
	public User get(String username) {
		return userDao.get(username);
	}


}
