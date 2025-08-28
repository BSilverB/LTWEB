package vn.iotstar.DAO;

import vn.iotstar.Models.User;

public interface UserDao {
	User get(String username);

}
