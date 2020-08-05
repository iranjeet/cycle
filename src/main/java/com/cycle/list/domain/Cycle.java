package com.cycle.list.domain;

import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.cycle.list.constants.Categories;
import com.cycle.list.constants.EndUser;
import com.cycle.list.constants.Gender;
import com.cycle.list.constants.WheelSize;


@Entity
@Table(name="cycle")
public class Cycle {
	
	@Id
	@GeneratedValue(generator = "increment",strategy = GenerationType.AUTO )
	@GenericGenerator(name = "increment",strategy = "increment")
	@Column(name="Id")
	private Long Id;
	
	
	
	@Column(name="name")
	private String name;

	@Column(name="full_model_name")
	private String fullModelName;
	
	@Column(name="frame_material")
	private String frameMaterial;
	
	@Column(name ="front_gear")
	private String frontGear;
	
	@Column(name="rear_gear")
	private String rearGear;
	
	@Column(name ="geometry")
	private String geometry;
	
	@Column(name ="front_wheel")
	private String frontWheel;
	
	@Column(name ="rear_wheel")
	private String rearWheel;
	
	@Column(name ="front_break")
	private String frontBreak;
	
	@Column(name ="rear_break")
	private String rearBreak;
	
	@Column(name ="image")
	private String imageUrl;
	
	@Column(name ="rating")
	private Double rating;
		
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
	
	private String frontHubs;
	
	private String rearHubs;
	
	private String Saddle;
	
	private String wheels;
	
	
//	---------------------------------------Mappings---------------@2nd of July 2020-----------------------------
	@Enumerated(EnumType.STRING)
	@Column(name="categories")
	private Categories categories;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "end_user")
	private EndUser endUser;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private Gender gender;
	
	@Enumerated(EnumType.STRING)
	private WheelSize wheelSize;
	
	
	@ManyToOne
	@JoinColumn(name = "brand_id")
	private Brands brands;

	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "cycle")
	private BottomBracket bottomBracket;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "cycle")
	private Chain chain;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "cycleFront")
	private Cassette frontCassette;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "cycleRear")
	private Cassette rearCassette;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "cycleFront")
	private Derailleur frontDerailleur;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "cycleRear")
	private Derailleur rearDerailleur;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "cycle",cascade = CascadeType.ALL)
	private Set<FAQs> faQs;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cycle",cascade = CascadeType.ALL)
	private Set<Reviews> reviews; 


	//---------------------------------------Getter and Setters-------------------------------------------------
	
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

	public String getFullModelName() {
		return fullModelName;
	}

	public void setFullModelName(String fullModelName) {
		this.fullModelName = fullModelName;
	}

	public String getFrameMaterial() {
		return frameMaterial;
	}

	public void setFrameMaterial(String frameMaterial) {
		this.frameMaterial = frameMaterial;
	}

	public String getFrontGear() {
		return frontGear;
	}

	public void setFrontGear(String frontGear) {
		this.frontGear = frontGear;
	}

	public String getRearGear() {
		return rearGear;
	}

	public void setRearGear(String rearGear) {
		this.rearGear = rearGear;
	}

	public String getGeometry() {
		return geometry;
	}

	public void setGeometry(String geometry) {
		this.geometry = geometry;
	}

	public String getFrontWheel() {
		return frontWheel;
	}

	public void setFrontWheel(String frontWheel) {
		this.frontWheel = frontWheel;
	}

	public String getRearWheel() {
		return rearWheel;
	}

	public void setRearWheel(String rearWheel) {
		this.rearWheel = rearWheel;
	}

	public String getFrontBreak() {
		return frontBreak;
	}

	public void setFrontBreak(String frontBreak) {
		this.frontBreak = frontBreak;
	}

	public String getRearBreak() {
		return rearBreak;
	}

	public void setRearBreak(String rearBreak) {
		this.rearBreak = rearBreak;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
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

	public String getFrontHubs() {
		return frontHubs;
	}

	public void setFrontHubs(String frontHubs) {
		this.frontHubs = frontHubs;
	}

	public String getRearHubs() {
		return rearHubs;
	}

	public void setRearHubs(String rearHubs) {
		this.rearHubs = rearHubs;
	}

	public String getSaddle() {
		return Saddle;
	}

	public void setSaddle(String saddle) {
		Saddle = saddle;
	}

	public String getWheels() {
		return wheels;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public EndUser getEndUser() {
		return endUser;
	}

	public void setEndUser(EndUser endUser) {
		this.endUser = endUser;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public WheelSize getWheelSize() {
		return wheelSize;
	}

	public void setWheelSize(WheelSize wheelSize) {
		this.wheelSize = wheelSize;
	}


	public Brands getBrands() {
		return brands;
	}

	public void setBrands(Brands brands) {
		this.brands = brands;
	}

	public Set<Reviews> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Reviews> reviews) {
		this.reviews = reviews;
	}

	public BottomBracket getBottomBracket() {
		return bottomBracket;
	}

	public void setBottomBracket(BottomBracket bottomBracket) {
		this.bottomBracket = bottomBracket;
	}

	public Chain getChain() {
		return chain;
	}

	public void setChain(Chain chain) {
		this.chain = chain;
	}

	public Cassette getFrontCassette() {
		return frontCassette;
	}

	public void setFrontCassette(Cassette frontCassette) {
		this.frontCassette = frontCassette;
	}

	public Cassette getRearCassette() {
		return rearCassette;
	}

	public void setRearCassette(Cassette rearCassette) {
		this.rearCassette = rearCassette;
	}

	public Derailleur getFrontDerailleur() {
		return frontDerailleur;
	}

	public void setFrontDerailleur(Derailleur frontDerailleur) {
		this.frontDerailleur = frontDerailleur;
	}

	public Derailleur getRearDerailleur() {
		return rearDerailleur;
	}

	public void setRearDerailleur(Derailleur rearDerailleur) {
		this.rearDerailleur = rearDerailleur;
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
