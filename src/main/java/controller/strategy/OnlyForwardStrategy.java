package controller.strategy;

import model.directions.Direction;

public class OnlyForwardStrategy extends MovementStrategy {

	@Override
	public Direction getNextDirection() {
		return null;
		// TODO Auto-generated method stub

	}

}
//strategy setea nueva la direccion, el playerBot controla el tiempo de cada cuanto pedir la estrategia random de movimiento. La humana es con teclas