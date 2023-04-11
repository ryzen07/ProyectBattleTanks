package model.directions;

import model.Movable;
import model.Position;

public class Down extends Direction {

	private static Down INSTANCE = new Down();

	private Down() {
	}

	public static Down getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Down();
		}
		return INSTANCE;
	}

	@Override
	protected void move(Movable movable) {
		movable.decreaseCenterY();

	}

	@Override
	public boolean isHorizontal() {
		return false;
	}

	@Override
	public Position getNextPotencialPosition(Movable movable) {

		return new Position(movable.getPosition().getX(), movable.getPosition().getY() - movable.getSpeed());
	}

}