package vn.iotstar.Services;

import vn.iotstar.Models.User;

public interface UserService {
	User login(String username, String password);
	User get(String username);
}
