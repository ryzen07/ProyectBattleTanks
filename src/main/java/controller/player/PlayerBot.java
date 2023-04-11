package controller.player;

import controller.strategy.MovementStrategy;
import model.Movable;

public class PlayerBot extends Player {
	MovementStrategy strategy;
	private final Movable movable;

	public void doAction() {
		strategy.getNextAction().apply(movable);
	}

	public PlayerBot(Movable movable, MovementStrategy strategy) {
		this.strategy = strategy;
		this.movable = movable;
		Thread thread = new Thread() {
			@Override
			public void run() {
				while (true) {
					doAction();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
				}
			}
		};
		thread.start();
	}

	public void setMovementStrategy(MovementStrategy strategy) {
		this.strategy = strategy;
	}

}