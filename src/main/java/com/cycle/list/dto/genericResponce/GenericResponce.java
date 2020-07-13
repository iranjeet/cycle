package com.cycle.list.dto.genericResponce;

public class GenericResponce {
	private Boolean apiSucessStatus;
	private String apiMessage;
	private String details;
	

	public Boolean getApiSucessStatus() {
		return apiSucessStatus;
	}
	public void setApiSucessStatus(Boolean apiSucessStatus) {
		this.apiSucessStatus = apiSucessStatus;
	}
	public String getApiMessage() {
		return apiMessage;
	}
	public void setApiMessage(String apiMessage) {
		this.apiMessage = apiMessage;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	

}
