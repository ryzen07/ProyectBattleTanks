package model;

import model.directions.Up;

public class Level {

	Movable tank = new Tank(7, 7, new Up());
	Tank tanktwo = new Tank(14, 14, new Up());
	Board map = new Board();

	public Level() {
		map.appendEntity(tank);
	}

	public Board getMap() {
		return map;
	}

	public void refreshMap() {
		map.removeEntity(tank);
		if (map.checkInBoardBounds(tank.getPotentialMinorX(), tank.getPotentialMajorX(), tank.getPotentialMinorY(),
				tank.getPotentialMajorY())) {
			tank.move();
		}
		map.appendEntity(tank);

		map.removeEntity(tanktwo);
		if (map.checkInBoardBounds(tanktwo.getPotentialMinorX(), tanktwo.getPotentialMajorX(),
				tanktwo.getPotentialMinorY(), tanktwo.getPotentialMajorY())) {
			tanktwo.move();
		}
		map.appendEntity(tanktwo);
	}

	public Movable getTank() {
		return tank;
	}

	public Movable getTankTwo() {
		return tanktwo;
	}
}
