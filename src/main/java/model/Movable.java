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
}