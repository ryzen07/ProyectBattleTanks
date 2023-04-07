package controller.strategy;

import java.util.List;
import java.util.Random;

import model.directions.Direction;

public class RandomStrategy extends MovementStrategy {

	private final Random randomGenerator;

	public RandomStrategy(long seed) {
		randomGenerator = new Random(seed);
	}

	public RandomStrategy() {
		randomGenerator = new Random();
	}

	private Direction getRandomDirection(List<Direction> directions) {
		int randomValue = randomGenerator.nextInt(directions.size());
		return directions.get(randomValue);
	}

	@Override
	public Direction getNextDirection() {
		return getRandomDirection(Direction.getDirections());
	}
}