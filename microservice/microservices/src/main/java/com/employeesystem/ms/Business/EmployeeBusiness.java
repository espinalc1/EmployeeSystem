package com.employeesystem.ms.Business;

import java.util.List;
import java.util.NoSuchElementException;

import com.employeesystem.ms.Repository.VO.EmployeeVO;

public interface EmployeeBusiness {
	public EmployeeVO addEmployeeToList(EmployeeVO employee);
	
	public EmployeeVO updateEmployee(EmployeeVO employee);
	
	public String deleteEmployee(EmployeeVO employee);
	
	public EmployeeVO getEmployeeById(EmployeeVO employee) throws NoSuchElementException;
	
	public List<EmployeeVO> getAllEmployees();
}
