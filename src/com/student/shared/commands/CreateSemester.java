package com.student.shared.commands;

import com.student.shared.dto.SemesterDTO;

public class CreateSemester extends Command {
	
	private SemesterDTO semester;
	
	public CreateSemester(SemesterDTO semester) {
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
