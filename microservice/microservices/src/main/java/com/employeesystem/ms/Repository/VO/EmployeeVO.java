package com.employeesystem.ms.Repository.VO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class EmployeeVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;

	@NotNull
	private String firstname;

	@NotNull
	private String lastname;

	@NotNull
	private String email;
	
	@NotNull
	private String salt;

	private EmployeeVO() {

	}

	public EmployeeVO(Long employeeId, String firstname, String lastname, String email, String salt) {
		super();
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.salt = salt;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

}
