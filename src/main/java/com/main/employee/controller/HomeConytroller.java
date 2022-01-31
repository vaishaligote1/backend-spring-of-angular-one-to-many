package com.main.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.employee.Service.Service;
import com.main.employee.model.Employee;

import antlr.collections.List;
@CrossOrigin("*")
@RestController
public class HomeConytroller {
	
	@Autowired
	private Service s;

	@PostMapping("/register")
	public Employee registerdata(@RequestBody Employee e) {
		return s.savedata(e);
	}
	
	@GetMapping("/getalldata")
	public Iterable<Employee> getallemployee()
	{
		return s.getalldata();
	}
	@GetMapping("/login/{email}/{password}")
	public Employee login(@PathVariable("email") String email, @PathVariable("password") String password)
	{
		return s.getemployee(email, password);
	}
	@DeleteMapping("/delete/{id}")
	public boolean deleteemp(@PathVariable("id")Integer id)
	{
		return s.deleteemployee(id);
	}
	@PutMapping("update")
	public Employee updatedata(@RequestBody Employee e) {
		return s.updatedata(e);
	}
	@GetMapping("/edit/{id}")
	public Employee edit(@PathVariable("id")Integer id)
	{
		return s.editdata(id);
	}
}
