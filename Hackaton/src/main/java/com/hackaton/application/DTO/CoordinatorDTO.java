package com.hackaton.application.DTO;

import com.hackaton.domain.Coordinator;

public class CoordinatorDTO {
	
	private int coordinatorId ;
	private String userCoordinator;
	private String password;
	
	public CoordinatorDTO(Coordinator coordinator) {
		this.coordinatorId = coordinator.getCoordinatorId();
		this.userCoordinator = coordinator.getUserCoordinator();
		this.password = coordinator.getPassword();
	}

	public int getCoordinatorId() {
		return coordinatorId;
	}

	public String getUserCoordinator() {
		return userCoordinator;
	}

	public String getPassword() {
		return password;
	}
	
	

}
