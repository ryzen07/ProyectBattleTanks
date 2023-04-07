package model.directions;

import model.Movable;
import model.Position;

public class Right extends Direction {

	private static final Right INSTANCE = new Right();

	private Right() {
	}

	public static Right getInstance() {
		return INSTANCE;
	}

	@Override
	protected void move(Movable movable) {
		movable.increaseCenterX();
	}

	@Override
	public boolean isHorizontal() {
		return true;
	}

	@Override
	public Position getNextPotencialPosition(Movable movable) {

		return new Position(movable.getPosition().getX() + movable.getSpeed(), movable.getPosition().getY());
	}

}