package com.tecsup.gestion.dao;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Department;
import com.tecsup.gestion.repository.DepartmentDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
@WebAppConfiguration
public class DepartmentDAOTest {

	private static final Logger logger = LoggerFactory.getLogger(DepartmentDAOTest.class);

	@Autowired
	private DepartmentDAO departmentDAO;

	@BeforeClass
	public static void beforeClass() {
		logger.info("test de cada campo de la base de datos");
	}

	@Before
	public void before() {
		logger.info("Empezando una prueba unitaria");
	}

  @Test
	public void testinsertDepartment() {

		try {
		//
			logger.info("MENSAJE DEBUG");
			logger.debug("MENSAJE DEBUG");
			Department dep = departmentDAO.insertDepartment(180, "Mario", "Test from Spring", "LAB 402");
			logger.info(dep.toString());
		}

		catch (EmptyResultException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

		catch (DAOException e) {
			fail(e.getMessage());
		}

	}

	@Test
	public void testFindDepartmentById() {

		try {
		//
			logger.info("MENSAJE DEBUG");
			logger.debug("MENSAJE DEBUG");
			Department dep = departmentDAO.findDepartment(180);
			logger.info(dep.toString());
		}

		catch (EmptyResultException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

		catch (DAOException e) {
			fail(e.getMessage());
		}

	}

	@Test
	public void testFindDepartmentByName() {

		try {
			Department dep = departmentDAO.findDepartmentByName("Mario");
			logger.info(dep.toString());
		}
		catch (EmptyResultException e) {
			e.printStackTrace();
			fail(e.getMessage());
		} catch (DAOException e) {
			fail(e.getMessage());
		}
	}

  @Test
	public void testEditDepartment() {

		try {
		//
			logger.info("MENSAJE DEBUG");
			logger.debug("MENSAJE DEBUG");
			Department dep = departmentDAO.editDepartment("fernando", "Edit from Spring");
			logger.info(dep.toString());
		}

		catch (EmptyResultException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

		catch (DAOException e) {
			fail(e.getMessage());
		}

	}

	@Test
	public void testFindDepartmentByDescription() {

		try {
			Department dep = departmentDAO.findDepartmentByDescription("Edit from Spring");
			logger.info(dep.toString());
		}
		catch (EmptyResultException e) {
			e.printStackTrace();
			fail(e.getMessage());
		} catch (DAOException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindDepartmentByCity() {

		try {
			Department dep = departmentDAO.findDepartmentByCity("LAB 402");
			logger.info(dep.toString());
		}
		catch (EmptyResultException e) {
			e.printStackTrace();
			fail(e.getMessage());
		} catch (DAOException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDeleteDepartment() {

		try {
		//
			logger.info("Eliminado con exito");
			logger.debug("MENSAJE DEBUG");
			Department dep = departmentDAO.deleteDepartment(180);
			logger.info(dep.toString());
		}

		catch (EmptyResultException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

		catch (DAOException e) {
			fail(e.getMessage());
		}

	}

	@After
	public void after() {
		logger.info("Terminando");
	}

	@AfterClass
	public static void afterClass() {
		logger.info("Test de campos completado");
	}


}
