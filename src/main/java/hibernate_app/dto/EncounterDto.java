package hibernate_app.dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class EncounterDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	private LocalDate admittedDate ;
	
	private String reason ;
	
	private LocalDate dischargedDate ;
	
	private String status ;
	
	@ManyToOne
	@JoinColumn
	private Branchdto branchdto ;
	
	@ManyToOne
	@JoinColumn
	private PersonDto personDto ;
	
	@OneToMany(mappedBy = "encounterDto")
	private List<ObservationDto> observations ;
	
	@OneToMany(mappedBy = "encounterDto")
	private List<MedOrderDto> medOrders ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getAdmittedDate() {
		return admittedDate;
	}

	public void setAdmittedDate(LocalDate admittedDate) {
		this.admittedDate = admittedDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public LocalDate getDischargedDate() {
		return dischargedDate;
	}

	public void setDischargedDate(LocalDate dischargedDate) {
		this.dischargedDate = dischargedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Branchdto getBranchdto() {
		return branchdto;
	}

	public void setBranchdto(Branchdto branchdto) {
		this.branchdto = branchdto;
	}

	public PersonDto getPersonDto() {
		return personDto;
	}

	public void setPersonDto(PersonDto personDto) {
		this.personDto = personDto;
	}

	public List<ObservationDto> getObservations() {
		return observations;
	}

	public void setObservations(List<ObservationDto> observations) {
		this.observations = observations;
	}

	public List<MedOrderDto> getMedOrders() {
		return medOrders;
	}

	public void setMedOrders(List<MedOrderDto> medOrders) {
		this.medOrders = medOrders;
	}
	
	
	
}
