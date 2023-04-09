package model;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import model.directions.Down;

public class TankTest {

	@Test
	public void whenTankShootThenABulletIsCreated() {
		Tank tank = new Tank(4, 3, Down.getInstance());
		Bullet bullet = tank.shoot();
		assertNotNull(bullet);
	}
}