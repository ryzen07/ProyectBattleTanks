package model;

public class Bullet extends Movable {

	public static final int RADIUS = 0;

	public Bullet(int x, int y, Direction direction) {
		super(new Position(x, y), RADIUS, RADIUS, direction);
	}

	@Override
	public String toString() {
		return "b";
	}
}