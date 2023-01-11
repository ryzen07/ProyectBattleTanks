package model.directions;

import model.Movable;

public abstract class Direction {

	public void apply(Movable movable) {
		movable.setDirection(this);
		move(movable);
	}

	public abstract boolean isHorizontal();

	protected abstract void move(Movable movable);

}