package controller.player;

import controller.MovementStrategy;
import controller.strategy.RandomStrategy;

public class PlayerBot extends Player {
	MovementStrategy strategy;
	RandomStrategy randomMovement;

	public void Player(MovementStrategy strategy) {
		this.strategy = strategy;
	}

	public void setMovementStrategy(MovementStrategy strategy) {
		this.strategy = strategy;
	}

	public void move() {

	}

	@Override
	public void Applymovement() {
		randomMovement.getNextDirection();
	}
}
