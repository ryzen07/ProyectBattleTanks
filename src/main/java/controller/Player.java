package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

import model.Direction;
import model.Tank;
import view.Window;

public class Player implements KeyListener {

	private final Window window;
	private final Tank tank;
	private final Map<Integer, Direction> directions = new HashMap<>();

	public Player(Tank tank, Window window) {
		fillDirections();
		this.window = window;
		this.tank = tank;
		tank.addObserver(window.getCarView());
		window.addKeyListener(this);
		window.setVisible(true);
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
		if (directions.containsKey(key)) {
			tank.move(directions.get(key));
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
