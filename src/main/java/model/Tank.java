package model;

public class Tank extends Entity implements Movable {

	private static final int HEIGHT = 2;
	private static final int WIDTH = 3;
	// private final boolean allied;
	// private final int life;

	// private arrayList<powerup()> activePower;

	/*
	 * public Tank(boolean allied, int life, Direction direction, int x, int y) {
	 * super(new Position(x, y), HEIGHT, WIDTH); this.allied = allied; this.life =
	 * life; }
	 */

	public Tank(Direction direction, int x, int y) {
		super(new Position(x, y), HEIGHT, WIDTH);
	}

	public Tank(int x, int y) {
		super(new Position(x, y), HEIGHT, WIDTH);
	}

	/*
	 * public int getLife() { return life; }
	 */

	public Bullet shoot() {
		return new Bullet();
	}

	@Override
	public void move(Direction direction) {
		// TODO Auto-generated method stub
	}

	@Override
	public void collision() {
		// TODO Auto-generated method stub
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