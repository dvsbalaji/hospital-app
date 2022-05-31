package hibernate_app.dto;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ObservationDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	private String description ;
	
	private String remarks ;
	
	private LocalDateTime observationTime ;
	
	private String doctorNamme ;
	
	@ManyToOne
	@JoinColumn
	private EncounterDto encounterDto ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public LocalDateTime getObservationTime() {
		return observationTime;
	}

	public void setObservationTime(LocalDateTime observationTime) {
		this.observationTime = observationTime;
	}

	public String getDoctorNamme() {
		return doctorNamme;
	}

	public void setDoctorNamme(String doctorNamme) {
		this.doctorNamme = doctorNamme;
	}

	public EncounterDto getEncounterDto() {
		return encounterDto;
	}

	public void setEncounterDto(EncounterDto encounterDto) {
		this.encounterDto = encounterDto;
	}
	
	
}
