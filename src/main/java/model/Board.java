package model;

public class Board {
	Square matrix[][] = new Square[10][10];

	public Board() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				matrix[i][j] = new Square();
			}
		}
	}

	public void add(Entity entity) throws EntityOutOfRange {
		if (entity.getMinorX() < 0 || entity.getMinorY() < 0 || entity.getMayorX() > 10 || entity.getMayorX() > 10) {
			throw new EntityOutOfRange();
		}
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