package model;

public class Bullet extends Movable {

	public static final int RADIUS = 0;

	public Bullet(Position position, Direction direction) {
		super(position, RADIUS, RADIUS, direction);
	}

	@Override
	public String toString() {
		return "b";
	}
}