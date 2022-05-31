package hibernate_app.service;

import java.util.List;

import hibernate_app.dto.MedOrderDto;



public interface MedOrderService {
	boolean saveOrder(int encounter_id ,MedOrderDto order);
	MedOrderDto getOrderById(int id);
	boolean removeOrder(int id);
	boolean modifyOrder(int id,MedOrderDto med_order);
	List<MedOrderDto> getAllOrderByEncounter(int encounter_id);
	List<MedOrderDto> getAllOrder();
	
}
