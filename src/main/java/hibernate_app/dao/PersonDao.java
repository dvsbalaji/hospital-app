package hibernate_app.dao;

import java.util.List;

import hibernate_app.dto.PersonDto;

/*
 * This interface will contains all methods declarations, which required to develop @Entity Person class 
 */

public interface PersonDao {
	boolean savePerson(PersonDto person);
	PersonDto getPersonById(int id);
	boolean removePerson(int id);
	boolean modifyPerson(int id,PersonDto person);
	List<PersonDto> getAllPerson();
}
