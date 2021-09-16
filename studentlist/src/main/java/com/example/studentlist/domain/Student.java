package com.example.studentlist.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private long id;
private String firstName, lastName;
public long getId() {
	return id;
}


public Student(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}

public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public void setId(long id) {
	this.id = id;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

}

