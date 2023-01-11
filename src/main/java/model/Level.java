package model;

import model.directions.Up;

public class Level {

	Tank tank = new Tank(10, 10, new Up());

	Board map = new Board();

	public Level() {
		map.appendEntity(tank);
	}

	public Board getMap() {
		return map;
	}

	public void refreshMap() {
		map.removeEntity(tank);
		tank.move();
		map.appendEntity(tank);

	}

	public Tank getTank() {
		return tank;
	}

}
