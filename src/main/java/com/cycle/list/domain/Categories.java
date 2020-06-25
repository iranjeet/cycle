package com.cycle.list.domain;

import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "categories")
public class Categories {
	
	@Id
	@GeneratedValue(generator = "increment",strategy = GenerationType.AUTO)
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "Id")
	private Long Id;
	
	@Column(name="type")
	private String type;
	
	@Column(name="updated_by")
	private String updatedBy;
	
	@Column(name ="created_date")
	private final Timestamp  created_date= new Timestamp(System.currentTimeMillis());
	
	@Column(name ="Updated_date")
	private Timestamp UpdatedDate =new Timestamp(System.currentTimeMillis());
	
	@Column(name ="added_by")
	private String  addedBy; 
	
	@Column(name="type_note")
	private String typeNote;
	
	@Column(name="description")
	private String description;
	
	@Column(name="ideal_for")
	private String idealFor;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "categories", cascade = CascadeType.ALL)
	private Set<CycleDetails> cycleDetails;
	
	
	
	
	
	
	
}
