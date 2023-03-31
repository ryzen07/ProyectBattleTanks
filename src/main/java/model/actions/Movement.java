package model.actions;

import model.Tank;
import model.directions.Direction;

public class Movement implements Action {

	private final Direction direction;

	public Movement(Direction direction) {
		this.direction = direction;
	}

	@Override
	public void apply(Tank tank) {
		tank.setDirection(direction);
		tank.move();
	}
}