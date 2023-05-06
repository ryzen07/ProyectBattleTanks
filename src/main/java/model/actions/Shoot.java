package model.actions;

import model.Bullet;
import model.Game;
import model.Movable;

public class Shoot implements Action {

	@Override
	public void apply(Movable movable) {
		Bullet bullet = movable.shoot();
		Game.getInstance().getLevel().getMap().appendEntity(bullet);
	}
}