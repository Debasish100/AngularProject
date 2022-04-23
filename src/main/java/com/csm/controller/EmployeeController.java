package com.csm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.csm.model.Employees;
import com.csm.service.EmployeeService;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/empWeb")
	public List<Employees> getAllEmp() {
		return employeeService.getEmp();
	}

	@PostMapping("/empWeb")
	public String saveEmp(@RequestBody Employees emp) {
		employeeService.seveEmpDetails(emp);
		return "Hi.... "+emp.getEmpName()+" Registration Completed";
	}

	@DeleteMapping("/empWeb/{empId}")
	public List<Employees> updateDeleteEmp(@PathVariable Long empId) {
		return employeeService.deleteEmployee(empId);
	}
	
	@GetMapping("/empWeb/{empId}")
	public Employees editEmp(@PathVariable Long empId) {
		return employeeService.getEmpById(empId);
	}

}
