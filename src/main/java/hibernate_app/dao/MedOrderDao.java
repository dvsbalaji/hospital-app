package hibernate_app.dao;

import java.util.List;

import hibernate_app.dto.MedOrderDto;

/*
 * This interface will contains all methods declarations, which required to develop @Entity MedOrder class 
 */

public interface MedOrderDao {
	boolean saveOrder(int encounter_id ,MedOrderDto order);
	MedOrderDto getOrderById(int id);
	boolean removeOrder(int id);
	boolean modifyOrder(int id,MedOrderDto med_order);
	List<MedOrderDto> getAllOrderByEncounter(int encounter_id);
	List<MedOrderDto> getAllOrder();
	
}
