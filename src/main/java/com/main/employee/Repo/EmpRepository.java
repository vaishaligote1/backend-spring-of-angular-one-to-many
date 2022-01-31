package com.main.employee.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.employee.model.Employee;

@Repository
public interface EmpRepository extends CrudRepository<Employee, Integer> {
	
	Employee findByEmailAndPassword(String email, String password);

}
