package com.cycle.list.domain;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="derailleur")
public class Derailleur {
	@Id
	@GenericGenerator(name = "increment",strategy = "increment")
	@GeneratedValue(generator = "increment",strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long Id;
	
	@Column(name ="brand_name")
	private String brandName;
	
	@Column(name = "model_name")
	private String modelName;
	
	@Column(name = "model_number")
	private String modelNumber;
	
	@Column(name ="length")
	private Double length;
	
	@Column(name="height")
	private Double height;
	
	@Column(name="weight")
	private Double weight;
	
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

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
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
