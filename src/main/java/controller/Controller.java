package controller;

import model.Board;
import model.Bullet;
import model.Direction;
import model.Position;
import model.Tank;
import view.Window;

public class Controller {
	Position position;
	Board map;
	Tank tank;
	Bullet bullet;
	Window window;
	Player player;

	public Controller() {
		createElements();
		addEntities();
	}

	public void run() throws InterruptedException {
		System.out.println(map);
		while (true) {
			update();
			Thread.sleep(1000);
		}
	}

	public void update() throws InterruptedException {
		map.update();
	}

	public void createElements() {
		map = new Board();
		tank = new Tank(Direction.UP, 5, 5);
		window = new Window(tank);
		player = new Player(tank, window);
	}

	public void addEntities() {
		map.add(tank);

	}
}
