package model;

public abstract class Entity {
	protected Position center;
	protected int height, width;

	public Entity(Position center, int height, int width) {
		this.center = center;
		this.height = height;
		this.width = width;
	}

	public Entity(int height, int width) {
		this.height = height;
		this.width = width;
	}

	// entity
	// entity.center.getX()-entity.height/2

	@Override
	public String toString() {
		// System.out.println("#");
		return "#";
	}

}