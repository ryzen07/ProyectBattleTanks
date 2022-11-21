package model;

public class Board {
	Square matrix[][] = new Square[6][6];
	Tank tank = new Tank(Direction.UP, 2, 2);

	public Board() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				matrix[i][j] = new Square();
				if (i == tank.getCenter().getX() && j == tank.getCenter().getY()) {
					matrix[i][j].add(tank);
					// System.out.println(printPosition(tank));
				}
			}
		}
	}

	/*
	 * public void add(Entity entity) { for (int i = entity.center.getX() -
	 * entity.height / 2; i > entity.center.getX() + entity.height / 2; i++) { for
	 * (int j = entity.center.getY(); j - 1 > entity.width; j++) {
	 * matrix[i][j].add(entity); } } }
	 */

	/*
	 * public Square printPosition(Tank tank) { Square position = null; for (int i =
	 * 0; i < 6; i++) { for (int j = 0; j < 6; j++) { matrix[i][j] = new Square(); i
	 * = tank.height; j = tank.width; position = matrix[i][j]; } } return position;
	 * }
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
}