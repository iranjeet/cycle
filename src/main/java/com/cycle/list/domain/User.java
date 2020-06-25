package com.cycle.list.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Id;
@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(generator = "increment",strategy = GenerationType.AUTO )
	@GenericGenerator(name = "increment",strategy = "increment")
	@Column(name="Id")
	private Long Id;
	
	@Column(name="User")
	private String user;
	
	@Column(name="age")
	private Double age;
	
	@Column(name="size")
	private String size ;
	
	
	

}
