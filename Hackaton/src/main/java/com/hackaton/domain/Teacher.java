package com.hackaton.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hackaton.utilities.TimeAvailability;

public class Teacher {
	
	private Integer teacherId;
	private String nameTeacher;
	private String surnameTeacher;
	private String dni;
	private String birthDate;
	private String telefon;
	private String address;
	private TimeAvailability timeAvailability;
	private List<Date> AvailableDays = new ArrayList<>();
	
	private Coordinator coordinator;
	
	public Teacher() {
		
	}
	
	public Teacher(Coordinator cordinator,String dni, String birthDate) {
		
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public String getNameTeacher() {
		return nameTeacher;
	}

	public String getSurnameTeacher() {
		return surnameTeacher;
	}

	public String getDni() {
		return dni;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public String getTelefon() {
		return telefon;
	}

	public String getAddress() {
		return address;
	}

	public TimeAvailability getTimeAvailability() {
		return timeAvailability;
	}

	public List<Date> getAvailableDays() {
		return AvailableDays;
	}

	public Coordinator getCoordinator() {
		return coordinator;
	}	

}
