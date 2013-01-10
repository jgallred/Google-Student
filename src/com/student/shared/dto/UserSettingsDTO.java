package com.student.shared.dto;

public class UserSettingsDTO extends DTO {
	
	/** Whether to display to user what assignments are due */
	private boolean showDueAssignments;
	
	/** Number of days */
	private int assignmentDisplayRange;
	
	/** The Semester to go directly to */
	private String defaultSemesterID;
	
	public UserSettingsDTO() {
		showDueAssignments = true;
		assignmentDisplayRange = 14;
		defaultSemesterID = null;
	}

	/**
	 * @return the showDueAssignments
	 */
	public boolean shouldShowDueAssignments() {
		return showDueAssignments;
	}

	/**
	 * @param showDueAssignments the showDueAssignments to set
	 */
	public void setShowDueAssignments(boolean showDueAssignments) {
		this.showDueAssignments = showDueAssignments;
	}

	/**
	 * @return the assignmentDisplayRange
	 */
	public int getAssignmentDisplayRange() {
		return assignmentDisplayRange;
	}

	/**
	 * @param assignmentDisplayRange the assignmentDisplayRange to set
	 */
	public void setAssignmentDisplayRange(int assignmentDisplayRange) {
		this.assignmentDisplayRange = assignmentDisplayRange;
	}

	/**
	 * @return the defaultSemesterID
	 */
	public String getDefaultSemesterID() {
		return defaultSemesterID;
	}

	/**
	 * @param defaultSemesterID the defaultSemesterID to set
	 */
	public void setDefaultSemesterID(String defaultSemesterID) {
		this.defaultSemesterID = defaultSemesterID;
	}

}
