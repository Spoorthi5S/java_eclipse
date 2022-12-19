package com.xwrokz.Place.dto;

public class PlaceDTO extends AbstractAuditDTO {

	private String name;
	private String state;
	private long pincode;
	private boolean trees;
	private String landMark;

	public PlaceDTO() {
		super();
	}

	public PlaceDTO(String name, String state, long pincode, boolean trees, String landMark) {
		super();
		this.name = name;
		this.state = state;
		this.pincode = pincode;
		this.trees = trees;
		this.landMark = landMark;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", state=" + state + ", pincode=" + pincode + ", trees=" + trees
				+ ", landMark=" + landMark + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public boolean isTrees() {
		return trees;
	}

	public void setTrees(boolean trees) {
		this.trees = trees;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

}
