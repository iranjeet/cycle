package com.cycle.list.domain;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name  ="Brand")
public class CycleBrands {
	@Id
	@GenericGenerator(name = "increment",strategy = "increment")
	@GeneratedValue(generator = "increment",strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long Id;
	
	@Column(name="name")
	private String brandName;
	
	@Column(name="origin")
	private String origin;
	
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
	
	@Column(name="founded_by")
	private String  foundedBy ;
	
	@Column(name="founded_date")
	private String foundeDate;
	
	@Column(name="key_people")
	private Set<String> KeyPeople;
	
	@Column(name="official_website")
	private String websiteUrl;
	
    @Column(name ="official_email")
    private String email;
	
    
	

}
