package com.employeesystem.ms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeesystem.ms.Business.EmployeeBusiness;
import com.employeesystem.ms.Repository.VO.EmployeeVO;


// controller should control request and response cycle
// this combines @Controller with @ResponseBody (which serializes the returned object)
@RestController
public class EmployeeController {
	
	//CRUD - create, read, update, delete employee(s)
	@Autowired
	EmployeeBusiness employeeBusiness;
	
	@GetMapping("/test")
	public String testPage() {
		return "Hello World";
	}
	
	@GetMapping("/add")
	public EmployeeVO addEmployee(@RequestBody EmployeeVO employee) {
		System.out.println(employee);
		return employeeBusiness.addEmployeeToList(employee);
	}
	
	@GetMapping("/getAll")
	public List<EmployeeVO> getAllEmployees(){
		List<EmployeeVO> allEmployeesResponse = employeeBusiness.getAllEmployees();
		return allEmployeesResponse;
	}
}
