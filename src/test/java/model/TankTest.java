package model;

import static org.junit.Assert.assertNotNull;

import model.directions.Down;
import org.junit.Test;

public class TankTest {

	@Test
	public void whenTankShootThenABulletIsCreated() {
		Bullet bullet = new Bullet(new Position(2,2),new Down());
		Tank tanks = new Tank(4, 3,new Down());
		tanks.shoot(bullet);
		assertNotNull(bullet);
	}
}
