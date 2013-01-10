package com.student.client.views;

import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Panel;
import com.student.client.LoginInfo;

public class Header {
	
	private Panel header = new HorizontalPanel();
	
	public Header(LoginInfo loginInfo) {
		if(!loginInfo.isLoggedIn()) {
			Anchor signInLink = new Anchor("Sign In");
			signInLink.setHref(loginInfo.getLoginUrl());
			header.add(signInLink);
		} else {
			Anchor signOutLink = new Anchor("Sign Out");
			signOutLink.setHref(loginInfo.getLogoutUrl());
			header.add(signOutLink);
		}
		
	}	
	
	public Panel getHeader() {
		return header;
	}
}
