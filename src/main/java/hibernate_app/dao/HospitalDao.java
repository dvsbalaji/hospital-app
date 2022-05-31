package hibernate_app.dao;

import java.util.List;

import hibernate_app.dto.HospitalDto;

/*
 * This interface will contains all methods declarations, which required to develop @Entity Hospital class 
 */

public interface HospitalDao {
	boolean createHospital(HospitalDto hospital);
	HospitalDto getHospitalById(int id);
	boolean removeHospital(int id);
	boolean updateHospital(int id,HospitalDto hospital);
	List<HospitalDto> getAllHospital();
}
