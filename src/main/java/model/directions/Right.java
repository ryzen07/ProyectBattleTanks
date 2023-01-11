package model.directions;

import model.Movable;

public class Right extends Direction {

	@Override
	protected void move(Movable movable) {
		movable.increaseCenterY();
	}

	@Override
	public boolean isHorizontal() {
		return true;
	}

}