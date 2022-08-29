package com.employeesystem.ms.Business;

import java.util.List;

import com.employeesystem.ms.Repository.VO.EmployeeVO;

public interface EmployeeBusiness {
	public EmployeeVO addEmployeeToList(EmployeeVO employee);
	
	public EmployeeVO updateEmployee(EmployeeVO employee);
	
	public String deleteEmployee(EmployeeVO employee);
	
	public String readEmployee(EmployeeVO employee);
	
	public List<EmployeeVO> getAllEmployees();
}
