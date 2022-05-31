package hibernate_app.service.impl;

import java.util.List;


import hibernate_app.dao.impl.UserDaoImpl;
import hibernate_app.dto.UserDto;
import hibernate_app.service.UserService;

public class UserServiceImpl implements UserService {

	UserDaoImpl daoImpl = new UserDaoImpl();

	public boolean saveUser(UserDto user) {

		if (daoImpl.saveUser(user)) {
			return daoImpl.saveUser(user);
		} else {
			System.out.println("user not saved");
			return false;
		}

	}

	public UserDto getUserById(int id) {

		if (daoImpl.getUserById(id) != null) {
			return daoImpl.getUserById(id);
		} else {
			System.out.println("user not found");
			return daoImpl.getUserById(id);
		}
	}

	public boolean removeUser(int id) {
		if (daoImpl.removeUser(id)) {
			return daoImpl.removeUser(id);
		} else {
			System.out.println("user not get removed");
			return daoImpl.removeUser(id);
		}
	}

	public boolean updateUser(int id, UserDto user) {

		if (daoImpl.updateUser(id, user)) {
			return daoImpl.updateUser(id, user);
		} else {
			System.out.println("user not updated");
			return daoImpl.updateUser(id, user);
		}

	}

	public UserDto validateUser(String email, String password) {

		if (daoImpl.validateUser(email, password) != null) {
			return daoImpl.validateUser(email, password);
		} else {
			System.out.println("invalid user");
			return daoImpl.validateUser(email, password);
		}
	}

	public List<UserDto> getAllUser() {

		if (!(daoImpl.getAllUser().isEmpty())) {
			return daoImpl.getAllUser();
		}else {
			System.out.println("no users found");
			return daoImpl.getAllUser() ;
		}
	}

}
