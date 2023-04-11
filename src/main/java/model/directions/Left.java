package model.directions;

import model.Movable;
import model.Position;

public class Left extends Direction {

	private static Left INSTANCE = new Left();

	private Left() {
	}

	public static Left getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Left();
		}
		return INSTANCE;
	}

	@Override
	protected void move(Movable movable) {
		movable.decreaseCenterX();
	}

	@Override
	public boolean isHorizontal() {
		return true;
	}

	@Override
	public Position getNextPotencialPosition(Movable movable) {

		return new Position(movable.getPosition().getX() - movable.getSpeed(), movable.getPosition().getY());
	}

}