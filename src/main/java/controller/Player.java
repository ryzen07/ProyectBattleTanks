package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

import model.Tank;
import model.actions.Action;
import model.actions.Movement;
import model.actions.Shoot;
import model.directions.Down;
import model.directions.Left;
import model.directions.Right;
import model.directions.Up;

public class Player implements KeyListener {

	private final Tank tank;
	public static final Map<Integer, Action> KEY_TRANSLATOR = new HashMap<>();
	public static final Map<Integer, Action> KEY_TRANSLATOR_SECONDARY = new HashMap<>();
	private final Map<Integer, Action> keyTranslator;

	static {
		KEY_TRANSLATOR.put(KeyEvent.VK_LEFT, new Movement(new Left()));
		KEY_TRANSLATOR.put(KeyEvent.VK_RIGHT, new Movement(new Right()));
		KEY_TRANSLATOR.put(KeyEvent.VK_UP, new Movement(new Up()));
		KEY_TRANSLATOR.put(KeyEvent.VK_DOWN, new Movement(new Down()));
		KEY_TRANSLATOR.put(KeyEvent.VK_SPACE, new Shoot());
		KEY_TRANSLATOR_SECONDARY.put(KeyEvent.VK_NUMPAD5, new Movement(new Left()));
		KEY_TRANSLATOR_SECONDARY.put(KeyEvent.VK_NUMPAD3, new Movement(new Right()));
		KEY_TRANSLATOR_SECONDARY.put(KeyEvent.VK_NUMPAD5, new Movement(new Up()));
		KEY_TRANSLATOR_SECONDARY.put(KeyEvent.VK_NUMPAD2, new Movement(new Down()));
		KEY_TRANSLATOR.put(KeyEvent.VK_BACK_SPACE, new Shoot());
	} // usar singleton

	public Player(Tank tank, Map<Integer, Action> keyTranslator2) {
		this.tank = tank;
		keyTranslator = keyTranslator2;
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
			keyTranslator.get(key).apply(tank);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}