package com.employeeservices.ms.Exception;

public class EmployeeAlreadyExistsException extends Exception {
	private String message;
	
	public EmployeeAlreadyExistsException(String message) {
		
		this.message = message;
	}
	
	public EmployeeAlreadyExistsException() {
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "EmployeeAlreadyExistsException [message=" + message + "]";
	}
	
	
}
