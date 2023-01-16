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

public class PlayerTwo implements KeyListener {

	private final Movable tanktwo;
	private static final Map<Integer, Direction> KEY_TRANSLATOR = new HashMap<>();

	static {
		KEY_TRANSLATOR.put(KeyEvent.VK_NUMPAD1, new Left());
		KEY_TRANSLATOR.put(KeyEvent.VK_NUMPAD3, new Right());
		KEY_TRANSLATOR.put(KeyEvent.VK_NUMPAD5, new Up());
		KEY_TRANSLATOR.put(KeyEvent.VK_NUMPAD2, new Down());
	} // usar singleton

	public PlayerTwo(Movable tanktwo) {
		this.tanktwo = tanktwo;
		// chronometer.addObserver(chronometerView);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Integer key = e.getKeyCode();
		if (KEY_TRANSLATOR.containsKey(key)) {
			tanktwo.setDirection(KEY_TRANSLATOR.get(key));
			tanktwo.setHasToMove(true);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
