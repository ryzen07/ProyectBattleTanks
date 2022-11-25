package model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BoardTest {
	@Test
	public void insertion() {
		Board board = new Board();
		Tank tank = new Tank(Direction.UP, 2, 3);
		board.add(tank);
		assertTrue(board.get(2, 3).contains(tank));
		assertTrue(board.get(2, 1).contains(tank));
		assertTrue(board.get(2, 3).contains(tank));
		assertTrue(board.get(2, 1).contains(tank));
		assertTrue(board.get(2, 3).contains(tank));
		assertTrue(board.get(2, 1).contains(tank));

	}
}