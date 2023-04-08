package controller.player;

import controller.strategy.MovementStrategy;
import model.Tank;

public class PlayerBot extends Player {
	MovementStrategy strategy;
	private final Tank tank;

	public PlayerBot(MovementStrategy strategy, Tank tank) {
		this.strategy = strategy;
		this.tank = tank;
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

	public void doAction() {
		strategy.getNextAction().apply(tank);
	}

}