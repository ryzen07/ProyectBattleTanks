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