package controller.strategy;

import model.actions.Action;
import model.actions.Movement;
import model.directions.Direction;

public class OnlyForwardStrategy extends MovementStrategy {

	@Override
	public Action getNextAction(Direction direction) {
		return new Movement(direction);
	}
}

//strategy setea nueva la direccion, el playerBot controla el tiempo de cada cuanto pedir la estrategia random de movimiento. La humana es con teclas