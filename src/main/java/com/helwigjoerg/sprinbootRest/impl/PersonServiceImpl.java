package com.helwigjoerg.sprinbootRest.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.helwigjoerg.sprinbootRest.model.Person;
import com.helwigjoerg.sprinbootRest.repository.PersonRepository;
import com.helwigjoerg.sprinbootRest.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	
	@Autowired
	PersonRepository personRepository;

	@Override
	public Optional<Person> getPerson(Integer idPerson) {
		// TODO Auto-generated method stub
		return personRepository.findById(idPerson);
	}

	@Override
	public Person addPerson(Person person) {
		// TODO Auto-generated method stub
		return personRepository.save(person);
	}

	@Override
	public Person updatePerson(Person person) {
		// TODO Auto-generated method stub
		return personRepository.save(person);
	}

	@Override
	public void deletePerson(Integer idPerson) {
		// TODO Auto-generated method stub
		 personRepository.deleteById(idPerson);
	}

	@Override
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		
		Iterable<Person> iterable =personRepository.findAll();
		List<Person> targetCollection = new ArrayList<Person>();
		 iterable.forEach(targetCollection::add);
		return targetCollection;
	}

}
