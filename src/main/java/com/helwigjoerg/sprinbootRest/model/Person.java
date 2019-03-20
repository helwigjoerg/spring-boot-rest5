package com.helwigjoerg.sprinbootRest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Person {

	
@Id
@GeneratedValue
@Column(nullable = false)
private Integer id;
private String firstName;
private String lastName;
private Integer departmentId;







public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(Integer id, String firstName, String lastName, Integer departmentId) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.departmentId = departmentId;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Integer getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(Integer departmentId) {
	this.departmentId = departmentId;
}



}
