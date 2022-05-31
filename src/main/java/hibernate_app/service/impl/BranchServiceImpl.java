package hibernate_app.service.impl;

import java.util.List;

import hibernate_app.dao.impl.BranchDaoImpl;
import hibernate_app.dto.Branchdto;
import hibernate_app.service.BranchService;

public class BranchServiceImpl implements BranchService{

	BranchDaoImpl dao = new BranchDaoImpl();

	public boolean saveBranch(int hospital_id, Branchdto branch) {
		if (dao.saveBranch(hospital_id, branch)) {
			return dao.saveBranch(hospital_id, branch);
		} else {
			System.out.println("Branch not saved");
			return false;
		}
	}

	public Branchdto getBranchById(int id) {
		if (dao.getBranchById(id) != null) {
			return dao.getBranchById(id);
		} else {
			System.out.println("Branch not found");
			return null;
		}
	}

	public boolean removeBranch(int id) {
		if (dao.removeBranch(id)) {
			return dao.removeBranch(id);
		} else {
			System.out.println("Branch not removed");
			return false;
		}
	}

	public boolean updateBranch(int id, Branchdto branch) {
		if (dao.updateBranch(id, branch)) {
			return dao.updateBranch(id, branch);
		} else {
			System.out.println("Branch not updated");
			return false;
		}
	}

	public List<Branchdto> getAllBranchByHospitalId(int hospital_id) {
		if (dao.getAllBranchByHospitalId(hospital_id) != null) {
			return dao.getAllBranchByHospitalId(hospital_id);
		} else {
			System.out.println("Branch empty");
			return dao.getAllBranchByHospitalId(hospital_id);
		}
	}

	public List<Branchdto> getAllBranch() {
		if (dao.getAllBranch() != null) {
			return dao.getAllBranch();
		} else {
			System.out.println("Branch empty");
			return dao.getAllBranch();
		}
	}
}
