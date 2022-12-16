package model;

import java.util.Observable;

public class Movable extends Entity {
	private final Direction direction;

	public Movable(Position center, int majorRadius, int minorRadius, Direction direction) {
		super(center, majorRadius, minorRadius);
		this.direction = direction;
	}

	public void move(Direction direction) {
		if (direction.equals(Direction.RIGHT)) {
			center = new Position(6, 5);
		}
		if (direction.equals(Direction.LEFT)) {
			center = new Position(4, 5);
		}
		if (direction.equals(Direction.DOWN)) {
			center = new Position(5, 6);
		}
		if (direction.equals(Direction.UP)) {
			center = new Position(5, 4);
		}
	}

	/*
	 * public void move2(Direction direction) { switch (direction) { case LEFT: x =
	 * x - VELOCITY; break; case UP: y = y - VELOCITY; break; case RIGHT: x = x +
	 * VELOCITY; break; case DOWN: y = y + VELOCITY; break;
	 * 
	 * default: break; } updated();
	 * 
	 * }
	 */
	protected void collision() {
	}

	protected Direction getDirection() {
		return direction;
	}

	@Override
	protected int getXRadius() {
		if (direction.equals(Direction.RIGHT) || direction.equals(Direction.LEFT)) {
			return super.getYRadius();
		}
		return super.getXRadius();
	}

	@Override
	protected int getYRadius() {
		if (direction.equals(Direction.UP) || direction.equals(Direction.DOWN)) {
			return super.getYRadius();
		}
		return super.getXRadius();
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}

	private void updated() {
		setChanged();
		notifyObservers();
	}
}