package com.hackaton.application.DTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hackaton.domain.Teacher;
import com.hackaton.utilities.TimeAvailability;

public class TeacherDTO {
	
	private int teacherId;
	private String nameTeacher;
	private String surnameTeacher;
	private String dni;
	private String birthDate;
	private String telefon;
	private String address;
	private TimeAvailability timeAvailability;
	private List<Date> AvailableDays = new ArrayList<>();
	
	public TeacherDTO(Teacher teacher) {
		this.teacherId = teacher.getTeacherId();
		this.nameTeacher = teacher.getNameTeacher();
		this.surnameTeacher = teacher.getSurnameTeacher();
		this.dni = teacher.getDni();
		this.birthDate = teacher.getBirthDate();
		this.telefon = teacher.getTelefon();
		this.address = teacher.getAddress();
		this.timeAvailability = teacher.getTimeAvailability();
		this.AvailableDays = teacher.getAvailableDays();
	}

	public int getTeacherId() {
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
	
	

}
