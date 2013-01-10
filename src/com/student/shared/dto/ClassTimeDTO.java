package com.student.shared.dto;

import java.util.Arrays;

public class ClassTimeDTO extends DTO {
	
	/** The time that the meeting starts */
	private String startTime;
	
	/** The time that the meeting ends */
	private String endTime;
	
	/** The days of the week that the meeting occurs on */
	private String[] days;
	
	public ClassTimeDTO() {
		startTime = null;
		endTime = null;
		days = new String[]{};
	}

	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the days
	 */
	public String[] getDays() {
		return days;
	}

	/**
	 * @param days the days to set
	 */
	public void setDays(String[] days) {
		this.days = days;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(days);
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result
				+ ((startTime == null) ? 0 : startTime.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) { /*TODO is it important for them to have the same ID*/
			return false;
		}
		if (!(obj instanceof ClassTimeDTO)) {
			return false;
		}
		ClassTimeDTO other = (ClassTimeDTO) obj;
		if (!Arrays.equals(days, other.days)) {
			return false;
		}
		if (endTime == null) {
			if (other.endTime != null) {
				return false;
			}
		} else if (!endTime.equals(other.endTime)) {
			return false;
		}
		if (startTime == null) {
			if (other.startTime != null) {
				return false;
			}
		} else if (!startTime.equals(other.startTime)) {
			return false;
		}
		return true;
	}

}
