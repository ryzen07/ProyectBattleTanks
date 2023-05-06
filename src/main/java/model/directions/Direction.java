package model.directions;

import java.util.List;

import model.Constants;
import model.Movable;
import model.Position;

public abstract class Direction {

	public void apply(Movable movable) {
		movable.setDirection(this);
		move(movable);
	}

	public static List<Direction> getDirections() {
		return Constants.DIRECTIONS;
	}

	public abstract boolean isHorizontal();

	protected abstract void move(Movable movable);

	public abstract Position getNextPotencialPosition(Movable movable);

}