package com.student.shared.commands;

import com.student.shared.dto.CourseDTO;

public class CreateCourse extends Command {
	
	public CourseDTO course;
	
	public CreateCourse(CourseDTO course) {
		this.course = course;
	}

	@Override
	public void doIt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void undoIt() {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the course
	 */
	public CourseDTO getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(CourseDTO course) {
		this.course = course;
	}

}
