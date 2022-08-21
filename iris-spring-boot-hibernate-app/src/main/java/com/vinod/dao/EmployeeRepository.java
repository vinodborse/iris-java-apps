package com.vinod.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vinod.model.Employee;
import java.lang.String;
import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
	List<Employee> findByCity(String city);
}
