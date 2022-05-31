package hibernate_app.service;

import hibernate_app.dto.AddressDto;

public interface AddressService {
	boolean saveAddresss(int branch_id ,AddressDto address);
	AddressDto getAddressById(int id);
	boolean removeAddress(int id);
	boolean modifyAddress(int id,AddressDto address);
}
