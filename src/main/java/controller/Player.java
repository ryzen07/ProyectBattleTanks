package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

import model.Board;
import model.Direction;
import model.Tank;

public class Player implements KeyListener {

	private final Tank tank;
	private final Board board = new Board();
	private final Map<Integer, Direction> directions = new HashMap<>();

	public Player(Tank tank) {
		fillDirections();
		this.tank = tank;
		// chronometer.addObserver(chronometerView);
	}

	private void fillDirections() {
		directions.put(KeyEvent.VK_LEFT, Direction.LEFT);
		directions.put(KeyEvent.VK_RIGHT, Direction.RIGHT);
		directions.put(KeyEvent.VK_UP, Direction.UP);
		directions.put(KeyEvent.VK_DOWN, Direction.DOWN);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		Integer key = e.getKeyCode();
		if (directions.containsKey(key) && board.checkTankInBoardBounds(tank)) {
			tank.move(directions.get(key));
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
