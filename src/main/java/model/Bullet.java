package model;

public class Bullet extends Movable {

	public static final int RADIUS = 0;
	private static final int SPEED = 1;

	public Bullet(Position position, Direction direction) {
		super(position, RADIUS, RADIUS, direction, SPEED);
	}

	@Override
	public String toString() {
		return "b";
	}
}