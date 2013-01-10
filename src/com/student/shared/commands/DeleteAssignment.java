package com.student.shared.commands;

import com.student.shared.dto.AssignmentDTO;

public class DeleteAssignment extends Command {
	
	private AssignmentDTO assignment;
	
	public DeleteAssignment(AssignmentDTO assignment) {
		this.setAssignment(assignment);
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
	 * @return the assignment
	 */
	public AssignmentDTO getAssignment() {
		return assignment;
	}

	/**
	 * @param assignment the assignment to set
	 */
	public void setAssignment(AssignmentDTO assignment) {
		this.assignment = assignment;
	}

}
