/**
 * 
 */
package com.howtodoinjava.JerseyJSONP.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.howtodoinjava.JerseyJSONP.Employee;

import junit.framework.Assert;

/**
 * @author eprmahi
 *
 */
public class EmployeeTest {

	/**
	 * Test method for {@link com.howtodoinjava.JerseyJSONP.Employee#Employee()}.
	 */
	@Test
	public void testEmployee() {
		Employee emp = new Employee();
		assertEquals("Employee ID should be 1", null, emp.getId());
		assertEquals("Employee Name should be Prasad Mahindrakar", null, emp.getName());
	}

	/**
	 * Test method for {@link com.howtodoinjava.JerseyJSONP.Employee#Employee(java.lang.Integer, java.lang.String)}.
	 */
	@Test
	public void testEmployeeIntegerString() {
		Employee emp = new Employee(1, "Prasad Mahindrakar");
		assertEquals("Employee ID should be 1", (Integer) 1, emp.getId());
		assertEquals("Employee Name should be Prasad Mahindrakar", "Prasad Mahindrakar", emp.getName());
		
	}

	/**
	 * Test method for {@link com.howtodoinjava.JerseyJSONP.Employee#getId()}.
	 */
	@Test
	public void testGetId() {
		Employee emp = new Employee(1, "Prasad Mahindrakar");
		assertEquals("Employee ID should be 1", (Integer) 1, emp.getId());
	}

	/**
	 * Test method for {@link com.howtodoinjava.JerseyJSONP.Employee#setId(java.lang.Integer)}.
	 */
	@Test
	public void testSetId() {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Prasad Mahindrakar");
		assertEquals("Employee ID should be 2", (Integer) 2, emp.getId());
	}

	
	/**
	 * Test method for {@link com.howtodoinjava.JerseyJSONP.Employee#getName()}. Prasad
	 */
	@Test
	public void testGetName() {
		Employee emp = new Employee(1, "Prasad Mahindrakar");
		assertEquals("Employee Name should be Prasad Mahindrakar", "Prasad Mahindrakar", emp.getName());	
	}

	/**
	 * Test method for {@link com.howtodoinjava.JerseyJSONP.Employee#setName(java.lang.String)}.
	 */
	@Test
	public void testSetName() {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Prasad Mahindrakar");
		assertEquals("Employee Name should be Prasad Mahindrakar", "Prasad Mahindrakar", emp.getName());
	}

}
