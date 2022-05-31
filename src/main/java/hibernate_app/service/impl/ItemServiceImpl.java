package hibernate_app.service.impl;

import java.util.List;

import hibernate_app.dao.impl.ItemDaoImpl;
import hibernate_app.dto.ItemDto;
import hibernate_app.service.ItemService;

public class ItemServiceImpl implements ItemService{
	ItemDaoImpl dao=new  ItemDaoImpl();
	public boolean saveItem(int med_order_id, ItemDto item) {
		if (dao.saveItem(med_order_id, item)) {
			return dao.saveItem(med_order_id, item);
		} else {
			System.out.println("Item  not saved");
			return false;
		}
	}

	public ItemDto getItemById(int id) {
		if (dao.getItemById(id) != null) {
			return dao.getItemById(id) ;
		} else {
			System.out.println("Item not found");
			return null;
		}
	}

	public boolean removeItem(int id) {
		if (dao.removeItem(id)) {
			return dao.removeItem(id);
		} else {
			System.out.println("Item not removed");
			return false;
		}
	}

	public boolean modifyItem(int id, ItemDto item) {
		if (dao.modifyItem(id, item)) {
			return dao.modifyItem(id, item);
		} else {
			System.out.println("Item not updated");
			return false;
		}
	}

	public List<ItemDto> getAllItemByOrder(int order_id) {
		if (dao.getAllItemByOrder(order_id) != null) {
			return dao.getAllItemByOrder(order_id);
		} else {
			System.out.println("Items empty");
			return dao.getAllItemByOrder(order_id);
		}
	}

	public List<ItemDto> getAllItem() {
		if (dao.getAllItem() != null) {
			return dao.getAllItem();
		} else {
			System.out.println("Items empty");
			return dao.getAllItem();
		}
	}

}
