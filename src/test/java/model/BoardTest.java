package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BoardTest {
	@Test
	public void whenTankWithDirectionUpIsAddedThenItIsPositionedProperly() throws EntityOutOfRange {
		Board board = new Board();
		Tank tank = new Tank(Direction.UP, 2, 2);
		int count = 0;
		board.add(tank);

		for (int i = tank.center.getX() - Tank.MAJOR_RADIUS; i <= tank.center.getX() + Tank.MAJOR_RADIUS; i++) {
			for (int j = tank.center.getY() - Tank.MINOR_RADIUS; j <= tank.center.getY() + Tank.MINOR_RADIUS; j++) {
				assertTrue(board.get(i, j).contains(tank));
				count++;
			}
		}
		assertEquals((Tank.MAJOR_RADIUS * 2 + 1) * (Tank.MINOR_RADIUS * 2 + 1), count);
	}

	@Test
	public void whenTankWithDirectionDownIsAddedThenItIsPositionedProperly() throws EntityOutOfRange {
		Board board = new Board();
		Tank tank = new Tank(Direction.DOWN, 2, 2);
		int count = 0;
		board.add(tank);

		for (int i = tank.center.getX() - Tank.MAJOR_RADIUS; i <= tank.center.getX() + Tank.MAJOR_RADIUS; i++) {
			for (int j = tank.center.getY() - Tank.MINOR_RADIUS; j <= tank.center.getY() + Tank.MINOR_RADIUS; j++) {
				assertTrue(board.get(i, j).contains(tank));
				count++;
			}
		}
		assertEquals((Tank.MAJOR_RADIUS * 2 + 1) * (Tank.MINOR_RADIUS * 2 + 1), count);
	}

	@Test
	public void whenTankWithDirectionRightIsAddedThenItIsPositionedProperly() throws EntityOutOfRange {
		Board board = new Board();
		Tank tank = new Tank(Direction.RIGHT, 2, 2);
		int count = 0;
		board.add(tank);

		for (int i = tank.center.getX() - Tank.MAJOR_RADIUS; i <= tank.center.getX() + Tank.MAJOR_RADIUS; i++) {
			for (int j = tank.center.getY() - Tank.MINOR_RADIUS; j <= tank.center.getY() + Tank.MINOR_RADIUS; j++) {
				assertTrue(board.get(j, i).contains(tank));
				count++;
			}
		}
		assertEquals((Tank.MAJOR_RADIUS * 2 + 1) * (Tank.MINOR_RADIUS * 2 + 1), count);
	}

	@Test
	public void whenTankWithDirectionLeftIsAddedThenItIsPositionedProperly() throws EntityOutOfRange {
		Board board = new Board();
		Tank tank = new Tank(Direction.LEFT, 2, 2);
		int count = 0;
		board.add(tank);

		for (int i = tank.center.getX() - Tank.MAJOR_RADIUS; i <= tank.center.getX() + Tank.MAJOR_RADIUS; i++) {
			for (int j = tank.center.getY() - Tank.MINOR_RADIUS; j <= tank.center.getY() + Tank.MINOR_RADIUS; j++) {
				assertTrue(board.get(j, i).contains(tank));
				count++;
			}
		}
		assertEquals((Tank.MAJOR_RADIUS * 2 + 1) * (Tank.MINOR_RADIUS * 2 + 1), count);
	}

	@Test(expected = EntityOutOfRange.class)
	public void whenTankIsAddedOutOfRangeThenThrowException() throws EntityOutOfRange {
		Board board = new Board();
		Tank tank = new Tank(Direction.UP, 12, 12);
		board.add(tank);
	}
}