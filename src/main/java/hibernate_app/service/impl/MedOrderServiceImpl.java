package hibernate_app.service.impl;

import java.util.List;

import hibernate_app.dao.impl.MedOrderDaoImpl;
import hibernate_app.dto.MedOrderDto;
import hibernate_app.service.MedOrderService;

public class MedOrderServiceImpl implements MedOrderService{
	MedOrderDaoImpl dao=new MedOrderDaoImpl();
	public boolean saveOrder(int encounter_id, MedOrderDto order) {
		if (dao.saveOrder(encounter_id, order)) {
			return dao.saveOrder(encounter_id, order);
		} else {
			System.out.println("Med_order not saved");
			return false;
		}
	}

	public MedOrderDto getOrderById(int id) {
		if (dao.getOrderById(id) != null) {
			return dao.getOrderById(id) ;
		} else {
			System.out.println("medical orderS not found");
			return null;
		}
	}

	public boolean removeOrder(int id) {
		if (dao.removeOrder(id)) {
			return dao.removeOrder(id);
		} else {
			System.out.println("med order not removed");
			return false;
		}
	}

	public boolean modifyOrder(int id,MedOrderDto med_order) {
		if (dao.modifyOrder(id, med_order)) {
			return dao.modifyOrder(id, med_order);
		} else {
			System.out.println("medical order not updated");
			return false;
		}
	}

	public List<MedOrderDto> getAllOrderByEncounter(int encounter_id) {
		if (dao.getAllOrderByEncounter(encounter_id) != null) {
			return dao.getAllOrderByEncounter(encounter_id);
		} else {
			System.out.println("Med order empty");
			return dao.getAllOrderByEncounter(encounter_id);
		}
	}

	public List<MedOrderDto> getAllOrder() {
		if (dao.getAllOrder() != null) {
			return dao.getAllOrder();
		} else {
			System.out.println("Med order empty");
			return dao.getAllOrder();
		}
	}

}
