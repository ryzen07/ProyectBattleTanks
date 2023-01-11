package model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Observable;

public class Board extends Observable {

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
	 * 0 || entity.getMinorX() < 0 || entity.getMajorY() >= SQUARE_HEIGHT ||
	 * entity.getMajorX() >= SQUARE_WIDTH); }
	 */

	/*
	 * public boolean isInBoardBounds(Entity entity) { if (entity.getMinorY() > 0 ||
	 * entity.getMinorX() > 0 || entity.getMajorY() >= SQUARE_HEIGHT ||
	 * entity.getMajorX() >= SQUARE_WIDTH) { entity.setMove(true);
	 * System.out.print("asd"); return true; } entity.setMove(false); return false;
	 * }
	 */

	public void checkInBoardBounds(Entity entity) {
		if (entity.getMinorX() < 0) {
			throw new EntityOutOfRangeException();
		}
	}

	public void appendEntity(Entity entity) {
		checkInBoardBounds(entity);
		for (int i = entity.getMinorX(); i <= entity.getMajorX(); i++) {
			for (int j = entity.getMinorY(); j <= entity.getMajorY(); j++) {
				matrix[i][j].add(entity);
			}
		}
	}

	public void removeEntity(Entity entity) {
		for (int i = entity.getMinorX(); i <= entity.getMajorX(); i++) {
			for (int j = entity.getMinorY(); j <= entity.getMajorY(); j++) {
				if (matrix[i][j].contains(entity)) {
					matrix[i][j].remove(entity);
				}
			}
		}
	}

	public Square get(int x, int y) {
		return matrix[x][y];
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Square[] row : matrix) {
			for (Square square : row) {
				if (!square.isEmpty()) {
				}
				builder.append(square.toString());
			}
			builder.append("\n");
		}
		return builder.toString();
	}
}

/*
 * remove recorriendo todo el mapa public void removeEntity(Entity entity) { for
 * (int i = 0; i < Constants.SQUARE_HEIGHT; i++) { for (int j = 0; j <
 * Constants.SQUARE_WIDTH; j++) { if (matrix[i][j].contains(entity)) {
 * matrix[i][j].remove(entity); } } } }
 */