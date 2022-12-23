package model;

public class Movable extends Entity {
	private final Direction direction;
	private final int speed;

	public Movable(Position center, int majorRadius, int minorRadius, Direction direction, int speed) {
		super(center, majorRadius, minorRadius);
		this.direction = direction;
		this.speed = speed;
	}

	public void move(Direction direction) {
		if (direction.equals(Direction.RIGHT)) {
			center = new Position(center.getX() + speed, center.getY());
		}
		if (direction.equals(Direction.LEFT)) {
			center = new Position(center.getX() - speed, center.getY());
		}
		if (direction.equals(Direction.DOWN)) {
			center = new Position(center.getX(), center.getY() + speed);
		}
		if (direction.equals(Direction.UP)) {
			center = new Position(center.getX(), center.getY() - speed);
		}
		updated();
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

	private void updated() {
		setChanged();
		notifyObservers();
	}
}