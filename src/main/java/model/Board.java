package model;

public class Board {
	public static final int SQUARE_HEIGHT = 10;
	public static final int SQUARE_WIDTH = 10;
	Square matrix[][] = new Square[SQUARE_HEIGHT][SQUARE_WIDTH];

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

	public void add(Entity entity) {
		checkInBoardBounds(entity);
		for (int i = entity.getMinorX(); i <= entity.getMayorX(); i++) {
			for (int j = entity.getMinorY(); j <= entity.getMayorY(); j++) {
				matrix[i][j].add(entity);
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
				builder.append(square.toString());
			}
			builder.append("\n");
		}
		return builder.toString();
	}
}