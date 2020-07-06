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
	
	
	

}
