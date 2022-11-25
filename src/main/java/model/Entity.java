package model;

public abstract class Entity {
	protected Position center;
	protected int majorradius, minorradius;

	public Entity(Position center, int height, int width) {
		this.center = center;
		this.majorradius = majorradius;
		this.minorradius = minorradius;
	}

	@Override
	public String toString() {
		return "#";
	}
}