package model;

import model.directions.Up;

public class Level {

<<<<<<< HEAD
	Movable tank = new Tank(7, 7, new Up());
=======
	Tank tank = new Tank(7, 7, new Up());
>>>>>>> 4c9231a (Se modifica tostring de la clase board(para que tenga correlacion el movimiento del tanque y como lo vemos en pantalla). Se modifican los metodos de la clase  movable que trabajan con los limites del mapa para que el tanque llegue a los limites y no pueda pasarse. Se modifica la posicion del metodo checkNextPositionToMove de la linea 42 a la 43 en la clase Tank. Se crea clase PlayerTwo y se agrega un segundo tanque. Se modifica clase Level para instanciar y agregar el segundo tanque)
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
