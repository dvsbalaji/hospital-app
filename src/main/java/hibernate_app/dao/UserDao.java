package hibernate_app.dao;

import java.util.List;

import hibernate_app.dto.UserDto;

/*
 * This interface will contains all methods declarations, which required to develop @Entity User class 
 */

public interface UserDao {
	boolean saveUser(UserDto user);
	UserDto getUserById(int  id);
	boolean removeUser(int id);
	boolean updateUser(int id,UserDto user);
	UserDto validateUser(String email,String password);
	List<UserDto> getAllUser();
}
