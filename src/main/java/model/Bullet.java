package model;

import controller.strategy.OnlyForwardStrategy;
import model.directions.Direction;

public class Bullet extends Movable {

	public static final int RADIUS = 0;
	private static final int SPEED = 1;
	OnlyForwardStrategy strategy;
	private Movable movable;
	private final Direction direction;

	public Bullet(Position position, Direction direction) {
		super(position, RADIUS, RADIUS, SPEED, direction);
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "b";
	}
}