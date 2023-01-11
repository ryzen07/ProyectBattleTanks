package model.directions;

import model.Movable;

public class Left extends Direction {

	@Override
	protected void move(Movable movable) {
		movable.decreaseCenterY();
	}

	@Override
	public boolean isHorizontal() {
		return true;
	}
}