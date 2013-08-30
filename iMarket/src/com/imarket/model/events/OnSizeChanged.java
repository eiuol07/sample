package com.imarket.model.events;

public class OnSizeChanged {

	private int _width;
	private int _height;
	private int _oldWidth;
	private int _oldHeight;

	public OnSizeChanged() {

	}

	public OnSizeChanged(int width, int height, int oldWidth, int oldHeight) {
		_width = width;
		_height = height;
		_oldWidth = oldWidth;
		_oldHeight = oldHeight;
	}

	public int getWidth() {
		return _width;
	}

	public void setWidth(int width) {
		_width = width;
	}

	public int getHeight() {
		return _height;
	}

	public void setHeight(int height) {
		_height = height;
	}

	public int getOldWidth() {
		return _oldWidth;
	}

	public void setOldWidth(int oldWidth) {
		_oldWidth = oldWidth;
	}

	public int getOldHeight() {
		return _oldHeight;
	}

	public void setOldHeight(int oldHeight) {
		_oldHeight = oldHeight;
	}
}
