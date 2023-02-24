package model;

public class Interaction {
	private final Movable movable;
	private final Entity otherEntity;

	public Interaction(Movable movable, Entity otherEntity) {
		this.otherEntity = otherEntity;
		this.movable = movable;
	}

	public Entity getEntity() {
		return otherEntity;
	}

	public void collision(Entity entity, Movable movable) {
		movable.moveBack();
	}

	public boolean canMove() {
		return !otherEntity.isObstacle();
	}
}