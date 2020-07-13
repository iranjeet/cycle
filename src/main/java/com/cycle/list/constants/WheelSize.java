package com.cycle.list.constants;

public enum WheelSize {
	KID_S("10\""),
	KID_M("12\""),
	KID_L("14\""),
	KID_XL("16\""),
	ADULT_XS("18\""),
	ADULT_S("20\""),
	ADULT_M("24\""),
	ADULT_L("26\""),
	ADULT_XL("27.5\""),
	ADULT_XL2("28\""),
	ADULT_XXL("29\""),
	ADULT_700C("700c");
	   public final String label;
	   
	    private WheelSize(String label) {
	        this.label = label;
	    }

		public String getLabel() {
			return label;
		}
	
}
