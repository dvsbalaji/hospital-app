package hibernate_app.service;

import java.util.List;

import hibernate_app.dto.ItemDto;



public interface ItemService {
	boolean saveItem(int med_order_id,ItemDto item);
	ItemDto getItemById(int id);
	boolean removeItem(int id);
	boolean modifyItem(int id,ItemDto item);
	List<ItemDto> getAllItemByOrder(int order_id);
	List<ItemDto> getAllItem();
}
