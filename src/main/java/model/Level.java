package model;

import model.directions.Down;
import model.directions.Up;

public class Level {
	private final Tank tank = new Tank(7, 7, Up.getInstance());
	private final Tank tanktwo = new Tank(14, 14, Up.getInstance());
	private final Tank tankBot = new Tank(20, 20, Down.getInstance());
	private final Wall wall = new Wall(1, 1);
	private final Water water = new Water(3, 4);
	private final Eagle eagle = new Eagle(8, 1);
	private final Board map = new Board();

	public Level() {
		map.appendEntity(tank);
		map.appendEntity(tanktwo);
		map.appendEntity(wall);
		map.appendEntity(water);
		map.appendEntity(eagle);
		map.appendEntity(tankBot);
	}

	public Board getMap() {
		return map;
	}

	public Tank getTank() {
		return tank;
	}

	public Tank getTankTwo() {
		return tanktwo;
	}

	public Tank getTankBot() {
		return tankBot;
	}

}