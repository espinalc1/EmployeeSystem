package com.employeesystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.employeesystem.Repository.VO.EmployeeVO;

public interface EmployeeRepository extends CrudRepository<EmployeeVO, Long> {

	List<EmployeeVO> findAll();

	List<EmployeeVO> findByLastnameIgnoreCase(String lastname);

	List<EmployeeVO> findByFirstnameIgnoreCase(String firstname);

	List<EmployeeVO> findByEmailIgnoreCase(String email);

}
