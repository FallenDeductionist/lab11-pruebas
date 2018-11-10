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
import com.tecsup.gestion.model.Employee;
import com.tecsup.gestion.repository.EmployeeDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
@WebAppConfiguration
public class EmployeeDAOTest {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeDAOTest.class);

	@Autowired
	private EmployeeDAO employeeDAO;

	@BeforeClass
	public static void beforeClass() {
		logger.info("test de cada campo de la base de datos");
	}

	@Before
	public void before() {
		logger.info("Empezando una prueba unitaria");
	}
	
	@Test
	public void testFindEmployeeById() {
		
		try {
		//
			logger.info("MENSAJE DEBUG");
			logger.debug("MENSAJE DEBUG");
			Employee emp = employeeDAO.findEmployee(1363);
			logger.info(emp.toString());
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
	public void testFindEmployeeByFirstName() {
		
		try {
			Employee emp = employeeDAO.findEmployeeByFirstName("Andrea");
			logger.info(emp.toString());
		}
		catch (EmptyResultException e) {
			e.printStackTrace();
			fail(e.getMessage());
		} catch (DAOException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testFindEmployeeByLastName() {
		
		try {
			Employee emp = employeeDAO.findEmployeeByLastName("justo");
			logger.info(emp.toString());
		}
		catch (EmptyResultException e) {
			e.printStackTrace();
			fail(e.getMessage());
		} catch (DAOException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testFindEmployeeBySalary() {
		
		try {
			Employee emp = employeeDAO.findEmployeeBySalary(1234);
			logger.info(emp.toString());
		}
		catch (EmptyResultException e) {
			e.printStackTrace();
			fail(e.getMessage());
		} catch (DAOException e) {
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
