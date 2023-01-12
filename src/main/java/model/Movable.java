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

	private boolean isMinorYOutsideLimit() {
		return getMinorY() == Constants.LIMITMINORY - 1;
	}

	private boolean isMinorXOutsideLimit() {
		return getMinorX() == Constants.LIMITMINORX - 1;
	}

	private boolean isMayorXOutsideLimit() {
		return getMajorX() == Constants.LIMITMAYORX + 1;
	}

	private boolean isMayorYOutsideLimit() {
		return getMajorY() == Constants.LIMITMAYORY + 1;
	}

	private void reverseValueMinorY() {
		if (isMinorYOutsideLimit()) {
			increaseCenterY();
		}
	}

	private void reverseValueMinorX() {
		if (isMinorXOutsideLimit()) {
			increaseCenterX();
		}
	}

	private void reverseValueMajorX() {
		if (isMayorXOutsideLimit()) {
			decreaseCenterX();
		}
	}

	private void reverseValueMajorY() {
		if (isMayorYOutsideLimit()) {
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