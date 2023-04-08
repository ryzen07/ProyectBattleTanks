package model;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import model.directions.Direction;

public class TankTest {

	@Test
	public void whenTankShootThenABulletIsCreated() {
		Tank tank = new Tank(4, 3, Direction.getDownDirection());
		Bullet bullet = tank.shoot();
		assertNotNull(bullet);
	}
}