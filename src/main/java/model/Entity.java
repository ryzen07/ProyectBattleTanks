package model;

public abstract class Entity {
	protected Position center;
	protected int height, width;

	public Entity(Position center, int height, int width) {
		this.center = center;
		this.height = height;
		this.width = width;
	}

	@Override
	public String toString() {
		return "#";
	}
}