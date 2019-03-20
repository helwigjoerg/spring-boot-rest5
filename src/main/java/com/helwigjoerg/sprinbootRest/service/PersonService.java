package com.helwigjoerg.sprinbootRest.service;

import java.util.List;
import java.util.Optional;


import com.helwigjoerg.sprinbootRest.model.Person;

public interface PersonService {
	
	
	public  Optional<Person> getPerson (Integer idPerson);
	public List<Person>getAllPerson ();
	public Person addPerson (Person person);
	public Person updatePerson (Person person);
	public void deletePerson (Integer idPerson);

}
