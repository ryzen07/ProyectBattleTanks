package model;

import model.directions.Direction;

public class Movable extends Entity {
	private final int speed;

	private final Board board = new Board();

	private Direction direction;

	public Movable(Position center, int majorRadius, int minorRadius, int speed) {
		super(center, majorRadius, minorRadius);
		this.speed = speed;
	}

	protected void collision() {
	}

	@Override
	protected int getXRadius() {
		if (direction.isHorizontal()) {
			return super.getYRadius();
		}
		return super.getXRadius();
	}

	@Override
	protected int getYRadius() {
		if (direction.isHorizontal()) {
			return super.getXRadius();
		}
		return super.getYRadius();
	}

	protected void updated() {
		setChanged();
		notifyObservers();
	}

	public void increaseCenterX() {
		center = new Position(center.getX() + speed, center.getY());
	}

	public void decreaseCenterX() {
		center = new Position(center.getX() - speed, center.getY());
	}

	public void decreaseCenterY() {
		center = new Position(center.getX(), center.getY() - speed);
	}

	public void increaseCenterY() {
		center = new Position(center.getX(), center.getY() + speed);
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
}