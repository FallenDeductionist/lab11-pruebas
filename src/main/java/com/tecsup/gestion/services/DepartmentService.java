package com.tecsup.gestion.services;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Department;

public interface DepartmentService {

	Department insert(int department_id, String name, String description, String city) throws DAOException, EmptyResultException;
	Department find(int department_id) throws DAOException, EmptyResultException;
	Department edit(String name, String description) throws DAOException, EmptyResultException;
	Department findName(String name) throws DAOException, EmptyResultException;
	Department findDescription(String description) throws DAOException, EmptyResultException;
	Department findCity(String city) throws DAOException, EmptyResultException;
	Department delete(int department_id) throws DAOException, EmptyResultException;

}
