package model;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TankTest {

	@Test
	public void whenTankShootThenABulletIsCreated() {
		Tank tanks = new Tank(Direction.DOWN, 4, 3);
		Bullet bullet = tanks.shoot();
		assertNotNull(bullet);
	}
}

//@Test(expected = Exception.class)
//public void whenTankIsCreatedWithNegativeLifeThenItShoudThrowAnException() throws Exception {
//	Tank tank = new Tank(true,-5);
//}
