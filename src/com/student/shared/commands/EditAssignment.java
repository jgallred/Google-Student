package com.student.shared.commands;

import com.student.shared.dto.AssignmentDTO;

public class EditAssignment extends Command {
	
	private AssignmentDTO originalAssignment;
	private AssignmentDTO editedAssignment;
	
	public EditAssignment(AssignmentDTO originalAssignment, AssignmentDTO editedAssignment) {
		this.originalAssignment = originalAssignment;
		this.editedAssignment = editedAssignment;
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
	 * @return the originalAssignment
	 */
	public AssignmentDTO getOriginalAssignment() {
		return originalAssignment;
	}

	/**
	 * @param originalAssignment the originalAssignment to set
	 */
	public void setOriginalAssignment(AssignmentDTO originalAssignment) {
		this.originalAssignment = originalAssignment;
	}

	/**
	 * @return the editedAssignment
	 */
	public AssignmentDTO getEditedAssignment() {
		return editedAssignment;
	}

	/**
	 * @param editedAssignment the editedAssignment to set
	 */
	public void setEditedAssignment(AssignmentDTO editedAssignment) {
		this.editedAssignment = editedAssignment;
	}

}
