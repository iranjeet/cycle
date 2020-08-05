//package com.cycle.list.domain;
//
//import java.sql.Timestamp;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import org.hibernate.annotations.GenericGenerator;
//import org.springframework.data.annotation.CreatedBy;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedBy;
//import org.springframework.data.annotation.LastModifiedDate;
//
//import com.cycle.list.constants.Status;
//
//@Entity
//@Table(name="assn_brand_cycle")
//public class AssnBrandCycle {
//	@Id
//	@GeneratedValue(generator = "increment",strategy = GenerationType.AUTO )
//	@GenericGenerator(name = "increment",strategy = "increment")
//	@Column(name="Id")
//	private Long Id;
//
//	@ManyToOne
//	@JoinColumn(name = "brands_id")
//	Brands brands;
//
//	@ManyToOne
//	@JoinColumn(name = "cycle_id")
//	Cycle cycle;
//	
//	@CreatedBy
//	@Column(name="created_by")
//	private String createdBy;
//
//	@LastModifiedBy
//	@Column(name="updated_by")
//	private String updatedBy;
//
//	@CreatedDate
//	@Column(name ="created_date")
//	private final Timestamp  created_date= new Timestamp(System.currentTimeMillis());
//
//	@LastModifiedDate
//	@Column(name ="Updated_date")
//	private Timestamp UpdatedDate =new Timestamp(System.currentTimeMillis());
//	
//	@Enumerated(EnumType.STRING)
//	@JoinColumn(name="isActive",columnDefinition = "default 'ACTIVE'")
//	private Status isActive=Status.ACTIVE;
//
//	//---------------------------------------Getter and Setters-------------------------------------------------
//	
//	
//	public Long getId() {
//		return Id;
//	}
//
//	public String getCreatedBy() {
//		return createdBy;
//	}
//
//	public void setCreatedBy(String createdBy) {
//		this.createdBy = createdBy;
//	}
//
//	public String getUpdatedBy() {
//		return updatedBy;
//	}
//
//	public void setUpdatedBy(String updatedBy) {
//		this.updatedBy = updatedBy;
//	}
//
//	public Timestamp getUpdatedDate() {
//		return UpdatedDate;
//	}
//
//	public void setUpdatedDate(Timestamp updatedDate) {
//		UpdatedDate = updatedDate;
//	}
//
//	public Timestamp getCreated_date() {
//		return created_date;
//	}
//
//	public void setId(Long id) {
//		Id = id;
//	}
//
//	public Brands getBrands() {
//		return brands;
//	}
//
//	public void setBrands(Brands brands) {
//		this.brands = brands;
//	}
//
//	public Cycle getCycle() {
//		return cycle;
//	}
//
//	public void setCycle(Cycle cycle) {
//		this.cycle = cycle;
//	}
//
//	public Status getIsActive() {
//		return isActive;
//	}
//
//	public void setIsActive(Status isActive) {
//		this.isActive = isActive;
//	}
//
//
//
//
//}
