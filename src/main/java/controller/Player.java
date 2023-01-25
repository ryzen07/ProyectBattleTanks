package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

import model.Movable;
import model.directions.Direction;
import model.directions.Down;
import model.directions.Left;
import model.directions.Right;
import model.directions.Up;

public class Player implements KeyListener {

	private final Movable tank;
	public static final Map<Integer, Direction> KEY_TRANSLATOR = new HashMap<>();
	public static final Map<Integer, Direction> KEY_TRANSLATOR_SECONDARY = new HashMap<>();
	private final Map<Integer, Direction> keyTranslator;

	static {
		KEY_TRANSLATOR.put(KeyEvent.VK_LEFT, new Left());
		KEY_TRANSLATOR.put(KeyEvent.VK_RIGHT, new Right());
		KEY_TRANSLATOR.put(KeyEvent.VK_UP, new Up());
		KEY_TRANSLATOR.put(KeyEvent.VK_DOWN, new Down());

		KEY_TRANSLATOR_SECONDARY.put(KeyEvent.VK_1, new Left());
		KEY_TRANSLATOR_SECONDARY.put(KeyEvent.VK_3, new Right());
		KEY_TRANSLATOR_SECONDARY.put(KeyEvent.VK_5, new Up());
		KEY_TRANSLATOR_SECONDARY.put(KeyEvent.VK_2, new Down());
	} // usar singleton

	public Player(Movable tank, Map<Integer, Direction> keyTranslator) {
		this.tank = tank;
		this.keyTranslator = keyTranslator;
		// chronometer.addObserver(chronometerView);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Integer key = e.getKeyCode();
		if (keyTranslator.containsKey(key)) {
			tank.setDirection(keyTranslator.get(key));
			tank.move();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}