package hibernate_app.dao;

import java.util.List;

import hibernate_app.dto.ItemDto;

/*
 * This interface will contains all methods declarations, which required to develop @Entity Item class 
 */

public interface ItemDao {
	boolean saveItem(int med_order_id,ItemDto item);
	ItemDto getItemById(int id);
	boolean removeItem(int id);
	boolean modifyItem(int id,ItemDto item);
	List<ItemDto> getAllItemByOrder(int order_id);
	List<ItemDto> getAllItem();
}
