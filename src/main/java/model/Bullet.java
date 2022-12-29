package model;

public class Bullet extends Movable {

	public static final int RADIUS = 0;
	private static final int SPEED = 1;

	public Bullet(Position position, ORIENTATION LEFT) {
		super(position, RADIUS, RADIUS, SPEED, LEFT);
	}

	@Override
	public String toString() {
		return "b";
	}
}