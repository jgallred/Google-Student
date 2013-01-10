package com.student.shared.commands;

import com.student.shared.dto.CourseDTO;

public class EditCourse extends Command {
	
	private CourseDTO originalCourse;
	private CourseDTO editedCourse;
	
	public EditCourse(CourseDTO originalCourse, CourseDTO editedCourse) {
		this.originalCourse = originalCourse;
		this.editedCourse = editedCourse;
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
	 * @return the originalCourse
	 */
	public CourseDTO getOriginalCourse() {
		return originalCourse;
	}

	/**
	 * @param originalCourse the originalCourse to set
	 */
	public void setOriginalCourse(CourseDTO originalCourse) {
		this.originalCourse = originalCourse;
	}

	/**
	 * @return the editedCourse
	 */
	public CourseDTO getEditedCourse() {
		return editedCourse;
	}

	/**
	 * @param editedCourse the editedCourse to set
	 */
	public void setEditedCourse(CourseDTO editedCourse) {
		this.editedCourse = editedCourse;
	}

}
