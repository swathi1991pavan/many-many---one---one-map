package com.cglia.mmoomappings.model;



import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "ADDRESS_TBL")
public class Address {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String city;
	private String state;
	
	@OneToOne(mappedBy = "address"/*,fetch = FetchType.LAZY*/)
	@JsonBackReference
	private Student student;
	
	public Address() {
		//super();
	}
	
	public Address(Integer id, String city, String state) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer Id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}

