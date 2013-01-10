package com.student.shared.commands;

import com.student.shared.dto.SemesterDTO;

public class EditSemester extends Command {
	
	private SemesterDTO originalSemester;
	private SemesterDTO editedSemester;
	
	public EditSemester(SemesterDTO originalSemester, SemesterDTO editedSemester) {
		this.originalSemester = originalSemester;
		this.editedSemester = editedSemester;
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
	 * @return the originalSemester
	 */
	public SemesterDTO getOriginalSemester() {
		return originalSemester;
	}

	/**
	 * @param originalSemester the originalSemester to set
	 */
	public void setOriginalSemester(SemesterDTO originalSemester) {
		this.originalSemester = originalSemester;
	}

	/**
	 * @return the editedSemester
	 */
	public SemesterDTO getEditedSemester() {
		return editedSemester;
	}

	/**
	 * @param editedSemester the editedSemester to set
	 */
	public void setEditedSemester(SemesterDTO editedSemester) {
		this.editedSemester = editedSemester;
	}

}
