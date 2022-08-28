package com.employeesystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeesystem.Repository.EmployeeRepository;
import com.employeesystem.Repository.VO.EmployeeVO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepo;

	@Override
	public EmployeeVO addEmployee(EmployeeVO employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public EmployeeVO updateEmployee(EmployeeVO employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
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
		return employeeRepo.findAll();
	}

}
