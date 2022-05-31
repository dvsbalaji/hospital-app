package hibernate_app.service.impl;

import java.util.List;

import hibernate_app.dao.impl.ObservationDaoImpl;
import hibernate_app.dto.ObservationDto;
import hibernate_app.service.ObservationService;

public class ObservationServiceImpl implements ObservationService {
	ObservationDaoImpl dao=new ObservationDaoImpl();
	public boolean saveObservation(int encounter_id, ObservationDto observation) {
		if (dao.saveObservation(encounter_id, observation)) {
			return dao.saveObservation(encounter_id, observation);
		} else {
			System.out.println("Observation not saved");
			return false;
		}
	}

	public ObservationDto getObservationById(int id) {
		if (dao.getObservationById(id)!= null) {
			return dao.getObservationById(id);
		} else {
			System.out.println("Observation not found");
			return null;
		}
	}

	public boolean removeObservation(int id) {
		if (dao.removeObservation(id)) {
			return dao.removeObservation(id);
		} else {
			System.out.println("Observation not removed");
			return false;
		}
	}

	public boolean modifyObservation(int id, ObservationDto observation) {
		if (dao.modifyObservation(id, observation)) {
			return dao.modifyObservation(id, observation);
		} else {
			System.out.println("Observation not updated");
			return false;
		}
	}

	public List<ObservationDto> getAllObservationByEncounter(int encounter_id) {
		if (dao.getAllObservationByEncounter(encounter_id) != null) {
			return dao.getAllObservationByEncounter(encounter_id) ;
		} else {
			System.out.println("Observation empty");
			return dao.getAllObservationByEncounter(encounter_id) ;
		}
	}

	public List<ObservationDto> getAllObservation() {
		if (dao.getAllObservation() != null) {
			return dao.getAllObservation() ;
		} else {
			System.out.println("Observation empty");
			return dao.getAllObservation() ;
		}
	}

}
