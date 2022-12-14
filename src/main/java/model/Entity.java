package model;

public abstract class Entity {
	protected Position center;
	private final int majorRadius, minorRadius;

	public Entity(Position center, int majorRadius, int minorRadius) {
		this.center = center;
		this.majorRadius = majorRadius;
		this.minorRadius = minorRadius;
	}

	protected int getXRadius() {
		return majorRadius;
	}

	protected int getYRadius() {
		return minorRadius;
	}

	public int getMinorX() {
		return center.getX() - getXRadius();
	}

	public int getMayorX() {
		return center.getX() + getXRadius();
	}

	public int getMinorY() {
		return center.getY() - getYRadius();
	}

	public int getMayorY() {
		return center.getY() + getYRadius();
	}

	@Override
	public String toString() {
		return "#";
	}
}