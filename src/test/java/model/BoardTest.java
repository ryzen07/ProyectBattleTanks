package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BoardTest {
	@Test
	public void addedTankDirectionUp() throws EntityOutOfRange {
		Board board = new Board();
		Tank tank = new Tank(Direction.UP, 2, 2);
		board.add(tank);
		checkTankPosition(tank, board);
	}

	@Test
	public void addedTankDirectionDown() throws EntityOutOfRange {
		Board board = new Board();
		Tank tank = new Tank(Direction.DOWN, 2, 2);
		board.add(tank);
		checkTankPosition(tank, board);
	}

	@Test
	public void addedTankDirectionRight() throws EntityOutOfRange {
		Board board = new Board();
		Tank tank = new Tank(Direction.RIGHT, 2, 2);
		board.add(tank);
		checkTankPosition(tank, board);
	}

	@Test
	public void addedTankDirectionLeft() throws EntityOutOfRange {
		Board board = new Board();
		Tank tank = new Tank(Direction.LEFT, 2, 2);
		board.add(tank);
		checkTankPosition(tank, board);
	}

	@Test(expected = EntityOutOfRange.class)
	public void whenTankIsAddedOutOfRangeThenThrowException() throws EntityOutOfRange {
		Board board = new Board();
		Tank tank = new Tank(Direction.UP, 8, 8);
		board.add(tank);
	}

	public void checkTankPosition(Tank tank, Board board) throws EntityOutOfRange {
		board.add(tank);
		int count = 0;
		for (int i = tank.center.getX() - tank.getXRadius(); i <= tank.center.getX() + tank.getXRadius(); i++) {
			for (int j = tank.center.getY() - tank.getYRadius(); j <= tank.center.getY() + tank.getYRadius(); j++) {
				assertTrue(board.get(tank.getYRadius(), tank.getXRadius()).contains(tank));
				count++;
			}
		}
		assertEquals((tank.getXRadius() * 2 + 1) * (tank.getYRadius() * 2 + 1), count);
	}
}