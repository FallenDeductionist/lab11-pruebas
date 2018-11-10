package com.tecsup.gestion.services;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Employee;

public interface EmployeeService {
	
	Employee find(int employee_id) throws DAOException, EmptyResultException;
	Employee findName(String firstname) throws DAOException, EmptyResultException;
	Employee findLast(String lastname) throws DAOException, EmptyResultException;
	Employee findSalary(int salary) throws DAOException, EmptyResultException;

}
