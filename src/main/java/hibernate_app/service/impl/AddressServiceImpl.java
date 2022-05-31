package hibernate_app.service.impl;

import hibernate_app.dao.impl.AddressDaoImpl;
import hibernate_app.dto.AddressDto;
import hibernate_app.service.AddressService;


public class AddressServiceImpl implements AddressService {
	AddressDaoImpl dao=new AddressDaoImpl();
	public boolean saveAddresss(int branch_id, AddressDto address) {
		
		if(dao.saveAddresss(branch_id, address)) {
			return dao.saveAddresss(branch_id, address);
		}
		else {
			System.out.println("Branch not saved");
			return false;
		}
	}

	public AddressDto getAddressById(int id) {
		if(dao.getAddressById(id) != null) {
			return dao.getAddressById(id) ;
		}else {
			System.out.println("address not found ");
			return dao.getAddressById(id) ;
		}
	}

	public boolean removeAddress(int id) {
		if(dao.removeAddress(id)) {
			return dao.removeAddress(id) ;
		}else {
			System.out.println("address not get removed");
			return dao.removeAddress(id) ;
		}
	}

	public boolean modifyAddress(int id,AddressDto address) {
		if(dao.modifyAddress(id, address)) {
			return dao.modifyAddress(id, address);
		}else {
			System.out.println("address not modified");
			return dao.modifyAddress(id, address) ;
		}
	}

}
