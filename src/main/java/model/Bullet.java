package model;

import java.util.Observable;
import java.util.Observer;

import model.directions.Direction;

public class Bullet extends Movable implements Observer {

	public static final int RADIUS = 0;
	private static final int SPEED = 1;

	public Bullet(Position position, Direction direction) {
		super(position, RADIUS, RADIUS, SPEED, direction);
	}

	@Override
	public String toString() {
		return "b";
	}

	@Override
	public void update(Observable o, Object arg) {
		move();
	}
}