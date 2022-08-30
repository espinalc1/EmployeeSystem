package com.employeesystem.ms.Business;

import java.util.List;
import java.util.NoSuchElementException;

import com.employeeservices.ms.Exception.EmployeeAlreadyExistsException;
import com.employeesystem.ms.Repository.VO.EmployeeVO;

public interface EmployeeBusiness {
	public EmployeeVO addEmployeeToList(EmployeeVO employee) throws EmployeeAlreadyExistsException;
	
	public EmployeeVO updateEmployee(EmployeeVO employee) throws EmployeeAlreadyExistsException;
	
	public void deleteEmployee(EmployeeVO employee) throws IllegalArgumentException;
	
	public EmployeeVO getEmployeeById(EmployeeVO employee) throws NoSuchElementException;

	public EmployeeVO getEmployeeByEmail(EmployeeVO employee) throws NoSuchElementException;
	
	public List<EmployeeVO> getAllEmployees();
}
