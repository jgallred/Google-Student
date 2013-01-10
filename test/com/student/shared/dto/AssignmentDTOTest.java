package com.student.shared.dto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AssignmentDTOTest {
	
	private AssignmentDTO assignment;

	@Before
	public void setUp() throws Exception {
		assignment = new AssignmentDTO();
	}

	@Test
	public void testGetName() {
		assertEquals("", assignment.getName());
	}

	@Test
	public void testSetName() {
		assignment.setName("Something");
		assertEquals("Something", assignment.getName());
	}

	@Test
	public void testGetDescription() {
		assertEquals("", assignment.getDescription());
	}

	@Test
	public void testSetDescription() {
		assignment.setDescription("Lots of text. Lots of text. Lots of text. " +
				"Lots of text. Lots of text. Lots of text. Lots of text.");
		assertEquals("Lots of text. Lots of text. Lots of text. Lots of text. " +
				"Lots of text. Lots of text. Lots of text.", assignment.getDescription());
	}

	@Test
	public void testGetDueDate() {
		assertNull(assignment.getDueDate());
	}

	@Test
	public void testSetDueDate() {
		assignment.setDueDate("3/5/2012 6:17 PM");
		assertEquals("3/5/2012 6:17 PM", assignment.getDueDate());
	}

	@Test
	public void testIsCompleted() {
		assertFalse(assignment.isCompleted());
	}

	@Test
	public void testSetCompleted() {
		assertFalse(assignment.isCompleted());
		assignment.setCompleted(true);
		assertTrue(assignment.isCompleted());
	}

	@Test
	public void testGetRepeat() {
		assertNull(assignment.getRepeat());
	}

	@Test
	public void testSetRepeat() {
		assignment.setRepeat("R1W3Th");
		assertEquals("R1W3Th", assignment.getRepeat());
	}

	@Test
	public void testGetTaskID() {
		assertNull(assignment.getTaskID());
	}

	@Test
	public void testSetTaskID() {
		assignment.setTaskID("asd76as98d76fa");
		assertEquals("asd76as98d76fa", assignment.getTaskID());
	}

	@Test
	public void testGetCalendarEventID() {
		assertNull(assignment.getCalendarEventID());
	}

	@Test
	public void testSetCalendarEventID() {
		assignment.setCalendarEventID("asd76as98d76fa");
		assertEquals("asd76as98d76fa", assignment.getCalendarEventID());
	}

	@Test
	public void testGetCourseID() {
		assertNull(assignment.getCourseID());
	}

	@Test
	public void testSetCourseID() {
		assignment.setCourseID("asd76as98d76fa");
		assertEquals("asd76as98d76fa", assignment.getCourseID());
	}

	@Test
	public void testIsInvalid() {
		assertFalse(assignment.isInvalid());
	}

	@Test
	public void testSetInvalid() {
		assignment.setInvalid(true);
		assertTrue(assignment.isInvalid());
	}

	@Test
	public void testGetHead() {
		assertNull(assignment.getHead());
	}

	@Test
	public void testSetHead() {
		assignment.setHead("asd76as98d76fa");
		assertEquals("asd76as98d76fa", assignment.getHead());
	}

}
