package model.actions;

import model.Movable;
import model.directions.Direction;

public class Movement implements Action {

	private final Direction direction;

	public Movement(Direction direction) {
		this.direction = direction;
	}

	@Override
	public void apply(Movable movable) {
		movable.setDirection(direction);
		movable.move();
	}
}