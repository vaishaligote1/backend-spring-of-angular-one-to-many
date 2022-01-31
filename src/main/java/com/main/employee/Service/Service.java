package com.main.employee.Service;

import com.main.employee.model.Employee;

public interface Service {
	
	Employee savedata(Employee e);
	Iterable<Employee> getalldata();
	Employee getemployee(String email, String password);
	boolean deleteemployee(int id);
	Employee updatedata(Employee e);
	Employee editdata(int id );
	
	

}
