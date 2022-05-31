package hibernate_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_app.dao.PersonDao;
import hibernate_app.dto.PersonDto;

/*
 * PersonDaoImpl class is used to perform the CRUD operations for PersonD class
 */

public class PersonDaoImpl implements PersonDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	/*
	 * this method will accept the PersonDto object to persist the PersonDto object in database 
	 */
	
	public boolean savePerson(PersonDto person) {

		entityTransaction.begin();
		try {
			entityManager.persist(person);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public PersonDto getPersonById(int id) {

		return entityManager.find(PersonDto.class, id);

	}

	public boolean removePerson(int id) {

		PersonDto dto = entityManager.find(PersonDto.class, id);

		entityTransaction.begin();
		try {
			entityManager.remove(dto);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	/* 
	 *this method will help to update the existing record in the database by finding the 
	 *id which given and will update with passed address , if there is no existing id then new 
	 *record will get create in database table 
	 */
	
	public boolean modifyPerson(int id, PersonDto person) {

		person.setId(id);
		entityTransaction.begin();
		try {
			entityManager.merge(person);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<PersonDto> getAllPerson() {
		String sql="select p from PersonDto p";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

}
