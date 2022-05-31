package hibernate_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_app.dao.HospitalDao;
import hibernate_app.dto.HospitalDto;

/*
 * HospitalDaoImpl class is mainly used to perform CRUD operations on the HospitalDto class
 */

public class HospitalDaoImpl  implements HospitalDao{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	/*
	 * this method is used to insert passed HospitalDto @Entity to the database
	 */
	
	public boolean createHospital(HospitalDto hospital){

		entityTransaction.begin();
		try {
			entityManager.persist(hospital);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	
	
	public HospitalDto getHospitalById(int id) {
		
		return entityManager.find(HospitalDto.class, id);
	}

	public boolean removeHospital(int id) {
		HospitalDto hospital=entityManager.find(HospitalDto.class, id);
		entityTransaction.begin();
		try {
			entityManager.remove(hospital);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	/*
	 *this method helps to update the existing object with new values 
	 */

	public boolean updateHospital(int id, HospitalDto hospital) {
		hospital.setId(id);
		entityTransaction.begin();
		try {
			entityManager.merge(hospital);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	public List<HospitalDto> getAllHospital() {
		String sql="select h from HospitalDto h";
		
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

}
