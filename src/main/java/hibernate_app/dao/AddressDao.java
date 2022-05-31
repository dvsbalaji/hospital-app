package hibernate_app.dao;

import hibernate_app.dto.AddressDto;
/*
 * This interface will contains all methods declarations, which required to develop @Entity Address class 
 */
public interface AddressDao {
	boolean saveAddresss(int branch_id ,AddressDto address);
	AddressDto getAddressById(int id);
	boolean removeAddress(int id);
	boolean modifyAddress(int id,AddressDto address);
}
