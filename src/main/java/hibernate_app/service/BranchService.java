package hibernate_app.service;

import java.util.List;

import hibernate_app.dto.Branchdto;


public interface BranchService {
	boolean saveBranch(int hospital_id,Branchdto branch);	
	Branchdto getBranchById(int id);
	boolean removeBranch(int id);
	boolean updateBranch(int id,Branchdto branch);
	List<Branchdto> getAllBranchByHospitalId(int hospital_id);
	List<Branchdto> getAllBranch();
}
