package com.student.client.views;

import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.student.client.LoginInfo;

public class NotLoggedInView extends View {
	
	private LoginInfo loginInfo = null;
	private VerticalPanel loginPanel = new VerticalPanel();
	private Label loginLabel = new Label("Please sign in to your Google Account "+
			"to access the Homework Manager application.");
	private Anchor signInLink = new Anchor("Sign In");
	
	public NotLoggedInView(LoginInfo loginInfo) {
		this.loginInfo = loginInfo;
		loginPanel.add(loginLabel);
		signInLink.setHref(loginInfo.getLoginUrl());
		loginPanel.add(signInLink);
	}
	
	@Override
	public Panel getContent() {
		return loginPanel;
	}

}
