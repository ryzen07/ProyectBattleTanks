package model;

public class Water extends Entity {
	public static final int MAJOR_RADIUS = 0;
	public static final int MINOR_RADIUS = 3;

	public Water(int x, int y) {
		super(new Position(x, y), MAJOR_RADIUS, MINOR_RADIUS);
	}

	@Override
	public boolean isObstacle() {
		return true;
	}

	@Override
	public String toString() {
		return "A";
	}
}