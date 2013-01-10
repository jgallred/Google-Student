package com.student.client.views.interfaces;

import com.google.gwt.user.client.ui.Panel;
import com.student.client.LoginInfo;
import com.student.client.events.handlers.IViewChangeHandler;

public interface IApplication {
	
	/**
	 * Adds a view to the application
	 * @param newView The view to add
	 */
	public void addView(IView newView);
	
	/**
	 * Removes a view from the application
	 * @param view The view to remove
	 */
	public void removeView(IView view);
	
	/**
	 * Changes the current view to the specified one
	 * @param view The view to make current
	 */
	public void showView(IView view);
	
	/**
	 * Gives the application the current login information
	 * @param loginInfo The current login information
	 */
	public void setUserLogin(LoginInfo loginInfo);
	
	/**
	 * Registers an event handler to be notified of changes in the current view
	 * @param handler The handler for the event
	 */
	public void onViewChange(IViewChangeHandler handler);
	
	/**
	 * @return The panel in which all application UI lives
	 */
	public Panel getMainPanel();
}
