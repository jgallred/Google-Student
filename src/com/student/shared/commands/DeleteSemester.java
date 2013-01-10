package com.student.shared.commands;

import com.student.shared.dto.SemesterDTO;

public class DeleteSemester extends Command {
	
	private SemesterDTO semester;
	
	public DeleteSemester(SemesterDTO semester) {
		this.semester = semester;
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
	 * @return the semester
	 */
	public SemesterDTO getSemester() {
		return semester;
	}

	/**
	 * @param semester the semester to set
	 */
	public void setSemester(SemesterDTO semester) {
		this.semester = semester;
	}

}
