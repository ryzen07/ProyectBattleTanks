package model;

public class Interaction {
	private final Movable movable;
	private final Entity entity;

	public Interaction(Movable movable, Entity entity) {
		this.entity = entity;
		this.movable = movable;
	}

	public void collision(Entity entity, Movable movable) {
		movable.moveBack();
	}

}