package com.student.shared.dto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SemesterDTOTest {
	
	private SemesterDTO semester;
	
	@Before 
	public void setUp() { 
		semester = new SemesterDTO(); 
    }

	@Test
	public void testGetName() {
		assertEquals("", semester.getName());
		semester.setName("Winter 2012");
		assertEquals("Winter 2012", semester.getName());
	}

	@Test
	public void testSetName() {
		semester.setName("Winter 2012");
		assertEquals("Winter 2012", semester.getName());
		semester.setName("Summer 2013");
		assertEquals("Summer 2013", semester.getName());
	}

	@Test
	public void testGetStartDate() {
		assertEquals(null, semester.getStartDate());
	}

	@Test
	public void testSetStartDate() {
		semester.setStartDate("8/12/2011 12:00 AM");		
		assertEquals("8/12/2011 12:00 AM", semester.getStartDate());
		semester.setStartDate("5/6/2014 6:40 PM");		
		assertEquals("5/6/2014 6:40 PM", semester.getStartDate());
	}

	@Test
	public void testGetEndDate() {
		assertEquals(null, semester.getEndDate());
	}

	@Test
	public void testSetEndDate() {
		semester.setEndDate("8/12/2011 12:00 AM");		
		assertEquals("8/12/2011 12:00 AM", semester.getEndDate());
		semester.setEndDate("5/6/2014 6:40 PM");		
		assertEquals("5/6/2014 6:40 PM", semester.getEndDate());
	}

	@Test
	public void testAreFinalsIncluded() {
		assertFalse(semester.areFinalsIncluded());
		semester.setFinalsIncluded(true);
		assertTrue(semester.areFinalsIncluded());
	}

	@Test
	public void testSetFinalsIncluded() {
		semester.setFinalsIncluded(true);
		assertTrue(semester.areFinalsIncluded());
		semester.setFinalsIncluded(false);
		assertFalse(semester.areFinalsIncluded());
		semester.setFinalsIncluded(false);
		assertFalse(semester.areFinalsIncluded());
	}

	@Test
	public void testGetFinalsStartDate() {
		assertEquals(null, semester.getFinalsStartDate());
	}

	@Test
	public void testSetFinalsStartDate() {
		semester.setFinalsStartDate("8/12/2011 12:00 AM");		
		assertEquals("8/12/2011 12:00 AM", semester.getFinalsStartDate());
		semester.setFinalsStartDate("5/6/2014 6:40 PM");		
		assertEquals("5/6/2014 6:40 PM", semester.getFinalsStartDate());
	}

	@Test
	public void testGetFinalsEndDate() {
		assertEquals(null, semester.getFinalsEndDate());
	}

	@Test
	public void testSetFinalsEndDate() {
		semester.setFinalsEndDate("8/12/2011 12:00 AM");		
		assertEquals("8/12/2011 12:00 AM", semester.getFinalsEndDate());
		semester.setFinalsEndDate("5/6/2014 6:40 PM");		
		assertEquals("5/6/2014 6:40 PM", semester.getFinalsEndDate());
	}

	@Test
	public void testGetCalendarID() {
		assertNull(semester.getCalendarID());
		semester.setCalendarID("dfgd8a7sd9a8sda");
		assertEquals("dfgd8a7sd9a8sda", semester.getCalendarID());
	}

	@Test
	public void testSetCalendarID() {
		semester.setCalendarID("dfgd8a7sd9a8sda");
		assertEquals("dfgd8a7sd9a8sda", semester.getCalendarID());
		semester.setCalendarID("ljkhk56548ghj453k");
		assertEquals("ljkhk56548ghj453k", semester.getCalendarID());
		semester.setCalendarID("a");
		assertEquals("a", semester.getCalendarID());
	}

	@Test
	public void testGetUserID() {
		assertNull(semester.getUserID());
		semester.setUserID("myemail@gmail.com");
		assertEquals("myemail@gmail.com", semester.getUserID());
	}

	@Test
	public void testSetUserID() {
		semester.setUserID("myemail@gmail.com");
		assertEquals("myemail@gmail.com", semester.getUserID());
		semester.setUserID("mail.com");
		assertEquals("mail.com", semester.getUserID());
	}

	@Test
	public void testGetDeletedDate() {
		assertEquals(null, semester.getDeletedDate());
	}

	@Test
	public void testSetDeletedDate() {
		semester.setDeletedDate("8/12/2011 12:00 AM");		
		assertEquals("8/12/2011 12:00 AM", semester.getDeletedDate());
		semester.setDeletedDate("5/6/2014 6:40 PM");		
		assertEquals("5/6/2014 6:40 PM", semester.getDeletedDate());
	}

	@Test
	public void testGetID() {
		assertNull(semester.getID());
		semester.setID("okasd");
		assertEquals("okasd", semester.getID());
	}

	@Test
	public void testSetID() {
		semester.setID("okasd");
		assertEquals("okasd", semester.getID());
		semester.setID("okasdsdfasdf");
		assertEquals("okasdsdfasdf", semester.getID());
	}

}
