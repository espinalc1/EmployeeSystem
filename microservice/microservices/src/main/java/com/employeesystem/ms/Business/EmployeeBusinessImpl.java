package com.employeesystem.ms.Business;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeservices.ms.Exception.EmployeeAlreadyExistsException;
import com.employeesystem.ms.Repository.VO.EmployeeVO;
import com.employeesystem.ms.Service.EmployeeService;

// business returns a response to the controller to be forwarded to the client
@Service
public class EmployeeBusinessImpl implements EmployeeBusiness {

	@Autowired
	EmployeeService employeeService;

	@Override
	public EmployeeVO addEmployeeToList(EmployeeVO employee) throws EmployeeAlreadyExistsException {
		// TODO Auto-generated method stub
		// email should be unique
		return employeeService.addEmployee(employee);
	}

	@Override
	public EmployeeVO updateEmployee(EmployeeVO employee) {
		// TODO Auto-generated method stub
		return employeeService.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(EmployeeVO employee) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		employeeService.deleteEmployee(employee);
	}

	@Override
	public EmployeeVO getEmployeeById(EmployeeVO employee) {
		// TODO Auto-generated method stub
		return employeeService.getEmployeeById(employee);
	}

	@Override
	public List<EmployeeVO> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeService.getAllEmployees();
	}

	@Override
	public EmployeeVO getEmployeeByEmail(EmployeeVO employee) throws NoSuchElementException {
		// TODO Auto-generated method stub
		return employeeService.getEmployeeByEmail(employee);
	}

}
