package controller;

public abstract class MovementStrategy {

	private MovementStrategy strategy;

	public void setMovementStrategy(MovementStrategy strategy) {
		this.strategy = strategy;
	}

	public abstract void move1();

}