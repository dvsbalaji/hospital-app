package hibernate_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_app.dao.ItemDao;
import hibernate_app.dto.ItemDto;
import hibernate_app.dto.MedOrderDto;

/*
 * ItemDaoImpl class is used to perform the CRUD operations for ItemDto class
 */

public class ItemDaoImpl implements ItemDao{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	/*
	 * this method will accept the MedOrderDto id and ItemhDto object to persist the ItemDto 
	 * object in database and map the object with MedOrderDto id
	 */
	
	public boolean saveItem(int med_order_id, ItemDto item) {
		MedOrderDto order = entityManager.find(MedOrderDto.class, med_order_id);
		item.setMedOrderDto(order);
		entityTransaction.begin();
		try {
			entityManager.persist(item);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public ItemDto getItemById(int id) {
		return entityManager.find(ItemDto.class, id);
	}

	public boolean removeItem(int id) {
		ItemDto dto= entityManager.find(ItemDto.class, id);
		entityTransaction.begin();
		try {
			entityManager.remove(dto);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/* 
	 *this method will help to update the existing record in the database by finding the 
	 *id which given and will update with passed address , if there is no existing id then new 
	 *record will get create in database table 
	 */

	public boolean modifyItem(int id, ItemDto item) {
		item.setId(id);
		entityTransaction.begin();
		try {
			entityManager.merge(item);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<ItemDto> getAllItemByOrder(int order_id) {
		String sql="select h from ItemDto h where h.medOrderDto.id="+order_id;
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

	public List<ItemDto> getAllItem() {
		String sql="select h from ItemDto h";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

}
