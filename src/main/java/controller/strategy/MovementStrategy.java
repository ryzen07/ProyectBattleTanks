package controller.strategy;

import model.actions.Action;

public abstract class MovementStrategy {

	public abstract Action getNextAction();
}