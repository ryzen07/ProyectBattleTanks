package model.directions;

import model.Movable;
import model.Position;

public class Up extends Direction {

	@Override
	protected void move(Movable movable) {
		movable.increaseCenterY();

	}

	@Override
	public void moveBack(Movable movable) {
		movable.decreaseCenterY();
	}

	@Override
	public boolean isHorizontal() {
		return false;
	}

	@Override
	public Position getNextPotencialPosition(Movable movable) {

		return new Position(movable.getPosition().getX(), movable.getPosition().getY() + movable.getSpeed());
	}

}