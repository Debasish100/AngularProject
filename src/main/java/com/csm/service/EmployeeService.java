package com.csm.service;

import java.util.List;

import com.csm.model.Employees;

public interface EmployeeService {

	List<Employees> getEmp();
	Employees seveEmpDetails(Employees e);
	
	List<Employees> deleteEmployee(Long empId);
	
	Employees getEmpById(Long empId);
}
