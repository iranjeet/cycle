package com.cycle.list.dto.requestDto;

import com.cycle.list.constants.Categories;
import com.cycle.list.constants.EndUser;
import com.cycle.list.constants.Gender;
import com.cycle.list.constants.WheelSize;

public class RequestCycleDTO {
	
	private String name,fullModelName,frameMaterial,frontGear,rearGear,
				   geometry,frontWhell,rearWheel,rearBrake,frontBreak,
				   imageUrl,updatedBy,addedBy, description, frontHubs,
				   rearHubs, Saddle, wheels,type_note;
	private Double rating;
	
	private Categories categories;
	
	private EndUser endUser;
	
	private Gender gender;
	
	private WheelSize wheelSize;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullModelName() {
		return fullModelName;
	}

	public void setFullModelName(String fullModelName) {
		this.fullModelName = fullModelName;
	}

	public String getFrameMaterial() {
		return frameMaterial;
	}

	public void setFrameMaterial(String frameMaterial) {
		this.frameMaterial = frameMaterial;
	}

	public String getFrontGear() {
		return frontGear;
	}

	public void setFrontGear(String frontGear) {
		this.frontGear = frontGear;
	}

	public String getRearGear() {
		return rearGear;
	}

	public void setRearGear(String rearGear) {
		this.rearGear = rearGear;
	}

	public String getGeometry() {
		return geometry;
	}

	public void setGeometry(String geometry) {
		this.geometry = geometry;
	}

	public String getFrontWhell() {
		return frontWhell;
	}

	public void setFrontWhell(String frontWhell) {
		this.frontWhell = frontWhell;
	}

	public String getRearWheel() {
		return rearWheel;
	}

	public void setRearWheel(String rearWheel) {
		this.rearWheel = rearWheel;
	}

	public String getRearBrake() {
		return rearBrake;
	}

	public void setRearBrake(String rearBrake) {
		this.rearBrake = rearBrake;
	}

	public String getFrontBreak() {
		return frontBreak;
	}

	public void setFrontBreak(String frontBreak) {
		this.frontBreak = frontBreak;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFrontHubs() {
		return frontHubs;
	}

	public void setFrontHubs(String frontHubs) {
		this.frontHubs = frontHubs;
	}

	public String getRearHubs() {
		return rearHubs;
	}

	public void setRearHubs(String rearHubs) {
		this.rearHubs = rearHubs;
	}

	public String getSaddle() {
		return Saddle;
	}

	public void setSaddle(String saddle) {
		Saddle = saddle;
	}

	public String getWheels() {
		return wheels;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	public String getType_note() {
		return type_note;
	}

	public void setType_note(String type_note) {
		this.type_note = type_note;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public EndUser getEndUser() {
		return endUser;
	}

	public void setEndUser(EndUser endUser) {
		this.endUser = endUser;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public WheelSize getWheelSize() {
		return wheelSize;
	}

	public void setWheelSize(WheelSize wheelSize) {
		this.wheelSize = wheelSize;
	}
	
	

}
