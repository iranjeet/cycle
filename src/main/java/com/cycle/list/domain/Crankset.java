package com.cycle.list.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="crank_set")
public class Crankset {
	@Id
	@GenericGenerator(name = "increment",strategy = "increment")
	@GeneratedValue(generator = "increment",strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long Id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="brand")
	private String Brand;
	
	
	private String material;
	
	@Column(name ="gear_combination")
	private Double gearCombination;
	
	private Long teeth;
	
	private Double weight;

	private String details;

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

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Double getGearCombination() {
		return gearCombination;
	}

	public void setGearCombination(Double gearCombination) {
		this.gearCombination = gearCombination;
	}

	public Long getTeeth() {
		return teeth;
	}

	public void setTeeth(Long teeth) {
		this.teeth = teeth;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	
	
	
}
