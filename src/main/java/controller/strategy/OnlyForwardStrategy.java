package controller.strategy;

import model.actions.Action;

public class OnlyForwardStrategy extends MovementStrategy {

	@Override
	public Action getNextAction() {
		return null;
		// TODO Auto-generated method stub
	}
}
//strategy setea nueva la direccion, el playerBot controla el tiempo de cada cuanto pedir la estrategia random de movimiento. La humana es con teclas