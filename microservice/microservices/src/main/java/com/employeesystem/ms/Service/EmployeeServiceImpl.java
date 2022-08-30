package com.employeesystem.ms.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeservices.ms.Exception.EmployeeAlreadyExistsException;
import com.employeesystem.ms.Repository.EmployeeRepository;
import com.employeesystem.ms.Repository.VO.EmployeeVO;

// can validate the data
// create error handlers
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepo;

	@Override
	public EmployeeVO addEmployee(EmployeeVO employee) throws EmployeeAlreadyExistsException {
		// TODO Auto-generated method stub
		Optional<EmployeeVO> currentEmployeeWithEmail = employeeRepo.findByEmailIgnoreCase(employee.getEmail());
		if (currentEmployeeWithEmail.isPresent()) {
			throw new EmployeeAlreadyExistsException("This Employee already exists in our system");
		}
		return employeeRepo.save(employee);
	}

	@Override
	public EmployeeVO updateEmployee(EmployeeVO employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public void deleteEmployee(EmployeeVO employee) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		employeeRepo.delete(employee);
	}

	@Override
	public EmployeeVO getEmployeeById(EmployeeVO employee) {
		// TODO Auto-generated method stub
		Optional<EmployeeVO> employeeFromRepo = employeeRepo.findById(employee.getEmployeeId());
		return employeeFromRepo.orElseThrow();

	}

	@Override
	public List<EmployeeVO> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public EmployeeVO getEmployeeByEmail(EmployeeVO employee) {
		// TODO Auto-generated method stub
		Optional<EmployeeVO> employeeFromRepo = employeeRepo.findByEmailIgnoreCase(employee.getEmail());
		return employeeFromRepo.orElseThrow();
	}

}
