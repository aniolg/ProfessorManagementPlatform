package com.hackaton.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hackaton.application.DTO.TeacherDTO;
import com.hackaton.utilities.InvalidParamException;
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
	
	public Teacher(Coordinator cordinator, TeacherDTO newTechaerDto) throws InvalidParamException {
		if(cordinator == null)
			throw new InvalidParamException();
		
		this.teacherId = newTechaerDto.getTeacherId();
		this.nameTeacher = newTechaerDto.getNameTeacher();
		this.surnameTeacher = newTechaerDto.getSurnameTeacher();
		this.surnameTeacher = newTechaerDto.getDni();
		this.birthDate = newTechaerDto.getBirthDate();
		this.telefon = newTechaerDto.getTelefon();
		this.address = newTechaerDto.getAddress();
		this.timeAvailability = newTechaerDto.getTimeAvailability();
		this.AvailableDays = newTechaerDto.getAvailableDays();
	}	

	public Integer getTeacherId() {
		return teacherId;
	}

	public String getNameTeacher()  {
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
