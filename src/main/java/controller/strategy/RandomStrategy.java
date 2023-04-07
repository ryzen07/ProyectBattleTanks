package controller.strategy;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

import model.directions.Direction;

public class RandomStrategy extends MovementStrategy {

	private final Collection<Direction> directions = new HashSet<>();

	public Collection<Direction> getdirections() {
		return directions;
	}

	private <Direction> model.directions.Direction getRandomDirection(
			Collection<model.directions.Direction> collection) {
		int randomValue = new Random().nextInt(collection.size());

		int index = 0;
		model.directions.Direction randomElement = null;

		for (model.directions.Direction element : collection) {
			randomElement = element;

			if (index == randomValue) {
				return randomElement;
			}

			index++;
		}
		return randomElement;
	}

	@Override
	public void moveMovable() {
		getRandomDirection(getdirections());
	}
}
