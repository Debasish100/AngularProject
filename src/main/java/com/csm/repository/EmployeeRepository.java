package com.csm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.csm.model.Employees;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Long> {

	@Query("FROM Employees e WHERE e.empId =:empId")
	Employees findEmpById(Long empId);
}
