package com.AdminSanskar.SanskarAdmin.exception;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
	
	public ResourceNotFoundException() {
		super("Resource Not Found !!!!");
	}

}
