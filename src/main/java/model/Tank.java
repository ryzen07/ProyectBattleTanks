package model;

import model.directions.Direction;

public class Tank extends Movable {

	private static final int SPEED = 1;
	public static final int MAJOR_RADIUS = 1;
	public static final int MINOR_RADIUS = 1;
	// private final boolean allied;
	// private final int life;

	// private arrayList<powerup()> activePower;
	/*
	 * public int getLife() { return life; }
	 */

	/*
	 * public Bullet shoot() { return new Bullet(new Position(2, 3), Direction.UP);
	 *
	 * }
	 */
	public Tank(int x, int y, Direction direction) {
		super(new Position(x, y), MAJOR_RADIUS, MINOR_RADIUS, SPEED, direction);
	}

	public Position getCenter() {
		return center;
	}

	public void setCenter(Position center) {
		this.center = center;
	}

	@Override
	public String toString() {
		return "x";
	}

	public void move() {
		if (hasToMove) {
			checkNextPositionToMove();
			getDirection().apply(this);
			hasToMove = false;
			updated();
		}
	}
}