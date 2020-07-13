package com.cycle.list.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="cassette")
public class Cassette {
	@Id
	@GenericGenerator(name = "increment",strategy = "increment")
	@GeneratedValue(generator = "increment",strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long Id;

	@Column(name = "name ")
	private String name;

	@Column(name ="material_used")
	private String materialUsed;

	@Column(name= "brand_name")
	private String brandName;

	@Column(name ="manufacturer")
	private String manufacturer;

	@Column(name ="gear_numbers")
	private Long gearNumbers;

	@Column(name="description")
	private String Description;

	@Column(name ="freewheel_ratio")
	private String freewheelRatio;

	@Column(name= "color")
	private String color;
	//---------------------------Mapping 	8th july 2020
	@OneToOne
	@JoinColumn(name = "front_cassette_id")
	private Cycle cycleFront;

	@OneToOne
	@JoinColumn(name = "rear_cassette_id")
	private Cycle cycleRear;

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

	public String getMaterialUsed() {
		return materialUsed;
	}

	public void setMaterialUsed(String materialUsed) {
		this.materialUsed = materialUsed;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Long getGearNumbers() {
		return gearNumbers;
	}

	public void setGearNumbers(Long gearNumbers) {
		this.gearNumbers = gearNumbers;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getFreewheelRatio() {
		return freewheelRatio;
	}

	public void setFreewheelRatio(String freewheelRatio) {
		this.freewheelRatio = freewheelRatio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Cycle getCycleFront() {
		return cycleFront;
	}

	public void setCycleFront(Cycle cycleFront) {
		this.cycleFront = cycleFront;
	}

	public Cycle getCycleRear() {
		return cycleRear;
	}

	public void setCycleRear(Cycle cycleRear) {
		this.cycleRear = cycleRear;
	}










}
