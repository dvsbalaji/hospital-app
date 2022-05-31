package hibernate_app.service;

import java.util.List;

import hibernate_app.dto.ObservationDto;


public interface ObservationService {
	boolean saveObservation(int encounter_id,ObservationDto observation);
	ObservationDto getObservationById(int id);
	boolean removeObservation(int id);
	boolean modifyObservation(int id ,ObservationDto observation);
	List<ObservationDto> getAllObservationByEncounter(int encounter_id);
	List<ObservationDto> getAllObservation();
}
