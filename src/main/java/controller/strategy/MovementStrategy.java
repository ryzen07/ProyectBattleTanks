package controller.strategy;

import model.directions.Direction;

public abstract class MovementStrategy {

	public abstract Direction getNextDirection();

}