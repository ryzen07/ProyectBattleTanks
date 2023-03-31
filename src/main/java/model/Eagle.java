package model;

public class Eagle extends Entity {
	public static final int MAJOR_RADIUS = 1;
	public static final int MINOR_RADIUS = 1;

	public Eagle(int x, int y) {
		super(new Position(x, y), MAJOR_RADIUS, MINOR_RADIUS);
	}

	@Override
	public boolean isObstacle() {
		return true;
	}

	@Override
	public String toString() {
		return "E";
	}
}