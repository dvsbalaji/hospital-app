package hibernate_app.service;

import java.util.List;

import hibernate_app.dto.HospitalDto;

public interface HospitalService {
	boolean createHospital(HospitalDto hospital);
	HospitalDto getHospitalById(int id);
	boolean removeHospital(int id);
	boolean updateHospital(int id,HospitalDto hospital);
	List<HospitalDto> getAllHospital();
}
