package model;

public class Tank extends Movable {

	private static final int MAJORRADIUS = 2;
	private static final int MINORRADIUS = 1;
	// private final boolean allied;
	// private final int life;

	// private arrayList<powerup()> activePower;

	/*
	 * public Tank(boolean allied, int life, Direction direction, int x, int y) {
	 * super(new Position(x, y), HEIGHT, WIDTH); this.allied = allied; this.life =
	 * life; }
	 */

	public Tank(Direction direction, int x, int y) {
		super(new Position(x, y), MAJORRADIUS, MINORRADIUS, direction);
	}

	/*
	 * public int getLife() { return life; }
	 */

	public Bullet shoot() {
		return new Bullet();
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