package com.employee.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@NotNull
	private String name;
	@NotNull
	private String address;
	@Email
	private String email;
	@NotNull
	@Pattern(regexp = "[6-9]{1}[0-9]{9}" , message =  "Mobile number must have 10 digit format.")
	@Size(min=10,max=10)
	private String phoneNo;
	@NotNull
	private long salary;
	
	@NotNull
	private String department;
	
	
}
