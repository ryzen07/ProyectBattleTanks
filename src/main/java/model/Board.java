package model;

import java.util.Collection;
import java.util.HashSet;

public class Board {
	public static final int SQUARE_HEIGHT = 10;
	public static final int SQUARE_WIDTH = 10;
	Square matrix[][] = new Square[SQUARE_HEIGHT][SQUARE_WIDTH];
	Collection<Entity> entities = new HashSet<>();

	public Board() {
		for (int i = 0; i < SQUARE_HEIGHT; i++) {
			for (int j = 0; j < SQUARE_WIDTH; j++) {
				matrix[i][j] = new Square();
			}
		}
	}

	public void checkInBoardBounds(Entity entity) {
		if (entity.getMinorY() < 0 || entity.getMayorY() < 0 || entity.getMinorX() >= SQUARE_HEIGHT
				|| entity.getMayorX() >= SQUARE_WIDTH) {
			throw new EntityOutOfRange();
		}
	}

	private void appendEntity(Entity entity) {
		checkInBoardBounds(entity);
		for (int i = entity.getMinorX(); i <= entity.getMayorX(); i++) {
			for (int j = entity.getMinorY(); j <= entity.getMayorY(); j++) {
				matrix[i][j].add(entity);
			}
		}
	}

	public void removeEntity(Entity entity) {
		for (int i = entity.getMinorX(); i <= entity.getMayorX(); i++) {
			for (int j = entity.getMinorY(); j <= entity.getMayorY(); j++) {
				matrix[i][j].remove(entity);
			}
		}
	}

	public void moveByEntity(Movable entity) throws InterruptedException {
		checkInBoardBounds(entity);
		// ControllerOfEntityMovable controller = new
		// ControllerOfEntityMovable(entity.center);
		entity.move(Direction.RIGHT);
	}

	public Square get(int x, int y) {
		return matrix[x][y];
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Square[] row : matrix) {
			for (Square square : row) {
				builder.append(square.toString());
			}
			builder.append("\n");
		}
		return builder.toString();
	}

	public void update() {
		removeAll();
		moveAll();
		addAll();
	}

	public void add(Entity entity) {
		entities.add(entity);
		appendEntity(entity);
	}

	private void moveAll() {
		// tomar la lista de entidades y decirle a todas las entidades (las que se
		// puedan mover) que se muevan.
	}

	private void addAll() {
		for (Entity entity : entities) {
			appendEntity(entity);
		}
		// uso un foreach recorro toda la lista de entidades que deberia tener creada en
		// mi board,
		// en vez de pasarle una sola entidad (como tanque) le paso la lista.
		// Y con el addEntity voy agregando
	}

	private void removeAll() {
		// reemplazar toda la matriz, crear una matriz nueva.
	}
}