package com.employeestatus.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeesystem.Business.EmployeeBusiness;
import com.employeesystem.Repository.VO.EmployeeVO;


// controller should control request and response cycle
@RestController // this combines @Controller with @ResponseBody (which serializes the returned object)
@RequestMapping("/employee")
public class EmployeeController {
	
	//CRUD - create, read, update, delete employee(s)
	@Autowired
	EmployeeBusiness employeeBusiness;
	
	@GetMapping("/add")
	public String addEmployee(@RequestBody EmployeeVO employee) {
		return "";
	}
	
	@GetMapping("/getAll")
	public List<EmployeeVO> getAllEmployees(){
		List<EmployeeVO> allEmployeesResponse = employeeBusiness.getAllEmployees();
		return allEmployeesResponse;
	}
}
