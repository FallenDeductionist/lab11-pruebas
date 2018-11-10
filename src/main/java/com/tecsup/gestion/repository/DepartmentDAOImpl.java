package com.tecsup.gestion.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Department;
import com.tecsup.gestion.util.mapper.DepartmentMapper;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

	private static final Logger logger = LoggerFactory.getLogger(DepartmentDAOImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

  @Override
  public Department insertDepartment(int department_id, String name, String description, String city) throws DAOException, EmptyResultException {

    String query = "INSERT INTO departments(department_id, name, description, city) VALUES(?,?,?,?)";

    Object[] params = new Object[] { department_id, name, description, city };

    try {

      jdbcTemplate.update(query, params);
      //

     return null;

    } catch (EmptyResultDataAccessException e) {
      throw new EmptyResultException();
    } catch (Exception e) {
      logger.info("Error: " + e.getMessage());
      throw new DAOException(e.getMessage());
    }
  }

	@Override
	public Department findDepartment(int department_id) throws DAOException, EmptyResultException {

		String query = "SELECT department_id, name, description, city"
				+ " FROM departments WHERE department_id = ?";

		Object[] params = new Object[] { department_id };

		try {

			Department dep = (Department) jdbcTemplate.queryForObject(query, params, new DepartmentMapper());
			//
			return dep;
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public Department findDepartmentByName(String name) throws DAOException, EmptyResultException {

		String query = "SELECT department_id, name, description, city"
				+ " FROM departments WHERE name = ?";

		Object[] params = new Object[] { name };

		try {

			Department dep = (Department) jdbcTemplate.queryForObject(query, params, new DepartmentMapper());
			//
			return dep;
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

  @Override
	public Department editDepartment(String name, String description) throws DAOException, EmptyResultException {

		String query = "UPDATE departments SET name = ?, description= ? WHERE department_id = 180;";
		
		Object[] params = new Object[] { name, description };
		
		try {

		  jdbcTemplate.update(query, params);
			//
			return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public Department findDepartmentByDescription(String description) throws DAOException, EmptyResultException {

		String query = "SELECT department_id, name, description, city"
				+ " FROM departments WHERE description = ?";

		Object[] params = new Object[] { description };

		try {

			Department dep = (Department) jdbcTemplate.queryForObject(query, params, new DepartmentMapper());
			//
			return dep;
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public Department findDepartmentByCity(String city) throws DAOException, EmptyResultException {

		String query = "SELECT department_id, name, description, city"
				+ " FROM departments WHERE city = ?";

		Object[] params = new Object[] { city };

		try {

			Department dep = (Department) jdbcTemplate.queryForObject(query, params, new DepartmentMapper());
			//
			return dep;
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
	
	@Override
	public Department deleteDepartment(int department_id) throws DAOException, EmptyResultException {

		String query = "DELETE FROM departments WHERE department_id=?;";
		
		Object[] params = new Object[] { department_id };
		
		try {

		  jdbcTemplate.update(query, params);
			//
			return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

}
