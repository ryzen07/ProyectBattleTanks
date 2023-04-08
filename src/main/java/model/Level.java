package model;

import model.directions.Direction;

public class Level {
	Tank tank = new Tank(7, 7, Direction.getUpDirection());
	Tank tanktwo = new Tank(14, 14, Direction.getUpDirection());
	Wall wall = new Wall(1, 1);
	Water water = new Water(3, 4);
	Eagle eagle = new Eagle(8, 1);
	Board map = new Board();

	public Level() {
		map.appendEntity(tank);
		map.appendEntity(tanktwo);
		map.appendEntity(wall);
		map.appendEntity(water);
		map.appendEntity(eagle);
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
}