package com.employeesystem.ms.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeesystem.ms.Business.EmployeeBusiness;
import com.employeesystem.ms.Repository.VO.EmployeeVO;

// controller should control request and response cycle
// this combines @Controller with @ResponseBody (which serializes the returned object)
@RestController
public class EmployeeController {

	// CRUD - create, read, update, delete employee(s)
	@Autowired
	EmployeeBusiness employeeBusiness;

	@GetMapping("/test")
	public String testPage() {
		return "Hello World";
	}

	// create
	@GetMapping("/add")
	public EmployeeVO addEmployee(@RequestBody EmployeeVO employee) {
		System.out.println(employee);
		return employeeBusiness.addEmployeeToList(employee);
	}

	// read
	@GetMapping("/getAll")
	public List<EmployeeVO> getAllEmployees() {
		List<EmployeeVO> allEmployeesResponse = employeeBusiness.getAllEmployees();
		return allEmployeesResponse;
	}

	@GetMapping("/getById")
	public EmployeeVO getEmployee(@RequestBody EmployeeVO employee) {
		EmployeeVO employeeData = employeeBusiness.getEmployeeById(employee);
		return employeeData;
	}

	// exception handlers
	@ExceptionHandler({ NoSuchElementException.class })
	public ResponseEntity<String> noSuchElementExceptionHandler() {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("This data isn't in our database");
	}

}
