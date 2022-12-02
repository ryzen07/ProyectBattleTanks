package model;

public class Movable extends Entity {
	private final Direction direction;

	public Movable(Position center, int majorRadius, int minorRadius, Direction direction) {
		super(center, majorRadius, minorRadius);
		this.direction = direction;
	}

	protected void move(Square[][] matriz, Movable entity, Direction direction) {

		for (int i = entity.getMinorX(); i <= entity.getMayorX(); i++) {
			for (int j = entity.getMinorY(); j <= entity.getMayorY(); j++) {
				if (direction.equals(Direction.RIGHT)) {
					matriz[i][j + 2].add(entity);
				}
				if (direction.equals(Direction.LEFT)) {
					matriz[i][j - 1].add(entity);
				}
				if (direction.equals(Direction.DOWN)) {
					matriz[i + 1][j].add(entity);
				}
				if (direction.equals(Direction.UP)) {
					matriz[i - 1][j].add(entity);
				}
			}
		}
	}

	protected void collision() {
	}

	protected Direction getDirection() {
		return direction;
	}

	@Override
	protected int getXRadius() {
		if (direction.equals(Direction.RIGHT) || direction.equals(Direction.LEFT)) {
			return super.getYRadius();
		}
		return super.getXRadius();
	}

	@Override
	protected int getYRadius() {
		if (direction.equals(Direction.UP) || direction.equals(Direction.DOWN)) {
			return super.getYRadius();
		}
		return super.getXRadius();
	}
}