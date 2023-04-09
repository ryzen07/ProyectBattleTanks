package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.directions.Down;
import model.directions.Left;
import model.directions.Right;
import model.directions.Up;

public class BoardTest {
	@Test
	public void addedTankDirectionUp() {
		Board board = new Board();
		Tank tank = new Tank(4, 4, Up.getInstance());
		board.appendEntity(tank);
		checkTankPosition(tank, board);
	}

	@Test
	public void addedTankDirectionDown() {
		Board board = new Board();
		Tank tank = new Tank(4, 4, Down.getInstance());
		board.appendEntity(tank);
		checkTankPosition(tank, board);
	}

	@Test
	public void addedTankDirectionRight() {
		Board board = new Board();
		Tank tank = new Tank(8, 8, Right.getInstance());
		board.appendEntity(tank);
		checkTankPosition(tank, board);
	}

	@Test
	public void addedTankDirectionLeft() {
		Board board = new Board();
		Tank tank = new Tank(4, 4, Left.getInstance());
		board.appendEntity(tank);
		checkTankPosition(tank, board);
	}

	@Test(expected = EntityOutOfRangeException.class)
	public void whenTankIsAddedOutOfRangeThenThrowException() {
		Board board = new Board();
		Tank tank = new Tank(Constants.SQUARE_WIDTH - Tank.MAJOR_RADIUS, Constants.SQUARE_HEIGHT - Tank.MINOR_RADIUS,
				Up.getInstance());
		board.appendEntity(tank);
	}

	public void checkTankPosition(Tank tank, Board board) {
		board.appendEntity(tank);
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