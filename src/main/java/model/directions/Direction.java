package model.directions;

import model.Movable;
import model.Position;

public abstract class Direction {

	public void apply(Movable movable) {
		movable.setDirection(this);
		move(movable);
	}

	public abstract boolean isHorizontal();

	protected abstract void move(Movable movable);

	public abstract void moveBack(Movable movable);

	public abstract Position getNextPotencialPosition(Movable movable);

}