package hibernate_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_app.dao.EncounterDao;
import hibernate_app.dto.Branchdto;
import hibernate_app.dto.EncounterDto;
import hibernate_app.dto.PersonDto;

/*
 * EncounterDaoImpl class is mainly used to perform CRUD operations on the EncounterDto class
 */

public class EncounterDaoImpl implements EncounterDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	/*
	 * this method will accept the PersonDto id , BranchDto id and EncounterDto object to persist the 
	 * EncounterDto object in database and map the object with both PersonDto id and BranchDto id
	 */
	
	public boolean saveEncounter(int person_id, int branch_id, EncounterDto encounter) {
		
		PersonDto person = entityManager.find(PersonDto.class, person_id) ;
		Branchdto brance = entityManager.find(Branchdto.class, branch_id) ;
		encounter.setPersonDto(person);
		encounter.setBranchdto(brance);
		
		entityTransaction.begin();
		try {
			entityManager.persist(encounter);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public EncounterDto getEncounterById(int id) {
		
		return entityManager.find(EncounterDto.class, id);
	}

	public boolean removeEncounter(int id) {
		
		EncounterDto dto= entityManager.find(EncounterDto.class, id);
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

	public boolean modifyEncounter(int id,EncounterDto encounter) {
		encounter.setId(id);
		entityTransaction.begin();
		try {
			entityManager.merge(encounter);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/*
	 *this method will return all the encounters related a specific person 
	 *have gone through 
	 */
	
	public List<EncounterDto> getAllEncounterByPerson(int person_id) {
		String sql="select h from EncounterDto h where h.personDto.id="+person_id;
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}
	
	/*
	 *this method will return all the encounters related a specific branch 
	 *have gone through 
	 */

	public List<EncounterDto> getAllEncounterByBranch(int branch_id) {
		String sql="select h from EncounterDto h where h.branchdto.id="+branch_id;
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

	public List<EncounterDto> getAllEncounterByStatus(String status) {
		String sql="select h from EncounterDto h where h.status="+status;
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}
	

}
