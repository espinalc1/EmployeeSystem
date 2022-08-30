package com.employeesystem.ms.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.employeesystem.ms.Repository.VO.EmployeeVO;

public interface EmployeeRepository extends CrudRepository<EmployeeVO, Long> {

	List<EmployeeVO> findAll();

	List<EmployeeVO> findByLastnameIgnoreCase(String lastname);

	List<EmployeeVO> findByFirstnameIgnoreCase(String firstname);

	Optional<EmployeeVO> findByEmailIgnoreCase(String email);

}
