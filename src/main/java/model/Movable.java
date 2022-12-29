package model;

import model.directions.Direction;
import model.directions.Left;

public class Movable extends Entity {
	private final int speed;

	private final Board board = new Board();
	protected ORIENTATION orientation;
	private Direction direction = new Left();

	public Movable(Position center, int majorRadius, int minorRadius, int speed, ORIENTATION orientation) {
		super(center, majorRadius, minorRadius);
		this.speed = speed;
		this.orientation = orientation;
	}

	protected void collision() {
	}

	/*
	 * @Override protected int getXRadius() { if (direction.isHorizontal()) { return
	 * super.getYRadius(); } return super.getXRadius(); }
	 *
	 * @Override protected int getYRadius() { if (direction.isHorizontal()) { return
	 * super.getXRadius(); } return super.getYRadius(); }
	 */
	protected void updated() {
		setChanged();
		notifyObservers();
	}

	public ORIENTATION getOrientation() {
		return orientation;
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

	public void checkNextPositionToMove(Entity entity) {
		isInBoardBounds(entity);
	}

	private boolean limitMinorYCheck(Entity entity) {
		return entity.getMinorY() == Constants.LIMITMINORY;
	}

	private boolean limitMinorXCheck(Entity entity) {
		return entity.getMinorX() == Constants.LIMITMINORX;
	}

	private boolean limitMayorXCheck(Entity entity) {
		return entity.getMayorX() >= Constants.SQUARE_WIDTH;
	}

	private boolean limitMayorYCheck(Entity entity) {
		return entity.getMayorY() >= Constants.SQUARE_HEIGHT;
	}

	private void reverseValueMinorY(Entity entity) {
		if (limitMinorYCheck(entity)) {
			entity.setMove(false);
			increaseCenterY();
			entity.setMove(true);
		}
	}

	private void reverseValueMinorX(Entity entity) {
		if (limitMinorXCheck(entity)) {
			entity.setMove(false);
			increaseCenterX();
			entity.setMove(true);
		}
	}

	private void reverseValueMayorX(Entity entity) {
		if (limitMayorXCheck(entity)) {
			entity.setMove(false);
			decreaseCenterX();
			entity.setMove(true);
		}
	}

	private void reverseValueMayorY(Entity entity) {
		if (limitMayorYCheck(entity)) {
			entity.setMove(false);
			decreaseCenterY();
			entity.setMove(true);
		}
	}

	public void isInBoardBounds(Entity entity) {
		reverseValueMinorX(entity);
		reverseValueMinorY(entity);
		reverseValueMayorX(entity);
		reverseValueMayorY(entity);
	}
}