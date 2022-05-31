package hibernate_app.service.impl;

import java.util.List;

import hibernate_app.dao.EncounterDao;
import hibernate_app.dao.impl.EncounterDaoImpl;
import hibernate_app.dto.EncounterDto;
import hibernate_app.service.EncounterService;

public class EncounterServiceImpl implements EncounterService {
	EncounterDaoImpl dao=new EncounterDaoImpl();
	public boolean saveEncounter(int person_id, int branch_id, EncounterDto encounter) {
		if (dao.saveEncounter(person_id, branch_id, encounter)) {
			return dao.saveEncounter(person_id, branch_id, encounter);
		} else {
			System.out.println("Encounter not saved");
			return false;
		}
		
	}

	public EncounterDto getEncounterById(int id) {
		if (dao.getEncounterById(id)!=null) {
			return dao.getEncounterById(id);
		} else {
			System.out.println("Encounter not found");
			return null;
		}
	}

	public boolean removeEncounter(int id) {
		if (dao.removeEncounter(id)) {
			return dao.removeEncounter(id);
		} else {
			System.out.println("Encounter not removed");
			return false;
		}
	}

	public boolean modifyEncounter(int id,EncounterDto encounter) {
		if (dao.modifyEncounter(id, encounter)) {
			return dao.modifyEncounter(id, encounter);
		} else {
			System.out.println("Encounter not updated");
			return false;
		}
	}

	public List<EncounterDto> getAllEncounterByPerson(int person_id) {
		if (dao.getAllEncounterByPerson(person_id) != null) {
			return dao.getAllEncounterByPerson(person_id);
		} else {
			System.out.println("Encounter empty");
			return dao.getAllEncounterByPerson(person_id);
		}
	}

	public List<EncounterDto> getAllEncounterByBranch(int branch_id) {
		if (dao.getAllEncounterByBranch(branch_id) != null) {
			return dao.getAllEncounterByBranch(branch_id) ;
		} else {
			System.out.println("Encounter empty");
			return dao.getAllEncounterByBranch(branch_id);
		}
	}

	public List<EncounterDto> getAllEncounterByStatus(String status) {
		if (dao.getAllEncounterByStatus(status) != null) {
			return dao.getAllEncounterByStatus(status) ;
		} else {
			System.out.println("no encounters with given status");
			return dao.getAllEncounterByStatus(status);
		}
	}

}
