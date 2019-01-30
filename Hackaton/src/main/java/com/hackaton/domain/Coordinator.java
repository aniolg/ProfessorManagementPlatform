package com.hackaton.domain;

import com.hackaton.utilities.*;

public class Coordinator {
	
	private Integer coordinatorId ;
	private String userCoordinator;
	private String password;
	
	public Coordinator() {
		
	}
	
	public Coordinator(String userCoordinator, String password) {
		this.userCoordinator = userCoordinator;
		this.password = Encryptor.encryptPassword(password);
	}

	public Integer getCoordinatorId() {
		return coordinatorId;
	}

	public String getUserCoordinator() {
		return userCoordinator;
	}

	public String getPassword() {
		return password;
	}
	
	

}
