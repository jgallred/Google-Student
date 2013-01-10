package com.student.client;

import com.student.client.views.GoogleStudentApp;
import com.student.client.views.NotLoggedInView;
import com.student.client.views.interfaces.IApplication;
import com.student.client.views.interfaces.IView;
import com.student.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GoogleStudent implements EntryPoint {
	private LoginInfo loginInfo = null;	
	private IApplication app  = null;
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		LoginServiceAsync loginService = GWT.create(LoginService.class);
		loginService.login(GWT.getHostPageBaseURL(), new AsyncCallback<LoginInfo>() {
			@Override
			public void onFailure(Throwable caught) {
				handleError(caught);
			}

			@Override
			public void onSuccess(LoginInfo result) {
				loginInfo = result;
				if(result.isLoggedIn()) {
					app = new GoogleStudentApp(loginInfo);
					RootPanel.get("main").add(app.getMainPanel());
				} else {
					app = new GoogleStudentApp(loginInfo);
					IView notLoggedIn = new NotLoggedInView(loginInfo);
					app.addView(notLoggedIn);
					RootPanel.get("main").add(app.getMainPanel());
				}
			}
		});		
	}
	
	private void handleError(Throwable error) {
		Window.alert("Error: "+error.getMessage());
		if(error instanceof NotLoggedInException) {
			Window.Location.replace(loginInfo.getLogoutUrl());
		}
	}
}
