package model;

public class Movable extends Entity {
	private final int speed;

	private final Board board = new Board();

	public Movable(Position center, int majorRadius, int minorRadius, int speed) {
		super(center, majorRadius, minorRadius);
		this.speed = speed;
	}

	protected void collision() {
	}

	/*
	 * @Override protected int getXRadius() { if (direction.equals(Direction.RIGHT)
	 * || direction.equals(Direction.LEFT)) { return super.getYRadius(); } return
	 * super.getXRadius(); }
	 *
	 * @Override protected int getYRadius() { if (direction.equals(Direction.UP) ||
	 * direction.equals(Direction.DOWN)) { return super.getYRadius(); } return
	 * super.getXRadius(); }
	 */

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
}