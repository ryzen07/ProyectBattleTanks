package model;

public class Tank extends Movable {

	public static final int MAJOR_RADIUS = 2;
	public static final int MINOR_RADIUS = 1;

	// private final boolean allied;
	// private final int life;

	// private arrayList<powerup()> activePower;

	/*
	 * public Tank(boolean allied, int life, Direction direction, int x, int y) {
	 * super(new Position(x, y), HEIGHT, WIDTH); this.allied = allied; this.life =
	 * life; }
	 */

	public Tank(Direction direction, int x, int y) {
		super(new Position(x, y), MAJOR_RADIUS, MINOR_RADIUS, direction);
	}

	/*
	 * public int getLife() { return life; }
	 */

	public Bullet shoot() {
		return new Bullet(new Position(2, 3), Direction.UP);

	}

	public Position getCenter() {
		return center;
	}

	public void setCenter(Position center) {
		this.center = center;
	}

	@Override
	public String toString() {
		return "x";
	}
}