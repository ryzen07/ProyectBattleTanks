package model.actions;

import model.Tank;

public class Shoot implements Action {

	@Override
	public void apply(Tank tank) {
		tank.shoot();
	}
}