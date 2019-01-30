package com.hackaton.utilities;

public enum TimeAvailability {
	Morning("Morning"),
	Afternoons("Afternoons"),
	AllDay("AllDay");
	
	private String name;
	
	private TimeAvailability(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	

}
