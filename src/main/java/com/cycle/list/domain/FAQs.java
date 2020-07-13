package com.cycle.list.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.hibernate.annotations.GenericGenerator;

import com.cycle.list.constants.Status;

@Entity
@Table(name="faqs")
public class FAQs {
	@Id
	@GenericGenerator(name = "increment",strategy = "increment")
	@GeneratedValue(generator = "increment",strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long Id;
	
	@Column(name = "question")
	private String Question;
	
	@Column(name="answer")
	private String answer;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "isActive",columnDefinition = "varchar(255) default 'ACTIVE'")
	private Status isActive=Status.ACTIVE;
		
	@ManyToOne
	@JoinColumn(name = "cycle_id")
	Cycle cycle;

	@ManyToOne
	@JoinColumn(name = "brand_id")
	Brands brands;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Status getIsActive() {
		return isActive;
	}

	public void setIsActive(Status isActive) {
		this.isActive = isActive;
	}

	public Cycle getCycle() {
		return cycle;
	}

	public void setCycle(Cycle cycle) {
		this.cycle = cycle;
	}

	public Brands getBrands() {
		return brands;
	}

	public void setBrands(Brands brands) {
		this.brands = brands;
	}
	
	

}
