package com.tecsup.gestion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Department;
import com.tecsup.gestion.repository.DepartmentDAO;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;

  @Override
	public Department insert(int department_id, String name, String description, String city) throws DAOException, EmptyResultException {

		Department dep = departmentDAO.insertDepartment(department_id, name, description, city);

		return dep;
	}

	@Override
	public Department find(int department_id) throws DAOException, EmptyResultException {

		Department dep = departmentDAO.findDepartment(department_id);

		return dep;
	}

  @Override
	public Department edit(String name, String description) throws DAOException, EmptyResultException {

		Department dep = departmentDAO.editDepartment(name, description);

		return dep;
	}

	@Override
	public Department findName(String name) throws DAOException, EmptyResultException {

		Department dep = departmentDAO.findDepartmentByName(name);

		return dep;
	}

	@Override
	public Department findDescription(String description) throws DAOException, EmptyResultException {

		Department dep = departmentDAO.findDepartmentByDescription(description);

		return dep;
	}

	@Override
	public Department findCity(String city) throws DAOException, EmptyResultException {

		Department dep = departmentDAO.findDepartmentByCity(city);

		return dep;
	}
	
	@Override
	public Department delete(int department_id) throws DAOException, EmptyResultException {

		Department dep = departmentDAO.deleteDepartment(department_id);

		return dep;
	}

}
