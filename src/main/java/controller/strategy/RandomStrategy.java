package controller.strategy;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import model.actions.Action;
import model.actions.Movement;
import model.directions.Direction;

public class RandomStrategy extends MovementStrategy {

	private final Random randomGenerator;
	private static final List<Action> ACTIONS;
	static {
		ACTIONS = Direction.getDirections().stream().map(Movement::new).collect(Collectors.toList());
		// ACTIONS.add(new Shoot(null));
	}

	public RandomStrategy(long seed) {
		randomGenerator = new Random(seed);
	}

	public RandomStrategy() {
		randomGenerator = new Random();
	}

	@Override
	public Action getNextAction(Direction direction) {
		int randomValue = randomGenerator.nextInt(ACTIONS.size());
		return ACTIONS.get(randomValue);
	}
}

// pido las direcciones, recorro cada una y para cada direccion hago new
// movement
// con la direccion como parametro y eso lo mando a una lista
// stream tiene la funcion map y el map para cada uno de los elemntos que itera
// y para cada elemento que aplica algo
// aplica lo mismo que tenias pero con esa funcion aplicada, un new movement de
// cada uno de los elementos
// "movement::new" aplica el metodo new de movement, lo unico q recibe por
// parametro es el elemento, en vez de movement::new podrias
// haber puesto: d -> new Movement(d)