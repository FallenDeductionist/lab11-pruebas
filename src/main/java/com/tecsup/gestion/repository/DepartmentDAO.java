package com.tecsup.gestion.repository;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Department;

public interface DepartmentDAO {

	Department insertDepartment(int id, String name, String description, String city) throws DAOException, EmptyResultException;
	Department findDepartment(int id) throws DAOException, EmptyResultException;
	Department findDepartmentByName(String name) throws DAOException, EmptyResultException;
	Department editDepartment(String name, String description) throws DAOException, EmptyResultException;
	Department findDepartmentByDescription(String description) throws DAOException, EmptyResultException;
	Department findDepartmentByCity(String city) throws DAOException, EmptyResultException;
	Department deleteDepartment(int id) throws DAOException, EmptyResultException;

}
