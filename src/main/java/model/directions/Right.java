package model.directions;

import model.Movable;

public class Right extends Direction {

	@Override
	protected void move(Movable movable) {
		movable.increaseCenterX();
	}

	@Override
	public boolean isHorizontal() {
		return true;
	}

}