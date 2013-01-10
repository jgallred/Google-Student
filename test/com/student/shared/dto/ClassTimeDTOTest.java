package com.student.shared.dto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClassTimeDTOTest {
	
	ClassTimeDTO classTime;

	@Before
	public void setUp() throws Exception {
		classTime = new ClassTimeDTO();
	}

	@Test
	public void testGetStartTime() {
		assertNull(classTime.getStartTime());
	}

	@Test
	public void testSetStartTime() {
		classTime.setStartTime("8:35 AM");		
		assertEquals("8:35 AM", classTime.getStartTime());
		classTime.setStartTime("12:38 PM");		
		assertEquals("12:38 PM", classTime.getStartTime());
	}

	@Test
	public void testGetEndTime() {
		assertNull(classTime.getEndTime());
	}

	@Test
	public void testSetEndTime() {		
		classTime.setEndTime("8:35 AM");		
		assertEquals("8:35 AM", classTime.getEndTime());
		classTime.setEndTime("12:38 PM");		
		assertEquals("12:38 PM", classTime.getEndTime());
	}

	@Test
	public void testGetDays() {
		assertArrayEquals(new String[]{}, classTime.getDays());
	}

	@Test
	public void testSetDays() {
		classTime.setDays(new String[]{"M","T","W","Th","F"});
		assertArrayEquals(new String[]{"M","T","W","Th","F"}, classTime.getDays());
		
		classTime.setDays(new String[]{"M","W","F"});
		assertArrayEquals(new String[]{"M","W","F"}, classTime.getDays());
	}

}
