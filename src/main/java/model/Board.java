package model;

import java.util.Collection;
import java.util.HashSet;

public class Board {
	public static final int SQUARE_HEIGHT = 100;
	public static final int SQUARE_WIDTH = 100;
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

	public boolean checkTankInBoardBounds(Entity entity) {
		if (entity.getMinorY() > 0 && entity.getMayorY() > 0 && entity.getMinorX() > 0 && entity.getMayorX() < 0
				&& entity.getMinorY() < SQUARE_WIDTH && entity.getMayorY() < SQUARE_WIDTH
				&& entity.getMinorX() < SQUARE_HEIGHT && entity.getMayorX() < SQUARE_HEIGHT) {
			return true;
		} else {
			return false;
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

	/*
	 * public void move(Movable entity) throws InterruptedException {
	 * checkInBoardBounds(entity); // ControllerOfEntityMovable controller = new //
	 * // ControllerOfEntityMovable(entity.center); entity.move(Direction.RIGHT); }
	 */

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

	public void add(Entity entity) {
		entities.add(entity);
		appendEntity(entity);
	}

	private void addAll() {
		for (Entity entity : entities) {
			appendEntity(entity);

		}
	}
}