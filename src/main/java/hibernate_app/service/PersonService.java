package hibernate_app.service;

import java.util.List;

import hibernate_app.dto.PersonDto;


public interface PersonService {
	boolean savePerson(PersonDto person);
	PersonDto getPersonById(int id);
	boolean removePerson(int id);
	boolean modifyPerson(int id,PersonDto person);
	List<PersonDto> getAllPerson();
}
