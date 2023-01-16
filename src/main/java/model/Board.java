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

	public boolean checkInBoardBounds(int minorX, int mayorX, int minorY, int mayorY) {
		if (minorX < 0) {
			return false;
		}
		if (mayorX > Constants.LIMIT_MAJOR_X - 1) {
			return false;
		}
		if (minorY < 0) {
			return false;
		}
		if (mayorY > Constants.LIMIT_MAJOR_Y - 1) {
			return false;
		}
		return true;
	}

	public void appendEntity(Entity entity) {
		if (checkInBoardBounds(entity.getMinorX(), entity.getMajorX(), entity.getMinorY(), entity.getMajorY())) {
			for (int x = entity.getMinorX(); x <= entity.getMajorX(); x++) {
				for (int y = entity.getMinorY(); y <= entity.getMajorY(); y++) {
					matrix[x][y].add(entity);
				}
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
		StringBuilder sb = new StringBuilder();
		for (int i = matrix[0].length - 1; i >= 0; i--) {
			for (Square[] element : matrix) {
				sb.append(element[i]).append(" ");
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