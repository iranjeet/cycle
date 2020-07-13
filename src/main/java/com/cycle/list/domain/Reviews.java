package com.cycle.list.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="reviews")
public class Reviews {
	
	@Id
	@GeneratedValue(generator = "increment",strategy = GenerationType.AUTO )
	@GenericGenerator(name = "increment",strategy = "increment")
	@Column(name="Id")
	private Long Id;
	
	@Column(name="comment")
	private String comments;
	
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
	
	@ManyToOne
	@JoinColumn(name = "cycle_id")
	Cycle cycle;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedDate() {
		return UpdatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		UpdatedDate = updatedDate;
	}

	public String getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

	public String getTypeNote() {
		return typeNote;
	}

	public void setTypeNote(String typeNote) {
		this.typeNote = typeNote;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Cycle getCycle() {
		return cycle;
	}

	public void setCycle(Cycle cycle) {
		this.cycle = cycle;
	}

	public Timestamp getCreated_date() {
		return created_date;
	}
	
	

}
