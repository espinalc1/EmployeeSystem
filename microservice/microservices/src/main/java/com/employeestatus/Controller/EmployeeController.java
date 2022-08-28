package com.employeestatus.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeesystem.Repository.VO.EmployeeVO;

@RestController // this combines @Controller with @ResponseBody (which serializes the returned object)
public class EmployeeController {
	
	//CRUD - create, read, update, delete employee(s)
	
	@GetMapping("")
	public String handle(EmployeeVO employee) {
		return "";
	}
	
	
}
