package com.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csm.model.Employees;
import com.csm.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employees> getEmp() {
		return employeeRepository.findAll();
	}

	@Override
	public Employees seveEmpDetails(Employees e) {
		return employeeRepository.save(e);
	}

	@Override
	public List<Employees> deleteEmployee(Long empId) {
		employeeRepository.deleteById(empId);
		return employeeRepository.findAll();
	}

	@Override
	public Employees getEmpById(Long empId) {
		return employeeRepository.findEmpById(empId);
	}
}
