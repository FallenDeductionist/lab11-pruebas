package com.tecsup.gestion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Employee;
import com.tecsup.gestion.repository.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public Employee find(int employee_id) throws DAOException, EmptyResultException {
		
		Employee emp = employeeDAO.findEmployee(employee_id);

		return emp;
	}
	
	@Override
	public Employee findName(String firstname) throws DAOException, EmptyResultException {
		
		Employee emp = employeeDAO.findEmployeeByFirstName(firstname);

		return emp;
	}
	
	@Override
	public Employee findLast(String lastname) throws DAOException, EmptyResultException {
		
		Employee emp = employeeDAO.findEmployeeByLastName(lastname);

		return emp;
	}
	
	@Override
	public Employee findSalary(int salary) throws DAOException, EmptyResultException {
		
		Employee emp = employeeDAO.findEmployeeBySalary(salary);

		return emp;
	}

}
