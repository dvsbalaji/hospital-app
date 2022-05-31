package hibernate_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	private String name  ;
	
	private double cost ;
	
	private String type ;
	
	@ManyToOne
	@JoinColumn
	private MedOrderDto medOrderDto ;

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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public MedOrderDto getMedOrderDto() {
		return medOrderDto;
	}

	public void setMedOrderDto(MedOrderDto medOrderDto) {
		this.medOrderDto = medOrderDto;
	}
	
	
	
}
