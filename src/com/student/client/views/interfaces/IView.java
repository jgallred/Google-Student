package com.student.client.views.interfaces;

import com.google.gwt.user.client.ui.Panel;

public interface IView {
	
	/**
	 * @return The valid state of the view
	 */
	public boolean areContentsValid();
	
	/**
	 * @param valid The new valid state of the view
	 */
	public void setContentsValid(boolean valid);
	
	/**
	 * Refreshes the contents of the view
	 */
	public void reload();
	
	/**
	 * Generates the contents of the view
	 */
	public void load();
	
	public String getName();
	
	public Panel getContent();
}
