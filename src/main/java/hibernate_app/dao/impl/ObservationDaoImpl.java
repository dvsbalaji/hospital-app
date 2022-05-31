package hibernate_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_app.dao.ObservationDao;

import hibernate_app.dto.EncounterDto;

import hibernate_app.dto.ObservationDto;

/*
 * ObservationDaoImpl class is used to perform the CRUD operations for ObservationDto class
 */

public class ObservationDaoImpl implements ObservationDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	/*
	 * this method will accept the EncounterDto id and ObservationDto object to persist
	 * the ObservationDto object in database and map the object with EncounterDto id
	 */

	public boolean saveObservation(int encounter_id, ObservationDto observation) {

		EncounterDto dto = entityManager.find(EncounterDto.class, encounter_id);
		observation.setEncounterDto(dto);
		entityTransaction.begin();
		try {
			entityManager.persist(observation);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public ObservationDto getObservationById(int id) {
	
		return entityManager.find(ObservationDto.class, id);
		
	}

	public boolean removeObservation(int id) {
		
		ObservationDto dto= entityManager.find(ObservationDto.class, id);
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

	public boolean modifyObservation(int id ,ObservationDto observation) {
		
		observation.setId(id);
		entityTransaction.begin();
		try {
			entityManager.merge(observation);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	public List<ObservationDto> getAllObservationByEncounter(int encounter_id) {
		
		String sql="select h from ObservationDao h where h.encounterDto.id="+encounter_id;
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

	public List<ObservationDto> getAllObservation() {
		String sql="select h from ObservationDao h " ;
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

}
