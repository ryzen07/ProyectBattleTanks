package model;

import model.directions.Direction;

public class Movable extends Entity {
	private final int speed;
	private Direction direction;
	protected boolean hasToMove = false;

	public Movable(Position center, int majorRadius, int minorRadius, int speed, Direction direction) {
		super(center, majorRadius, minorRadius);
		this.speed = speed;
		this.direction = direction;
	}

	protected void collision() {
	}

	public boolean getHasToMove() {
		return hasToMove;
	}

	public void setHasToMove(boolean hasToMove) {
		this.hasToMove = hasToMove;
	}

	@Override
	public int getXRadius() {
		if (direction.isHorizontal()) {
			return super.getYRadius();
		}
		return super.getXRadius();
	}

	@Override
	public int getYRadius() {
		if (direction.isHorizontal()) {
			return super.getXRadius();
		}
		return super.getYRadius();
	}

	protected void updated() {
		setChanged();
		notifyObservers();
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
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

	public void checkNextPositionToMove() {
		isInBoardBounds();
	}

	private boolean isMinorYInLimit() {
		return getMinorY() == Constants.LIMITMINORY;
	}

	private boolean isMinorXInLimit() {
		return getMinorX() == Constants.LIMITMINORX;
	}

	private boolean isMayorXInLimit() {
		return getMajorX() >= Constants.SQUARE_WIDTH;
	}

	private boolean isMayorYinLimit() {
		return getMajorY() >= Constants.SQUARE_HEIGHT;
	}

	private void reverseValueMinorY() {
		if (isMinorYInLimit()) {
			increaseCenterY();
		}
	}

	private void reverseValueMinorX() {
		if (isMinorXInLimit()) {
			increaseCenterX();
		}
	}

	private void reverseValueMajorX() {
		if (isMayorXInLimit()) {
			decreaseCenterX();
		}
	}

	private void reverseValueMajorY() {
		if (isMayorYinLimit()) {
			decreaseCenterY();
		}
	}

	public void isInBoardBounds() {
		reverseValueMinorX();
		reverseValueMinorY();
		reverseValueMajorX();
		reverseValueMajorY();
	}
}