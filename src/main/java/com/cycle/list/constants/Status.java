package com.cycle.list.constants;

public enum Status {
	ACTIVE("1001"),
	INACTIVE("1002"),
	SUSPENDED("1003"),
	DELETED("1004"),
	IN_PROGRESS("1005"),
	AUTHORISED("1006"),
	UN_AUTHORISED("1007"),
	REQUESTED("1008");

    public final String label;
 
    private Status(String label) {
        this.label = label;
    }

	public String getLabel() {
		return label;
	}
    
}
