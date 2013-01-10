package com.student.shared.dto;

public abstract class DTO {
	protected String id;

	public DTO() {
		id = null;
	}
	
	/**
	 * @return The ID of the instance
	 */
	public String getID() {
		return id;
	}

	/**
	 * @param id The ID of the instance
	 */
	public void setID(String id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof DTO)) {
			return false;
		}
		DTO other = (DTO) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
}
