package model;

public class Level {

	Tank tank = new Tank(11, 21);

	Board map = new Board();

	public void mapAdd() {
		map.add(tank);
	}

	public Tank getTank() {
		return tank;
	}

}
