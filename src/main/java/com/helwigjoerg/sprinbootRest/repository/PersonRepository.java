package com.helwigjoerg.sprinbootRest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.helwigjoerg.sprinbootRest.model.Person;

 
public interface PersonRepository extends CrudRepository<Person, Integer>,  QueryByExampleExecutor<Person> {
     
     
 
}