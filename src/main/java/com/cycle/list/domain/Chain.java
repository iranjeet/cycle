package com.cycle.list.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="chain")
public class Chain {
	@Id
	@GenericGenerator(name = "increment",strategy = "increment")
	@GeneratedValue(generator = "increment",strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long Id;
	
	@Column(name="name")
	private String name;
	
	private String Brand;
	
	private String Material;
	
	private String Color;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "cycle_id", nullable = false)
	private Cycle cycle;

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
		return Material;
	}

	public void setMaterial(String material) {
		Material = material;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public Cycle getCycle() {
		return cycle;
	}

	public void setCycle(Cycle cycle) {
		this.cycle = cycle;
	} 
	
	
	
	
	
	

	
}
