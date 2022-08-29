package com.employeesystem.ms.Service;

import java.util.List;

import com.employeesystem.ms.Repository.VO.EmployeeVO;

public interface EmployeeService {

	public EmployeeVO addEmployee(EmployeeVO employee);

	public EmployeeVO updateEmployee(EmployeeVO employee);

	public String deleteEmployee(EmployeeVO employee);

	public EmployeeVO getEmployeeById(EmployeeVO employee);

	public List<EmployeeVO> getAllEmployees();

}
