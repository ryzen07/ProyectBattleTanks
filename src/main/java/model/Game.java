package model;

import controller.Player;
import view.Window;

public class Game {
	private static final Game game = new Game();

	private Game() {
		Level level = new Level();
		Tank tank = level.getTank();
		Window window = new Window(tank);
		Player player = new Player(tank);
		tank.addObserver(window.getTankView());
		window.addKeyListener(player);
		window.setVisible(true);
	}

	public static Game getInstance() {
		return game;
	}
}
