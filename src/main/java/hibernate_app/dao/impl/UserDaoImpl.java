package hibernate_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_app.dao.UserDao;
import hibernate_app.dto.UserDto;

/*
 * UserDaoImpl class is used to perform the CRUD operations for UserDto class
 */

public class UserDaoImpl implements UserDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	/*
	 * this method will accept the UserDto object to persist the UserDto object in database 
	 */

	public boolean saveUser(UserDto user) {

		entityTransaction.begin();
		try {
			entityManager.persist(user);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;

	}

	public UserDto getUserById(int id) {

		return entityManager.find(UserDto.class, id);
	}

	public boolean removeUser(int id) {
		UserDto dto = entityManager.find(UserDto.class, id);

		entityTransaction.begin();
		try {
			entityManager.remove(dto);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}
	
	/* 
	 *this method will help to update the existing record in the database by finding the 
	 *id which given and will update with passed address , if there is no existing id then new 
	 *record will get create in database table 
	 */

	public boolean updateUser(int id, UserDto user) {

		user.setId(id);
		entityTransaction.begin();
		try {
			entityManager.merge(user);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public UserDto validateUser(String email, String password) {
		String sql = "SELECT u FROM UserDto u WHERE u.email = ?1 AND u.password = ?2";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);

		List<UserDto> users = query.getResultList();

		return users.get(0);
	}

	public List<UserDto> getAllUser() {
		String sql = "SELECT u FROM UserDto u";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

}
