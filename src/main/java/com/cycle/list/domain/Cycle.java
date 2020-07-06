package com.cycle.list.domain;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;

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
	
	@Column(name="wheel_size")
	private String wheelSize;
	
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
//	---------------------------------------Mappings---------------@2nd of July 2020-----------------------------
	@Column
	private Categories categories;
	
	@ManyToOne
	@JoinColumn(name="brand_id")
	private Brands brands;

	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "cycle")
	private Set<BottomBracket> bottomBracket;
	

}
