package model;

public class Movable extends Entity {
	private final Direction direction;

	public Movable(Position center, int majorRadius, int minorRadius, Direction direction) {
		super(center, majorRadius, minorRadius);
		this.direction = direction;
	}

	protected void move(Direction direction) {
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
}