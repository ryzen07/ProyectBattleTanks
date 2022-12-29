package model;

public class Level {

	private ORIENTATION LEFT;

	Tank tank = new Tank(11, 21, LEFT);

	Board map = new Board();

	public void mapAdd() {
		map.add(tank);

	}

	public Tank getTank() {
		return tank;
	}

}
