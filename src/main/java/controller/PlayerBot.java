package controller;

import controller.strategy.RandomStrategy;

public class PlayerBot {
	MovementStrategy strategy;
	RandomStrategy randomMovement;

	public void Player(MovementStrategy strategy) {
		this.strategy = strategy;
	}

	public void setMovementStrategy(MovementStrategy strategy) {
		this.strategy = strategy;
	}

	public void move() {
		randomMovement.moveMovable();
	}
}
