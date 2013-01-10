package com.student.shared.dto;

public class SemesterDTO extends DTO {

	/** The user given name of the semester */
	private String name;
	
	/** The start of the range covered by the semester */
	private String startDate;
	
	/** The end of the range covered by the semester */
	private String endDate;
	
	/** Whether the user included finals dates in the semester */
	private boolean finalsIncluded;
	
	/** The start of the finals period */
	private String finalsStartDate;
	
	/** The end of the finals period */
	private String finalsEndDate;
	
	/** The ID of the google calendar the user selected */
	private String calendarID;
	
	/** The User who created the semester */
	private String userID;
	
	/** The date the user deleted the semester */
	private String deletedDate;
	
	public SemesterDTO() {
		super();
		name = "";
		startDate = null;
		endDate = null;
		finalsIncluded = false;
		finalsStartDate = null;
		finalsEndDate = null;
		calendarID = null;
		userID = null;
		deletedDate = null;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the finalsIncluded
	 */
	public boolean areFinalsIncluded() {
		return finalsIncluded;
	}

	/**
	 * @param finalsIncluded the finalsIncluded to set
	 */
	public void setFinalsIncluded(boolean finalsIncluded) {
		this.finalsIncluded = finalsIncluded;
	}

	/**
	 * @return the finalsStartDate
	 */
	public String getFinalsStartDate() {
		return finalsStartDate;
	}

	/**
	 * @param finalsStartDate the finalsStartDate to set
	 */
	public void setFinalsStartDate(String finalsStartDate) {
		this.finalsStartDate = finalsStartDate;
	}

	/**
	 * @return the finalsEndDate
	 */
	public String getFinalsEndDate() {
		return finalsEndDate;
	}

	/**
	 * @param finalsEndDate the finalsEndDate to set
	 */
	public void setFinalsEndDate(String finalsEndDate) {
		this.finalsEndDate = finalsEndDate;
	}

	/**
	 * @return the calendarID
	 */
	public String getCalendarID() {
		return calendarID;
	}

	/**
	 * @param calendarID the calendarID to set
	 */
	public void setCalendarID(String calendarID) {
		this.calendarID = calendarID;
	}

	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * @return the deletedDate
	 */
	public String getDeletedDate() {
		return deletedDate;
	}

	/**
	 * @param deletedDate the deletedDate to set
	 */
	public void setDeletedDate(String deletedDate) {
		this.deletedDate = deletedDate;
	}
	
}
