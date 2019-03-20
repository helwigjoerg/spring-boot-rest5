package com.helwigjoerg.sprinbootRest.controller;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.helwigjoerg.sprinbootRest.model.Person;
import com.helwigjoerg.sprinbootRest.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {
	
	
	@Autowired
	public PersonService personService;
	
	
    @ApiOperation(value = "View a list of available products",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    	    )
	
	
	@GetMapping("/person")
	public Person getPerson(@RequestParam(value="id", defaultValue="1") Integer idPerson) {
		
    	  Optional<Person> optionalPerson = personService.getPerson(idPerson);
    	  
    	  Person person = optionalPerson.get();
    	
    	
    	return person;
				
			
	}
    
    @GetMapping("/persons")
	public List<Person> getPersons() {

		return personService.getAllPerson();

	}
    
    @PostMapping("/person")
	public void addPerson(Person person) {

		 personService.addPerson(person);

	}
	
	
	
	

}
