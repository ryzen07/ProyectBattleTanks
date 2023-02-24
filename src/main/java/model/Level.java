package model;

import model.directions.Up;

public class Level {
	Movable tank = new Tank(7, 7, new Up());
	Tank tanktwo = new Tank(14, 14, new Up());
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

	public Movable getTank() {
		return tank;
	}

	public Movable getTankTwo() {
		return tanktwo;
	}
}
