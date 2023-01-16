package model;

import controller.Player;
import controller.PlayerTwo;
import view.Window;

public class Game {
	private static final Game game = new Game();
	private Level level;

	private Game() {

	}

	public static Game getInstance() {
		return game;
	}

	public void initialize() {
		level = new Level();
		Movable tank = level.getTank();
		Movable tanktwo = level.getTankTwo();
		Board board = level.getMap();
		Window window = new Window(tank, board);
		Player player = new Player(tank);
		PlayerTwo playertwo = new PlayerTwo(tanktwo);
		tank.addObserver(window.getTankView());
		tanktwo.addObserver(window.getTankView());
		board.addObserver(window.getBoardView());
		window.addKeyListener(player);
		window.addKeyListener(playertwo);
		window.setVisible(true);
	}

	public Level getLevel() {
		return level;
	}
}
