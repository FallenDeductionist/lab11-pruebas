package com.tecsup.gestion.repository;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Employee;

public interface EmployeeDAO {

	Employee findEmployee(int id) throws DAOException, EmptyResultException;
	Employee findEmployeeByFirstName(String firstname) throws DAOException, EmptyResultException;
	Employee findEmployeeByLastName(String lastname) throws DAOException, EmptyResultException;
	Employee findEmployeeBySalary(int salary) throws DAOException, EmptyResultException;

}
