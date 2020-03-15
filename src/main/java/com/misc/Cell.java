package com.misc;

public class Cell {
	private boolean hasLeft, hasRight, hasUp, hadDown;
	private boolean isFillable;

	public Cell() {
		super();
	}

	public Cell(boolean hasLeft, boolean hasRight, boolean hasUp, boolean hadDown) {
		super();
		this.hasLeft = hasLeft;
		this.hasRight = hasRight;
		this.hasUp = hasUp;
		this.hadDown = hadDown;
	}

	public boolean isHasLeft() {
		return hasLeft;
	}

	public void setHasLeft(boolean hasLeft) {
		this.hasLeft = hasLeft;
	}

	public boolean isHasRight() {
		return hasRight;
	}

	public void setHasRight(boolean hasRight) {
		this.hasRight = hasRight;
	}

	public boolean isHasUp() {
		return hasUp;
	}

	public void setHasUp(boolean hasUp) {
		this.hasUp = hasUp;
	}

	public boolean isHadDown() {
		return hadDown;
	}

	public void setHadDown(boolean hadDown) {
		this.hadDown = hadDown;
	}

	public boolean isFillable() {
		return isFillable;
	}

	public void setFillable(boolean isFillable) {
		this.isFillable = isFillable;
	}
	
}
