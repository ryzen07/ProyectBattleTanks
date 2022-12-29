package controller;

import model.Game;

public class Controller {

	public Controller() {
		Game game = new Game();
		game.Initialize();
	}

	public void run() throws InterruptedException {
		// System.out.println(map);
		while (true) {
			update();
			Thread.sleep(1000);
		}
	}

	public void update() throws InterruptedException {
		// map.update();
	}
}