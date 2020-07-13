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
@Table(name = "botton_bracket")
public class BottomBracket {
	@Id
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment", strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long Id;

	@Column
	private String name;

	@Column
	private String material;
	
	@Column
	private Double weight;
	
	@Column
	private String modelNo;
	
	@Column
	private String compatibleWith;
	
	@Column
	private String color;
	
	@Column
	private Double PressFitLength;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "cycle_id", nullable = false)
	private Cycle cycle;

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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getCompatibleWith() {
		return compatibleWith;
	}

	public void setCompatibleWith(String compatibleWith) {
		this.compatibleWith = compatibleWith;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPressFitLength() {
		return PressFitLength;
	}

	public void setPressFitLength(Double pressFitLength) {
		PressFitLength = pressFitLength;
	}

	public Cycle getCycle() {
		return cycle;
	}

	public void setCycle(Cycle cycle) {
		this.cycle = cycle;
	} 
	
	

}
