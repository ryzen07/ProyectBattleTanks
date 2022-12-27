package controller;

import model.Board;
import model.Game;

public class Controller {

	Board map;
	Game game;

	public Controller() {
		initialize();
	}

	public void run() throws InterruptedException {
		System.out.println(map);
		while (true) {
			update();
			Thread.sleep(1000);
		}
	}

	public void update() throws InterruptedException {
		// map.update();
	}

	public void initialize() {
		// game = Game.getInstance();
		game = new Game();
	}
}