package com.cycle.list.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.cycle.list.constants.BreakType;

@Entity
@Table(name="break")
public class Break {
	@javax.persistence.Id
	@GeneratedValue(generator = "increment",strategy = GenerationType.AUTO )
	@GenericGenerator(name = "increment",strategy = "increment")
	@Column(name="Id")
	private Long Id;
		
	@Column(name="type")
	private BreakType type;
	
	@Column(name="brand_name")
	private String brandName;
	
	@Column(name = "power")
	private String power;
	
	@Column(name="Description")
	private String Description;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public BreakType getType() {
		return type;
	}

	public void setType(BreakType type) {
		this.type = type;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
	
	
	
	
	

}
