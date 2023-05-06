package controller.strategy;

import model.actions.Action;
import model.directions.Direction;

public abstract class MovementStrategy {

	public abstract Action getNextAction(Direction direction);
}