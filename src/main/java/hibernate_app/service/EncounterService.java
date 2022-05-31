package hibernate_app.service;

import java.util.List;

import hibernate_app.dto.EncounterDto;

public interface EncounterService {
	boolean saveEncounter(int person_id,int branch_id,EncounterDto encounter);;
	EncounterDto getEncounterById(int id);
	boolean removeEncounter(int id);
	boolean modifyEncounter(int id,EncounterDto encounter);
	List<EncounterDto> getAllEncounterByPerson(int person_id);
	List<EncounterDto> getAllEncounterByBranch(int branch_id);
	List<EncounterDto> getAllEncounterByStatus(String status);
}
