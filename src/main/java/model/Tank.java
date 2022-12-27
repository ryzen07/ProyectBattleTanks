package model;

import model.directions.Direction;

public class Tank extends Movable {

	private static final int SPEED = 1;
	public static final int MAJOR_RADIUS = 10;
	public static final int MINOR_RADIUS = 20;

	// private final boolean allied;
	// private final int life;

	// private arrayList<powerup()> activePower;

	public Tank(int x, int y) {
		super(new Position(x, y), MAJOR_RADIUS, MINOR_RADIUS, SPEED);
	}

	/*
	 * public int getLife() { return life; }
	 */

	/*
	 * public Bullet shoot() { return new Bullet(new Position(2, 3), Direction.UP);
	 *
	 * }
	 */

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

	public void move(Direction direction) {
		direction.apply(this);
		updated();
	}
}