package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

import model.Tank;
import model.directions.Direction;
import model.directions.Down;
import model.directions.Left;
import model.directions.Right;
import model.directions.Up;

public class Player implements KeyListener {

	private final Tank tank;
	private static final Map<Integer, Direction> KEY_TRANSLATOR = new HashMap<>();

	public Player(Tank tank) {
		fillDirections();
		this.tank = tank;
		// chronometer.addObserver(chronometerView);
	}

	private void fillDirections() {
		KEY_TRANSLATOR.put(KeyEvent.VK_LEFT, new Left());
		KEY_TRANSLATOR.put(KeyEvent.VK_RIGHT, new Right());
		KEY_TRANSLATOR.put(KeyEvent.VK_UP, new Up());
		KEY_TRANSLATOR.put(KeyEvent.VK_DOWN, new Down());
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Integer key = e.getKeyCode();
		if (KEY_TRANSLATOR.containsKey(key)) {
			tank.move(KEY_TRANSLATOR.get(key));
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
