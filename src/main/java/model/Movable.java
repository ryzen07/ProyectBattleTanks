package model;

public class Movable extends Entity {
	Direction direction;

	public Movable(Position center, int height, int width, Direction direction) {
		super(center, height, width);
		this.direction = direction;
	}

	protected void move(Direction direction) {
	}

	protected void collision() {
	}

	@Override
	protected int getMajorRadius() {
		if (direction.equals(Direction.RIGHT) || direction.equals(Direction.LEFT)) {
			return super.getMinorRadius();
		}
		return super.getMajorRadius();
	}

	@Override
	protected int getMinorRadius() {
		if (direction.equals(Direction.UP) || direction.equals(Direction.DOWN)) {
			return super.getMinorRadius();
		}
		return super.getMajorRadius();
	}
}