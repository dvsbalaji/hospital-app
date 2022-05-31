package hibernate_app.dao;

import java.util.List;

import hibernate_app.dto.EncounterDto;

/*
 * This interface will contains all methods declarations, which required to develop @Entity Encounter class 
 */

public interface EncounterDao {
	boolean saveEncounter(int person_id,int branch_id,EncounterDto encounter);;
	EncounterDto getEncounterById(int id);
	boolean removeEncounter(int id);
	boolean modifyEncounter(int id ,EncounterDto encounter);
	List<EncounterDto> getAllEncounterByPerson(int person_id);
	List<EncounterDto> getAllEncounterByBranch(int branch_id);
	List<EncounterDto> getAllEncounterByStatus(String status);
}
