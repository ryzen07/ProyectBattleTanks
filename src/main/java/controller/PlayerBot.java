package controller;

public class PlayerBot {
	MovementStrategy strategy;

	public void Player(MovementStrategy strategy) {
		this.strategy = strategy;
	}

	public void setMovementStrategy(MovementStrategy strategy) {
		this.strategy = strategy;
	}

	public void move() {
		strategy.move1();
	}
}
