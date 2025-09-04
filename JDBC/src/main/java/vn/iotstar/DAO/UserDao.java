package vn.iotstar.DAO;

import vn.iotstar.Models.User;

public interface UserDao {
	User get(String username);
	
	//Đăng ký
	void insert(User user);
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
	boolean checkExistPhone(String phone);
	//
}
