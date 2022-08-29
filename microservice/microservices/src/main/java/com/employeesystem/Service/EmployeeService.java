package com.employeesystem.Service;

import java.util.List;

import com.employeesystem.Repository.VO.EmployeeVO;


public interface EmployeeService {

	public EmployeeVO addEmployee(EmployeeVO employee);
	
	public EmployeeVO updateEmployee(EmployeeVO employee);
	
	public String deleteEmployee(EmployeeVO employee);
	
	public String readEmployee(EmployeeVO employee);
	
	public List<EmployeeVO> getAllEmployees();

	
}
