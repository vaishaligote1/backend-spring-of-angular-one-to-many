package com.main.employee.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.employee.Repo.EmpRepository;
import com.main.employee.model.Employee;

@Service
public class ServiveImpl implements com.main.employee.Service.Service {

	@Autowired
	private EmpRepository er;
	@Override
	public Employee savedata(Employee e) {
		// TODO Auto-generated method stub
		return er.save(e);
		
	}
	@Override
	public Iterable<Employee> getalldata() {
		// TODO Auto-generated method stub
		return er.findAll();
	}
	@Override
	public Employee getemployee(String email, String password) {
		// TODO Auto-generated method stub
		Employee e=er.findByEmailAndPassword(email, password);
		if(e.getStatus().equals("active")) {
			return e;
		}else {
			return null;
		}
	}
	@Override
	public boolean deleteemployee(int id) {
		// TODO Auto-generated method stub
		Employee e=(Employee)er.findById(id).get();
		e.setStatus("Deactivate");
		er.save(e);
		return true;
	}
	@Override
	public Employee updatedata(Employee e) {
		// TODO Auto-generated method stub
		return er.save(e);
	}
	@Override
	public Employee editdata(int id) {
		// TODO Auto-generated method stub
		return er.findById(id).get();
	}
	

}
