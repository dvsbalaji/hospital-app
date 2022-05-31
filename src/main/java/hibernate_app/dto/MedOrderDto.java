package hibernate_app.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class MedOrderDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	private LocalDateTime orderTime ;
	
	private String status ;
	
	private double total ;
	
	@ManyToOne
	@JoinColumn
	private EncounterDto encounterDto ;
	
	@OneToMany(mappedBy = "medOrderDto" ,cascade = CascadeType.ALL)
	private List<ItemDto> items ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public EncounterDto getEncounterDto() {
		return encounterDto;
	}

	public void setEncounterDto(EncounterDto encounterDto) {
		this.encounterDto = encounterDto;
	}

	public List<ItemDto> getItems() {
		return items;
	}

	public void setItems(List<ItemDto> items) {
		this.items = items;
	}
	
	
	
}
