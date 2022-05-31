package hibernate_app.service.impl;

import java.util.List;


import hibernate_app.dao.impl.PersonDaoImpl;
import hibernate_app.dto.PersonDto;
import hibernate_app.service.PersonService;

public class PersonServiceImpl implements PersonService{

	PersonDaoImpl daoImpl =  new PersonDaoImpl() ; 
	
	public boolean savePerson(PersonDto person) {
		
		if(daoImpl.savePerson(person)) {
			return daoImpl.savePerson(person) ;
		}else {
			System.out.println("person not saved ");
			return daoImpl.savePerson(person) ;
		}
	}

	public PersonDto getPersonById(int id) {

		if(daoImpl.getPersonById(id) != null) {
			return daoImpl.getPersonById(id) ;
		}else {
			System.out.println("no person found ");
			return daoImpl.getPersonById(id) ;
		}

	}

	public boolean removePerson(int id) {

		if(daoImpl.removePerson(id)) {
			return daoImpl.removePerson(id) ;
		}else {
			System.out.println("person not removed");
			return daoImpl.removePerson(id) ;
		}

	}

	public boolean modifyPerson(int id, PersonDto person) {

		if(daoImpl.modifyPerson(id, person)) {
			return daoImpl.modifyPerson(id, person) ;
		}else {
			System.out.println("person not got modified ");
			return daoImpl.modifyPerson(id, person) ;
		}
	}

	public List<PersonDto> getAllPerson() {
		if(daoImpl.getAllPerson() != null) {
			return daoImpl.getAllPerson() ;
		}else {
			System.out.println("no persons found");
			return daoImpl.getAllPerson() ;
		}
	}

}
