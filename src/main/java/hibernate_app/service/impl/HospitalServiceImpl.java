package hibernate_app.service.impl;

import java.util.List;


import hibernate_app.dao.impl.HospitalDaoImpl;
import hibernate_app.dto.HospitalDto;
import hibernate_app.service.HospitalService;

public class HospitalServiceImpl implements HospitalService {
	HospitalDaoImpl dao=new HospitalDaoImpl();
	public boolean createHospital(HospitalDto hospital){
		if(dao.createHospital(hospital))
		{
			return dao.createHospital(hospital);
		}
		else {
			System.out.println("hospital not saved");
			return false;
		}
	}
	public HospitalDto getHospitalById(int id) {
		
		if(dao.getHospitalById(id)!=null)
		{
			return dao.getHospitalById(id);
		}
		else {
			System.out.println("hospital not found");
			return null;
		}
	}

	public boolean removeHospital(int id) {
		if(dao.removeHospital(id))
		{
			return dao.removeHospital(id);
		}
		else {
			System.out.println("hospital not removed");
			return false;
		}		
	}

	public boolean updateHospital(int id, HospitalDto hospital) {
		if(dao.updateHospital(id, hospital))
		{
			return dao.updateHospital(id, hospital);
		}
		else {
			System.out.println("hospital not updated");
			return false;
		}	
		
	}

	public List<HospitalDto> getAllHospital() {
		if(dao.getAllHospital()!=null)
		{
			return dao.getAllHospital();
		}
		else {
			System.out.println("no records found");
			return null;
		}	
	}
}
