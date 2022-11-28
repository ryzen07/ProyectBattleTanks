package model;

public abstract class Entity {
	protected Position center;
	private final int majorRadius, minorRadius;

	public Entity(Position center, int majorradius, int minorradius) {
		this.center = center;
		majorRadius = majorradius;
		minorRadius = minorradius;
	}

	protected int getMajorRadius() {
		return majorRadius;
	}

	protected int getMinorRadius() {
		return minorRadius;
	}

	public int getMinorX() {
		return center.getX() - getMajorRadius();
	}

	public int getMayorX() {
		return center.getX() + getMajorRadius();
	}

	public int getMinorY() {
		return center.getY() - getMinorRadius();
	}

	public int getMayorY() {
		return center.getY() + getMinorRadius();
	}

	@Override
	public String toString() {
		return "#";
	}
}