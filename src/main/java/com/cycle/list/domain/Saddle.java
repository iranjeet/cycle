package com.cycle.list.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="saddle")
public class Saddle {
	@Id
	@GenericGenerator(name = "increment",strategy = "increment")
	@GeneratedValue(generator = "increment",strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long Id;
	
	private String brand, color, material,manufaturer, Details;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getManufaturer() {
		return manufaturer;
	}

	public void setManufaturer(String manufaturer) {
		this.manufaturer = manufaturer;
	}

	public String getDetails() {
		return Details;
	}

	public void setDetails(String details) {
		Details = details;
	}

}
