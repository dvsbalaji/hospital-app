package hibernate_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branchdto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	private String branchName ;
	
	private String email ;
	
	private long phone ;
	
	@ManyToOne
	@JoinColumn
	private HospitalDto hospitalDto ;
	
	@OneToOne(mappedBy = "branchdto")
	private AddressDto addressDto ;
	
	@OneToMany(mappedBy = "branchdto")
	List<EncounterDto> encounters ;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public HospitalDto getHospitalDto() {
		return hospitalDto;
	}

	public void setHospitalDto(HospitalDto hospitalDto) {
		this.hospitalDto = hospitalDto;
	}

	public AddressDto getAddressDto() {
		return addressDto;
	}

	public void setAddressDto(AddressDto addressDto) {
		this.addressDto = addressDto;
	}

	public List<EncounterDto> getEncounters() {
		return encounters;
	}

	public void setEncounters(List<EncounterDto> encounters) {
		this.encounters = encounters;
	}
	
	
	
}
