package com.cycle.list.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="frame_material")
public class FrameMaterial {
	
	@Id
	@GeneratedValue(generator = "increment",strategy = GenerationType.AUTO )
	@GenericGenerator(name = "increment",strategy = "increment")
	@Column(name="Id")
	private Long Id;
	
	@Column(name="name")
	private String name;//carbon , alloy
	
	@Column(name ="image")
	private String imageUrl;
	
	@Column(name ="rating")
	private Double rating;
	
	@Column(name="desity")
	private String desity;
	
	@Column(name="stiffness")
	private String stiffness;
	
	@Column(name ="yeild_strength")
	private String yeildStrength;
	
	@Column(name="elongation")
	private String elongation;
	
	@Column(name ="fatigue_limit")
	private String fatigueLimit;
	
	@Column(name ="description")	
	private String description;
	
	@Column(name="type")
	private String type;//tuss frame , Y foil, folding frame

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

	public String getDesity() {
		return desity;
	}

	public void setDesity(String desity) {
		this.desity = desity;
	}

	public String getStiffness() {
		return stiffness;
	}

	public void setStiffness(String stiffness) {
		this.stiffness = stiffness;
	}

	public String getYeildStrength() {
		return yeildStrength;
	}

	public void setYeildStrength(String yeildStrength) {
		this.yeildStrength = yeildStrength;
	}

	public String getElongation() {
		return elongation;
	}

	public void setElongation(String elongation) {
		this.elongation = elongation;
	}

	public String getFatigueLimit() {
		return fatigueLimit;
	}

	public void setFatigueLimit(String fatigueLimit) {
		this.fatigueLimit = fatigueLimit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	

}
