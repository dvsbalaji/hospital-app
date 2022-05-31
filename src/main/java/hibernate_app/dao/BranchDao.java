package hibernate_app.dao;

import java.util.List;

import hibernate_app.dto.Branchdto;

/*
 * This interface will contains all methods declarations, which required to develop @Entity Branch class 
 */

public interface BranchDao {
	boolean saveBranch(int hospital_id,Branchdto branch);	
	Branchdto getBranchById(int id);
	boolean removeBranch(int id);
	boolean updateBranch(int id,Branchdto branch);
	List<Branchdto> getAllBranchByHospitalId(int hospital_id);
	List<Branchdto> getAllBranch();
}
