package com.student.client.views;

import com.google.gwt.user.client.ui.Panel;
import com.student.client.views.interfaces.IView;

public class View implements IView {
	
	private boolean valid = false;
	
	protected View() {}

	@Override
	public boolean areContentsValid() {
		return valid;
	}

	@Override
	public void setContentsValid(boolean valid) {
		this.valid = valid;
	}

	@Override
	public void reload() {
		setContentsValid(true);
	}

	@Override
	public void load() {
		setContentsValid(true);
	}

	@Override
	public String getName() {
		throw new UnsupportedOperationException("No name found!"); 
	}

	@Override
	public Panel getContent() {
		throw new UnsupportedOperationException("No content found!"); 
	}

}
