package com.student.shared.dto;

public class CourseDTO extends DTO {

	private String name;
	private String instructor;
	private String location;
	private String semesterID;
	private String calendarEventID;
	private ClassTimeDTO[] classTimes;
	private String deletedDate;
	
	public CourseDTO() {
		name = "";
		instructor = "";
		location = "";
		semesterID = null;
		calendarEventID = null;
		classTimes = new ClassTimeDTO[]{};
		setDeletedDate(null);
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
	 * @return the instructor
	 */
	public String getInstructor() {
		return instructor;
	}
	/**
	 * @param instructor the instructor to set
	 */
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the semesterID
	 */
	public String getSemesterID() {
		return semesterID;
	}
	/**
	 * @param semesterID the semesterID to set
	 */
	public void setSemesterID(String semesterID) {
		this.semesterID = semesterID;
	}
	/**
	 * @return the calendarEventID
	 */
	public String getCalendarEventID() {
		return calendarEventID;
	}
	/**
	 * @param calendarEventID the calendarEventID to set
	 */
	public void setCalendarEventID(String calendarEventID) {
		this.calendarEventID = calendarEventID;
	}
	/**
	 * @return the classTimes
	 */
	public ClassTimeDTO[] getClassTimes() {
		return classTimes;
	}
	/**
	 * @param classTimes the classTimes to set
	 */
	public void setClassTimes(ClassTimeDTO[] classTimes) {
		this.classTimes = classTimes;
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
