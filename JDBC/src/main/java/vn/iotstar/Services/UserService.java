package vn.iotstar.Services;

import vn.iotstar.Models.User;

public interface UserService {
	//Dang nhap
	User login(String username, String password);
	User get(String username);
	//
	
	//Dang ky
	void insert(User user);
	boolean register(String email, String password, String username, String
	fullname, String phone);
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
	boolean checkExistPhone(String phone);
	//
}
