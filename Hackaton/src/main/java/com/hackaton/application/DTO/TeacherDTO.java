package com.hackaton.application.DTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.hackaton.domain.Teacher;
import com.hackaton.utilities.TimeAvailability;
import com.hackaton.utilities.InvalidParamException;

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
	
	public TeacherDTO(Teacher teacher) throws InvalidParamException {
		if(teacher == null)
			throw new InvalidParamException();
		
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

	public String getNameTeacher() throws InvalidParamException {
		if(this.nameTeacher == null || this.nameTeacher.equals(""))
			throw new InvalidParamException();
		return this.nameTeacher;
	}

	public String getSurnameTeacher() throws InvalidParamException {
		if(this.surnameTeacher == null || this.surnameTeacher.equals(""))
			throw new InvalidParamException();
		return surnameTeacher;
	}

	
	public String getDni() throws InvalidParamException {
		if(isValidDni(dni))
		return dni;
		throw new InvalidParamException();
	}
	
	 private boolean isValidDni(String dni) {
         String ePattern = "/^(\\d{8})([A-Z])$/";
         Pattern p = Pattern.compile(ePattern);
         Matcher m = p.matcher(dni);
         return m.matches();       
  }

	public String getBirthDate() throws InvalidParamException {
		if(this.birthDate == null || this.birthDate.equals(""))
			throw new InvalidParamException();
		return birthDate;
	}

	public String getTelefon() throws InvalidParamException {
		if(isValidTelefon(telefon))
			return telefon;
			throw new InvalidParamException();
		
	}
	
	private boolean isValidTelefon(String telefon) {
		String ePattern = "/^[9|6|7][0-9]{8}$/";
		Pattern p = Pattern.compile(ePattern);
        Matcher m = p.matcher(telefon);
        return m.matches();   
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
