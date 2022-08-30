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

import com.employeeservices.ms.Exception.EmployeeAlreadyExistsException;
import com.employeesystem.ms.Business.EmployeeBusiness;
import com.employeesystem.ms.Repository.VO.EmployeeVO;

// controller should control request and response cycle
// this combines @Controller with @ResponseBody (which serializes the returned object)
@RestController
public class EmployeeController {

	// CRUD - create, read, update, delete employee(s)
	@Autowired
	EmployeeBusiness employeeBusiness;

	// create
	/**
	 * Should Validate the following: - email is unique - email follows typical
	 * email conventions
	 */
	@GetMapping("/add")
	public EmployeeVO addEmployee(@RequestBody EmployeeVO employee) throws EmployeeAlreadyExistsException {
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

	@GetMapping("/getByEmail")
	public EmployeeVO getEmployeeByEmail(@RequestBody EmployeeVO employee) {
		EmployeeVO employeeData = employeeBusiness.getEmployeeByEmail(employee);
		return employeeData;
	}
	
	@GetMapping("/delete")
	public ResponseEntity<String> deleteEmployee(EmployeeVO employee){
		// delete an employee successfully
		try {
			employeeBusiness.deleteEmployee(employee);
		} catch (IllegalArgumentException exception) {
			return ResponseEntity.ok().body("Employee not in our system");			
		}
		return ResponseEntity.ok().body("Employee deleted");			
		
		// no such employee exists in our system
	}

	// exception handlers
	@ExceptionHandler({ NoSuchElementException.class })
	public ResponseEntity<String> noSuchElementExceptionHandler() {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("This data isn't in our database");
	}

	@ExceptionHandler({ EmployeeAlreadyExistsException.class })
	public ResponseEntity<String> employeeAlreadyExistsExceptionHandler() {
		return ResponseEntity.status(HttpStatus.CONFLICT).body("This employee is already in our database");
	}

}
