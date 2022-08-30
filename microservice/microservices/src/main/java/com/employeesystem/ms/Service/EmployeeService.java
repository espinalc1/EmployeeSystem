package com.employeesystem.ms.Service;

import java.util.List;

import com.employeeservices.ms.Exception.EmployeeAlreadyExistsException;
import com.employeesystem.ms.Repository.VO.EmployeeVO;

public interface EmployeeService {

	public EmployeeVO addEmployee(EmployeeVO employee) throws EmployeeAlreadyExistsException;

	public EmployeeVO updateEmployee(EmployeeVO employee);

	public void deleteEmployee(EmployeeVO employee) throws IllegalArgumentException;

	public EmployeeVO getEmployeeById(EmployeeVO employee);

	public List<EmployeeVO> getAllEmployees();
	
	public EmployeeVO getEmployeeByEmail(EmployeeVO employee);

}
