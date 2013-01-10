package com.student.client.views;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.student.client.LoginInfo;
import com.student.client.events.handlers.IViewChangeHandler;
import com.student.client.views.interfaces.IApplication;
import com.student.client.views.interfaces.IView;

public class GoogleStudentApp implements IApplication {
	
	private List<IView> views = new LinkedList<IView>();	
	private Panel main = new VerticalPanel();
	private List<IViewChangeHandler> viewChangeHandlers = new LinkedList<IViewChangeHandler>();
	private IView currentView;
	private LoginInfo loginInfo = null;
	private Header header = null;
	
	public GoogleStudentApp(LoginInfo loginInfo) {
		setUserLogin(loginInfo);
		header = new Header(loginInfo);
		main.add(header.getHeader());
	}

	@Override
	public void addView(IView newView) {
		views.add(newView);
		main.add(newView.getContent());
	}

	@Override
	public void removeView(IView view) {
		views.remove(view);
	}

	@Override
	public void showView(IView view) {
		currentView = view;
		fireViewChangeHandlers(view);
	}
	
	private void fireViewChangeHandlers(IView view) {
		Iterator<IViewChangeHandler> handlers = viewChangeHandlers.iterator();
		while( handlers.hasNext() ) {
			handlers.next().changed(this, currentView, view);
		}
	}

	@Override
	public void setUserLogin(LoginInfo loginInfo) {
		this.loginInfo = loginInfo;
	}

	@Override
	public void onViewChange(IViewChangeHandler handler) {
		viewChangeHandlers.add(handler);
	}

	@Override
	public Panel getMainPanel() {
		if(views.size() == 0) {
			main.add(new Label("No View is available"));
		}
		return main;
	}

}
