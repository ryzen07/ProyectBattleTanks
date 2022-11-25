package model;

public class Board {
	Square matrix[][] = new Square[6][6];

	public Board() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				matrix[i][j] = new Square();
			}
		}
	}

	public void add(Entity entity) {
		for (int i = entity.center.getX(); i < entity.center.getX() + entity.majorradius; i++) {
			for (int j = entity.center.getY(); j > entity.minorradius; j++) l{
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