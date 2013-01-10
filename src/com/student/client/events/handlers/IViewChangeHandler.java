package com.student.client.events.handlers;

import com.google.gwt.event.shared.EventHandler;
import com.student.client.views.interfaces.IApplication;
import com.student.client.views.interfaces.IView;

public interface IViewChangeHandler extends EventHandler {
	public void changed(IApplication app, IView currentView, IView nextView);
}
