package model;

import java.util.Collection;
import java.util.HashSet;

public class Board {

	Square matrix[][] = new Square[Constants.SQUARE_HEIGHT][Constants.SQUARE_WIDTH];
	Collection<Entity> entities = new HashSet<>();

	public Board() {
		for (int i = 0; i < Constants.SQUARE_HEIGHT; i++) {
			for (int j = 0; j < Constants.SQUARE_WIDTH; j++) {
				matrix[i][j] = new Square();
			}
		}
	}

	/*
	 * public boolean isInBoardBounds(Entity entity) { return !(entity.getMinorY() <
	 * 0 || entity.getMinorX() < 0 || entity.getMayorY() >= SQUARE_HEIGHT ||
	 * entity.getMayorX() >= SQUARE_WIDTH); }
	 */

	/*
	 * public boolean isInBoardBounds(Entity entity) { if (entity.getMinorY() > 0 ||
	 * entity.getMinorX() > 0 || entity.getMayorY() >= SQUARE_HEIGHT ||
	 * entity.getMayorX() >= SQUARE_WIDTH) { entity.setMove(true);
	 * System.out.print("asd"); return true; } entity.setMove(false); return false;
	 * }
	 */

	public boolean isInBoardBounds(Entity entity) {
		if (entity.getMinorX() > 0) {
			System.out.println("hola");
		}
		entity.setMove(false);
		return false;
	}

	public void checkInBoardBounds(Entity entity) {
		if (!isInBoardBounds(entity)) {
			throw new EntityOutOfRangeException();
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