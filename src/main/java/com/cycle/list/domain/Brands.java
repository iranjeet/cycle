package com.cycle.list.domain;

import java.sql.Timestamp;
import java.util.Set;
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
//    @Id
//	@GeneratedValue(generator = "UUID",strategy = GenerationType.AUTO)
//    @GenericGenerator(
//            name = "UUID",
//            strategy = "increment"
//    )
//    @Column(name = "uuid", updatable = false, nullable = false ,unique = true,length = 16,columnDefinition = "VARCHAR(255)")
//    private UUID uuid;//=UUID.randomUUID();

	@Column(name="name")
	private String name;

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
	private String foundedDate;

	@Column(name="key_people")
	private String keyPeople;

	@Column(name="official_website")
	private String websiteUrl;

	@Column(name ="official_email")
	private String email;


	@OneToMany(fetch = FetchType.LAZY, mappedBy = "brands",cascade = CascadeType.ALL)
	private Set<Cycle> cycle;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "brands",cascade = CascadeType.ALL)
	private Set<FAQs> faQs;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedDate() {
		return UpdatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		UpdatedDate = updatedDate;
	}

	public String getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

	public String getTypeNote() {
		return typeNote;
	}

	public void setTypeNote(String typeNote) {
		this.typeNote = typeNote;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFoundedBy() {
		return foundedBy;
	}

	public void setFoundedBy(String foundedBy) {
		this.foundedBy = foundedBy;
	}

	public String getFoundedDate() {
		return foundedDate;
	}

	public void setFoundedDate(String foundedDate) {
		this.foundedDate = foundedDate;
	}

	public String getKeyPeople() {
		return keyPeople;
	}

	public void setKeyPeople(String keyPeople) {
		this.keyPeople = keyPeople;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public Set<Cycle> getCycle() {
		return cycle;
	}

	public void setCycle(Set<Cycle> cycle) {
		this.cycle = cycle;
	}

	public Set<FAQs> getFaQs() {
		return faQs;
	}

	public void setFaQs(Set<FAQs> faQs) {
		this.faQs = faQs;
	}

	public Timestamp getCreated_date() {
		return created_date;
	}
	
	

	
	
	



}
