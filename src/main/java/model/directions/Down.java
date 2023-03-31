package model.directions;

import model.Movable;
import model.Position;

public class Down extends Direction {

	@Override
	protected void move(Movable movable) {
		movable.decreaseCenterY();
		// aca se tiene que setear la direccion u orientacion o algun atributo de los
		// obj movable que va a definir para donde esta orientado. Entonces para donde
		// me
		// mueva en ese mismo movimiento apunto para esa direccion. Quien sabe cambiarlo
		// es la direction.

	}

	@Override
	public boolean isHorizontal() {
		return false;
	}

	@Override
	public Position getNextPotencialPosition(Movable movable) {

		return new Position(movable.getPosition().getX(), movable.getPosition().getY() - movable.getSpeed());
	}

}