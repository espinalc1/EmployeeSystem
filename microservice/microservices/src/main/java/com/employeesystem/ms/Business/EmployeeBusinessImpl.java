package com.employeesystem.ms.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeesystem.ms.Repository.VO.EmployeeVO;
import com.employeesystem.ms.Service.EmployeeService;

// business returns a response to the controller to be forwarded to the client
@Service
public class EmployeeBusinessImpl implements EmployeeBusiness {
	
	@Autowired
	EmployeeService employeeService;

	@Override
	public EmployeeVO addEmployeeToList(EmployeeVO employee) {
		// TODO Auto-generated method stub
		return employeeService.addEmployee(employee);
	}

	@Override
	public EmployeeVO updateEmployee(EmployeeVO employee) {
		// TODO Auto-generated method stub
		return employeeService.addEmployee(employee);
	}

	@Override
	public String deleteEmployee(EmployeeVO employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String readEmployee(EmployeeVO employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeVO> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeService.getAllEmployees();
	}

}
