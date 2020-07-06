package com.cycle.list.domain;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name  ="brands")
public class Brands {
	@Id
	@GenericGenerator(name = "increment",strategy = "increment")
	@GeneratedValue(generator = "increment",strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long Id;

	@Column(name="name")
	private String brandName;

	@Column(name="origin")
	private String origin;

	@CreatedBy
	@Column(name="created_by")
	private String createdBy;

	@LastModifiedBy
	@Column(name="updated_by")
	private String updatedBy;

	@CreatedDate
	@Column(name ="created_date")
	private final Timestamp  created_date= new Timestamp(System.currentTimeMillis());

	@LastModifiedDate
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
	private String keyPeople;

	@Column(name="official_website")
	private String websiteUrl;

	@Column(name ="official_email")
	private String email;


	@Column// @OneToMany(fetch= FetchType.LAZY,mappedBy = "brands",cascade =CascadeType.ALL)
	private Categories categories;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "brands",cascade = CascadeType.ALL)
	private Set<Cycle> cycle;




}
