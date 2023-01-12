package model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Observable;

public class Board extends Observable {

	Square matrix[][] = new Square[Constants.SQUARE_HEIGHT][Constants.SQUARE_WIDTH];
	Collection<Entity> entities = new HashSet<>();

	public Board() {
		for (int x = 0; x < Constants.SQUARE_HEIGHT; x++) {
			for (int y = 0; y < Constants.SQUARE_WIDTH; y++) {
				matrix[x][y] = new Square();
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
		for (int x = entity.getMinorX(); x <= entity.getMajorX(); x++) {
			for (int y = entity.getMinorY(); y <= entity.getMajorY(); y++) {
				matrix[x][y].add(entity);
			}
		}
	}

	public void removeEntity(Entity entity) {
		for (int x = entity.getMinorX(); x <= entity.getMajorX(); x++) {
			for (int y = entity.getMinorY(); y <= entity.getMajorY(); y++) {
				if (matrix[x][y].contains(entity)) {
					matrix[x][y].remove(entity);
				}
			}
		}
	}

	public Square get(int x, int y) {
		return matrix[x][y];
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		for (int i = matrix[0].length - 1; i >= 0; i--) {
			for (Square[] element : matrix) {
				sb.append(element[i]).append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}