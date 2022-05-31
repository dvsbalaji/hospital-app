package hibernate_app.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class HospitalDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id  ;
	
	private String name  ;
	
	private String registration ;
	
	@OneToMany(mappedBy = "hospitalDto" )
	private List<Branchdto> branches ; 
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public List<Branchdto> getBranches() {
		return branches;
	}

	public void setBranches(List<Branchdto> branches) {
		this.branches = branches;
	}

	
	
	
	
	
	
	
	
}
