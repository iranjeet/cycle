package com.cycle.list.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="break")
public class Break {
	@javax.persistence.Id
	@GeneratedValue(generator = "increment",strategy = GenerationType.AUTO )
	@GenericGenerator(name = "increment",strategy = "increment")
	@Column(name="Id")
	private Long Id;
	
	
	@Column(name="type")
	private String type;
	
	@Column(name="brand_name")
	private String brandName;
	
	@Column(name = "power")
	private String power;
	
	@Column(name="Description")
	private String Description;
	
	
	
	

}
