package com.student.shared.dto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CourseDTOTest {
	
	CourseDTO course;

	@Before
	public void setUp() throws Exception {
		course = new CourseDTO();
	}

	@Test
	public void testGetName() {
		assertEquals("", course.getName());
		course.setName("BIO 100");
		assertEquals("BIO 100", course.getName());
	}

	@Test
	public void testSetName() {
		course.setName("BIO 2012");
		assertEquals("BIO 2012", course.getName());
		course.setName("CS 2013");
		assertEquals("CS 2013", course.getName());
	}

	@Test
	public void testGetInstructor() {
		assertEquals("", course.getInstructor());
		course.setInstructor("Rodham");
		assertEquals("Rodham", course.getInstructor());
	}

	@Test
	public void testSetInstructor() {
		course.setInstructor("Rodham");
		assertEquals("Rodham", course.getInstructor());
		course.setInstructor("Mercer");
		assertEquals("Mercer", course.getInstructor());
	}

	@Test
	public void testGetLocation() {
		assertEquals("", course.getLocation());
		course.setLocation("TMCB 100");
		assertEquals("TMCB 100", course.getLocation());
	}

	@Test
	public void testSetLocation() {
		course.setLocation("TMCB 100");
		assertEquals("TMCB 100", course.getLocation());
		course.setLocation("JFSB 100");
		assertEquals("JFSB 100", course.getLocation());
	}

	@Test
	public void testGetSemesterID() {
		assertNull(course.getSemesterID());
	}

	@Test
	public void testSetSemesterID() {
		course.setSemesterID("asdf7as9d7fsad");
		assertEquals("asdf7as9d7fsad", course.getSemesterID());
	}

	@Test
	public void testGetCalendarEventID() {
		assertNull(course.getCalendarEventID());
	}

	@Test
	public void testSetCalendarEventID() {
		course.setCalendarEventID("asdf7as9d7fsad");
		assertEquals("asdf7as9d7fsad", course.getCalendarEventID());
	}

	@Test
	public void testGetClassTimes() {
		assertArrayEquals(new ClassTimeDTO[]{}, course.getClassTimes());
	}

	@Test
	public void testSetClassTimes() {
		course.setClassTimes(new ClassTimeDTO[]{
				new ClassTimeDTO(),
				new ClassTimeDTO()
		});
		assertArrayEquals(new ClassTimeDTO[]{
				new ClassTimeDTO(),
				new ClassTimeDTO()
		}, course.getClassTimes());
	}

}
