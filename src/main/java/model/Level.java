package model;

import model.directions.Up;

public class Level {

	Tank tank = new Tank(7, 7, new Up());
	Tank tanktwo = new Tank(14, 14, new Up());
	Board map = new Board();

	public Level() {
		map.appendEntity(tank);
		map.appendEntity(tanktwo);
	}

	public Board getMap() {
		return map;
	}

	public void refreshMap() {
		map.removeEntity(tank);
		tank.move();
		map.appendEntity(tank);

		map.removeEntity(tanktwo);
		tanktwo.move();
		map.appendEntity(tanktwo);
	}

	public Tank getTank() {
		return tank;
	}

	public Tank getTankTwo() {
		return tanktwo;
	}
}
