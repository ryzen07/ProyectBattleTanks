package model;

import controller.player.PlayerBot;
import controller.player.PlayerHuman;
import controller.strategy.RandomStrategy;
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
		Tank tank = level.getTank();
		Tank tanktwo = level.getTankTwo();
		Tank tankBot = level.getTankBot();
		Board board = level.getMap();
		Window window = new Window(tank, board);
		PlayerHuman player = new PlayerHuman(tank, PlayerHuman.KEY_TRANSLATOR);
		PlayerHuman playertwo = new PlayerHuman(tanktwo, PlayerHuman.KEY_TRANSLATOR_SECONDARY);
		PlayerBot playerBot = new PlayerBot(new RandomStrategy(), tankBot);
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